package Exercise1.functionalities;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class that refers to a functionality that optimizes the execution of the application avoiding rewriting code.
 * Exit exit = new Exit();
 *
 * @version 1.0.0 13/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class Exit {

    private final Scanner answer;
    private Boolean optionExit;
    private Boolean optionBoolean;

    /**
     * constructor method that initializes the attributes.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Exit() {
        this.answer = new Scanner(System.in);
        this.optionExit = true;
        this.optionBoolean = false;
    }

    /**
     *Method that executes a control flow to repeat a functionality.
     *
     * @return The value of a Boolean attribute.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Boolean exitShowObjects() {
        do {
            try {
                System.out.println("""
                        What do you want to do?\s
                        1.Repeat menu.\s
                        Any other number: to exit to the gravitational forces menu.""");
                int optionShowObjects = answer.nextInt();
                if (optionShowObjects == 1) {
                    optionBoolean = true;
                    optionExit = false;
                }else {
                    optionBoolean = false;
                    optionExit = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Non-numerical option, enter a number from the menu");
                answer.next();
                optionExit = true;
            }
        }while (optionExit);
        return optionBoolean;
    }
}
