package Exercise1;

import Exercise1.functionalities.Calculate;
import Exercise1.functionalities.Exit;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class that refers to the application that the user executes.
 *
 * @version 1.0.0 13/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class UserApp {

    /**
     * attribute that refers to the instance of the Exit class that serves as functionality.
     *
     * @since 1.0.0
     */
    private final static Exit exitMenu;
    /**
     * Static block, initializes the static attributes.
     *
     * @since 1.0.0
     */
    private final static Calculate calculate;
    /**
     * attribute that refers to the instance of to Calculate class that serves as functionality.
     *
     * @since 1.0.0
     */
    private final static Scanner answer;
    /**
     * Static block, initializes the static attributes.
     *
     * @since 1.0.0
     */
    private final static CelestialObjects star;
    /**
     * References an instance of the class CelestialObjects
     *
     * @since 1.0.0
     */
    private final static CelestialObjects planet1;
    /**
     * References an instance of the class CelestialObjects
     *
     * @since 1.0.0
     */
    private final static CelestialObjects planet2;
    /**
     * References an instance of the class CelestialObjects
     *
     * @since 1.0.0
     */
    private final static CelestialObjects planet3;
    /**
     * References an instance of the class CelestialObjects
     *
     * @since 1.0.0
     */
    private final static CelestialObjects planet4;
    /**
     * References an instance of the class CelestialObjects
     *
     * @since 1.0.0
     */
    private final static CelestialObjects planet5;
    /**
     * References an instance of the class CelestialObjects
     *
     * @since 1.0.0
     */
    private final static CelestialObjects planet6;
    /**
     * References an instance of the class CelestialObjects
     *
     * @since 1.0.0
     */
    private final static CelestialObjects planet7;
    /**
     * References an instance of the class CelestialObjects
     *
     * @since 1.0.0
     */
    private final static CelestialObjects planet8;

    /**
     * References an instance of the class CelestialObjects.
     *
     * @since 1.0.0
     */
    static {
        exitMenu = new Exit();
        calculate = new Calculate();
        answer = new Scanner(System.in);
        star = new CelestialObjects("Sun", 1.989E30, 1.41,0.0, 1392000);
        planet1 = new CelestialObjects("Mercury", 3.285E23, 5.43,0.39, 4879);
        planet2 = new CelestialObjects("Venus", 4.867E24, 5.24,0.72, 12104);
        planet3 = new CelestialObjects("Earth", 5.972E24, 5.51,1.0, 12742);
        planet4 = new CelestialObjects("Mars", 6.39E23, 3.93,1.52, 6779);
        planet5 = new CelestialObjects("Jupiter", 1.89827E27, 1.33,5.20, 139820);
        planet6 = new CelestialObjects("Saturn", 5.683E26, 1.21,9.54, 116460);
        planet7 = new CelestialObjects("Uranus", 8.681E25, 1.27,19.19, 50724);
        planet8 = new CelestialObjects("Neptune", 1.024E26, 1.64,30.06, 49244);
    }

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
        System.out.println("Welcome, would you like to see information about any celestial object in the solar system?");
        Boolean optionBoolean;
        do {
            try {
                System.out.println("1.Sun. \n2.Mercury. \n3.Venus. \n4.Earth." +
                        " \n5.Mars. \n6.Jupiter. \n7.Saturn. \n8.Uranus. " +
                        "\n9.Neptune. \nany other number: Continue to calculate their gravitational forces.");
                int optionShowObjects = answer.nextInt();
                switch (optionShowObjects) {
                    case 1 -> {
                        System.out.println(star.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    case 2 -> {
                        System.out.println(planet1.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    case 3 -> {
                        System.out.println(planet2.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    case 4 -> {
                        System.out.println(planet3.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    case 5 -> {
                        System.out.println(planet4.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    case 6 -> {
                        System.out.println(planet5.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    case 7 -> {
                        System.out.println(planet6.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    case 8 -> {
                        System.out.println(planet7.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    case 9 -> {
                        System.out.println(planet8.toString());
                        optionBoolean = exitMenu.exitShowObjects();
                    }
                    default -> optionBoolean = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Non-numerical option, enter a number from the menu");
                answer.next();
                optionBoolean = true;
            }
        } while (optionBoolean);

        do {
            try {
                System.out.println("1.Sun. \n2.Mercury. \n3.Venus. \n4.Earth. \n5.Mars. \n6.Jupiter." +
                        " \n7.Saturn. \n8.Uranus. " +
                        "\n9.Neptune. \nany other number: Exit");
                int optionUser = answer.nextInt();
                if (optionUser == 1) {
                    System.out.println("Sun with: \n1.Mercury. \n2.Venus. \n3.Earth. \n4.Mars. \n5.Jupiter." +
                            " \n6.Saturn. \n7.Uranus. " +
                            "\n8.Neptune.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> {
                            calculate.calculateGravitationalForce(optionPlanet, star, planet1);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, star, planet2);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, star, planet3);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, star, planet4);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, star, planet5);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, star, planet6);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, star, planet7);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, star, planet8);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                }else if (optionUser == 2) {
                    System.out.println("Mercury with: \n1.Sun. \n2.Mercury. \n3.Earth. \n4.Mars. \n5.Jupiter." +
                            " \n6.Saturn. \n7.Uranus. " +
                                "\n8.Neptune.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet1, star);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet1, planet2);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet1, planet3);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet1, planet4);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet1, planet5);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet1, planet6);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet1, planet7);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet1, planet8);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                }else if (optionUser == 3) {
                    System.out.println("Venus with: \n1.Sun. \n2.Mercury. \n3.Earth. \n4.Mars. \n5.Jupiter." +
                            " \n6.Saturn. \n7.Uranus. " +
                            "\n8.Neptune.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet2, star);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet2, planet1);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet2, planet3);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet2, planet4);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet2, planet5);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet2, planet6);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet2, planet7);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet2, planet8);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                }else if (optionUser == 4) {
                    System.out.println("Earth with: \n1.Sun. \n2.Mercury. \n3.Venus. \n4.Mars. \n5.Jupiter." +
                            " \n6.Saturn. \n7.Uranus. " +
                            "\n8.Neptune.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet3, star);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet3, planet1);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet3, planet2);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet3, planet4);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet3, planet5);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet3, planet6);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet3, planet7);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet3, planet8);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                }else if (optionUser == 5) {
                    System.out.println("Mars with: \n1.Sun. \n2.Mercury. \n3.Venus. \n4.Earth. \n5.Jupiter. \n6.Saturn." +
                            " \n7.Uranus. " +
                            "\n8.Neptune.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet4, star);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet4, planet1);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet4, planet2);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet4, planet3);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet4, planet5);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet4, planet6);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet4, planet7);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet4, planet8);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                }else if (optionUser == 6) {
                    System.out.println("Jupiter with: \n1.Sun. \n2.Mercury. \n3.Venus. \n4.Earth. \n5.Mars." +
                            " \n6.Saturn. \n7.Uranus. " +
                            "\n8.Neptune.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet5, star);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet5, planet1);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet5, planet2);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet5, planet3);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet5, planet4);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet5, planet6);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet5, planet7);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet5, planet8);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                } else if (optionUser == 7) {
                    System.out.println("Saturn with: \n1.Sun. \n2.Mercury. \n3.Venus. \n4.Earth. \n5.Mars." +
                            " \n6.Jupiter. \n7.Uranus. " +
                            "\n8.Neptune.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> calculate.calculateGravitationalForce(optionPlanet, planet6, star);
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet6, planet1);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet6, planet2);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet6, planet3);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet6, planet4);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet6, planet5);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet6, planet7);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet6, planet8);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                } else if (optionUser == 8) {
                    System.out.println("Uranus with: \n1.Sun. \n2.Mercury. \n3.Venus. \n4.Earth. \n5.Mars." +
                            " \n6.Jupiter. \n7.Saturn. " +
                            "\n8.Neptune.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet7, star);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet7, planet1);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet7, planet2);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet7, planet3);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet7, planet4);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet7, planet5);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet7, planet6);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet7, planet8);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                } else if (optionUser == 9) {
                    System.out.println("Neptune with: \n1.Sun. \n2.Mercury. \n3.Venus. \n4.Earth. \n5.Mars." +
                            " \n6.Jupiter. \n7.Saturn. " +
                            "\n8.Uranus.");
                    int optionPlanet = answer.nextInt();
                    switch (optionPlanet) {
                        case 1 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet8, star);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 2 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet8, planet1);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 3 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet8, planet2);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 4 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet8, planet3);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 5 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet8, planet4);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 6 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet8, planet5);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 7 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet8, planet6);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                        case 8 -> {
                            calculate.calculateGravitationalForce(optionPlanet, planet8, planet7);
                            optionBoolean = exitMenu.exitShowObjects();
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Non-numerical option, enter a number from the menu");
                answer.next();
                optionBoolean = true;
            }
        } while (optionBoolean);
    }
}
