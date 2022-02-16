package Exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
     * static attribute that is assigned the value of the vehicle brand and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static String brand;
    /**
     * static attribute that is assigned the value of the vehicle model and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static String model;
    /**
     * static attribute that is assigned the value of the vehicle modelYear and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static Date modelYear;
    /**
     * static attribute that is assigned the value of the vehicle numberWheels and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static Integer numberWheels;
    /**
     * static attribute that is assigned the value of the vehicle numberPassengers and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static Integer numberPassengers;
    /**
     * static attribute that is assigned the value of the vehicle price and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static Integer price;
    /**
     * static attribute that is assigned the value of the vehicle type and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static Vehicle.typeVehicle type;
    /**
     * static attribute that is assigned the value of the vehicle color and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static Vehicle.colors color;
    /**
     * static attribute that is assigned the value of the vehicle means and
     * is used when the vehicle class is instantiated.
     *
     * @since 1.0.0
     */
    static Vehicle.meansTransport means;

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

        int option = 1;
        boolean exitOption;

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the customs officer.");
        String nameOfficial = scanner.next();
        Ferry employee = new Ferry(nameOfficial);

        while (option <= 10) {
            System.out.println("Vehicle #" + option);

            System.out.println("Enter brand");
            brand = scanner.next();
            System.out.println("Enter model");
            model = scanner.next();

            do {
                exitOption = false;
                try {
                    System.out.println("Enter model year in format yyyy/MM/dd");
                    String date = scanner.next();
                    modelYear = format.parse(date);
                } catch (ParseException e) {
                    System.out.println("Incorrect format");
                    exitOption = true;
                }
            }while (exitOption);

            do {
                try {
                    System.out.println("""
                            Enter the type of vehicle:\s
                            1.CAR.\s
                            2.MOTORCYCLE.\s
                            3.BOAT.\s
                            4.TRUCK.\s
                            5.BIKE.\s
                            other: AIRPLANE.""");
                    int optionType = scanner.nextInt();
                    switch (optionType) {
                        case 1 -> {
                            type = Vehicle.typeVehicle.CAR;
                            exitOption = false;
                        }
                        case 2 -> {
                            type = Vehicle.typeVehicle.MOTORCYCLE;
                            exitOption = false;
                        }
                        case 3 -> {
                            type = Vehicle.typeVehicle.BOAT;
                            exitOption = false;
                        }
                        case 4 -> {
                            type = Vehicle.typeVehicle.TRUCK;
                            exitOption = false;
                        }
                        case 5 -> {
                            type = Vehicle.typeVehicle.BIKE;
                            exitOption = false;
                        }
                        default -> {
                            type = Vehicle.typeVehicle.AIRPLANE;
                            exitOption = false;
                        }

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Non-numeric option.");
                    exitOption = true;
                }
            } while (exitOption);

            do {
                try {
                    System.out.println("""
                            Enter the color of the vehicle:\s
                            1.BLACK.\s
                            2.WHITE.\s
                            3.GREEN.\s
                            4.YELLOW.\s
                            5.GRAY.\s
                            other: CUSTOMIZED.""");
                    int optionType = scanner.nextInt();
                    switch (optionType) {
                        case 1 -> {
                            color = Vehicle.colors.BLACK;
                            exitOption = false;
                        }
                        case 2 -> {
                            color = Vehicle.colors.WHITE;
                            exitOption = false;
                        }
                        case 3 -> {
                            color = Vehicle.colors.GREEN;
                            exitOption = false;
                        }
                        case 4 -> {
                            color = Vehicle.colors.YELLOW;
                            exitOption = false;
                        }
                        case 5 -> {
                            color = Vehicle.colors.GRAY;
                            exitOption = false;
                        }
                        default -> {
                            color = Vehicle.colors.CUSTOMIZED;
                            exitOption = false;
                        }

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Non-numeric option.");
                    exitOption = true;
                }
            } while (exitOption);

            do {
                try {
                    System.out.println("Enter the vehicle's means of travel: \n1.LAND. \n2.WATER. \nother: AIR.");
                    int optionType = scanner.nextInt();
                    switch (optionType) {
                        case 1 -> {
                            means = Vehicle.meansTransport.LAND;
                            exitOption = false;
                        }
                        case 2 -> {
                            means = Vehicle.meansTransport.WATER;
                            exitOption = false;
                        }
                        default -> {
                            means = Vehicle.meansTransport.AIR;
                            exitOption = false;
                        }

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Non-numeric option.");
                    exitOption = true;
                }
            } while (exitOption);

            do {
                exitOption = false;
                try {
                    System.out.println("Enter number of wheels.");
                    numberWheels = scanner.nextInt();
                    System.out.println("Enter number of passengers.");
                    numberPassengers = scanner.nextInt();
                    System.out.println("Enter the price of the vehicle.");
                    price = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Non-numeric option, repeat the last 3 options.");
                    scanner.next();
                    exitOption = true;
                }
            }while (exitOption);

            employee.registerVehicle(new Vehicle(brand,
                    model,
                    modelYear,
                    type,
                    color,
                    numberWheels,
                    numberPassengers,
                    price,
                    means));
            option++;
            System.out.println(employee.getVehicles());
        }
    }
}
