package Exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class that serves as the application executor.
 *
 * @version 1.0.0 14/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class UserApp {

    /**
     * Java main method where the application is executed
     * The control flows use the attributes to perform the queries and display the information.
     * @param args arguments of the main.java class
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public static void main(String[] args) {

        int quantity = 0;
        boolean exit;
        Scanner scanner = new Scanner(System.in);

        do {
            exit = false;
            try {
                System.out.println("How many numbers do you wish to enter?");
                quantity = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Non-numeric value");
                scanner.next();
                exit = true;
            }
        } while (exit);

        Number vectorNumber = new Number();
        vectorNumber.addNumbers(quantity);
        System.out.println(vectorNumber.toString());
    }
}
