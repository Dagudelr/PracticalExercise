package Exercise6;

import java.util.Scanner;
import java.util.Vector;

/**
 * Class that references a vector of numbers.
 *
 * @version 1.0.0 15/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class Number {

    private Scanner scanner = new Scanner(System.in);
    private Vector<Integer> number;

    /**
     * Construct that initializes the vector.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Number() {
        number = new Vector<Integer>();
    }

    /**
     * Method that adds the numbers to the vector.
     *
     * @param quantity number of numbers to be entered in the vector.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public void addNumbers(int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter a number");
            Integer numberOption = scanner.nextInt();
            number.add(numberOption);
            if (i >= 1) {
                if(number.get(i) == number.get(i-1)) {
                    break;
                }
            }
        }
    }

    /**
     * Method that displays the vector.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "\nNumber{" +
                "\nNumbers=" + number + "\n" +
                '}';
    }
}
