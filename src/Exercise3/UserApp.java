package Exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class that refers to the execution of the application.
 *
 * @version 1.0.0 13/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class UserApp {

    /**
     * Java main method where the application is executed
     *The control flows use the static attributes to perform the queries and display the information.
     *
     * @param args arguments of the main.java class
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        Boolean exitArraySize = false;
        Boolean exitSorting;
        System.out.println("Welcome, here you can order arrays that are automatically generated.");
        do{
            try {
                System.out.println("What size list do you want?");
                int arraySize = answer.nextInt();
                do{
                    try {
                        System.out.println("Which ordering method do you want: \n1. Bubble Method" +
                                "\n2.Quick Sort Method. \nAny other number: Choose another arrangement size.");
                        int choice = answer.nextInt();
                        if (choice == 1) {
                            CalculateSorting Bubble = new CalculateSorting(arraySize);
                            Bubble.assigningNumber();
                            Bubble.BubbleMethod();
                            System.out.println(Bubble.toString());
                            exitSorting = false;
                            exitArraySize = false;
                        } else if(choice == 2) {
                            CalculateSorting quick = new CalculateSorting(arraySize);
                            quick.assigningNumber();
                            quick.quickSort(quick.getNumbers(), 0, quick.getNumbers().length-1);
                            System.out.println(quick.toString());
                            exitSorting = false;
                            exitArraySize = false;
                        } else {
                            exitSorting = false;
                            exitArraySize = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Non-numerical option, enter a number from the menu");
                        answer.next();
                        exitSorting = true;
                    }
                }while (exitSorting);
            } catch (InputMismatchException e) {
                System.out.println("Non-numerical option, enter a number from the menu");
                answer.next();
                exitArraySize = true;
            }
        }while (exitArraySize);
    }
}
