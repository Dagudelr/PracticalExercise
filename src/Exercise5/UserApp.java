package Exercise5;

import Exercise4.Vehicle;

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
     * static attribute used as an iterator to enter the number of vehicles.
     *
     * @since 1.0.0
     */
    static int option;
    /**
     * static attribute to be used as a condition for exiting menus.
     *
     * @since 1.0.0
     */
    static boolean exitOption;
    /**
     * static attribute that is an object of class SimpleDateFormat to add dates.
     *
     * @since 1.0.0
     */
    static SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
    /**
     static attribute that is a Scanner class object to obtain keyboard information....
     *
     * @since 1.0.0
     */
    static Scanner scanner = new Scanner(System.in);

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
        option = 1;
        exitOption = false;
        while (option <= 5) {
            do {
                exitOption = false;
                try {
                    System.out.println("""
                        What do you want to build?:\s
                        1.CAR.\s
                        2.MOTORCYCLE.\s
                        3.BIKE.\s
                        4.TRUCK.\s
                        other: BOAT.""");
                    int optionBuild = scanner.nextInt();
                    if (optionBuild == 1) {
                        setAttributes(optionBuild);
                        System.out.println("enter the number of car doors.");
                        int numberDoors = scanner.nextInt();
                        Car car1 = new Car(brand, model, modelYear, type,  color, numberDoors, numberWheels,
                                numberPassengers, price, means);
                        System.out.println(car1.toString());
                    } else if (optionBuild == 2) {
                        Motorcycle.typeMotorcycle category;
                        System.out.println("Enter the type of motorcycle: \n1.URBAN. \nAny other number: ADVENTURE");
                        int numberCategory = scanner.nextInt();
                        if (numberCategory == 1) {
                            category = Motorcycle.typeMotorcycle.URBAN;
                        } else {
                            category = Motorcycle.typeMotorcycle.ADVENTURE;
                        }
                        setAttributes(optionBuild);
                        Motorcycle motorcycle1 = new Motorcycle(brand, model, modelYear, type, category, color, numberWheels,
                                numberPassengers, price, means);
                        System.out.println(motorcycle1.toString());
                    } else if (optionBuild == 3) {
                        setAttributes(optionBuild);
                        Bike bike1 = new Bike(brand, model, modelYear, type,  color, numberWheels,
                                numberPassengers, price, means);
                        System.out.println("You're going to get on the bike? \n1.Yes. \nOther number: No");
                        int optionRidingBike = scanner.nextInt();
                        if (optionRidingBike == 1) {
                            bike1.setRidingBike(true);
                        }
                        System.out.println(bike1.toString());
                    } else if (optionBuild == 4) {
                        double heightTheCargo;
                        setAttributes(optionBuild);
                        System.out.println("Enter the height of the cargo in meters.");
                        heightTheCargo = scanner.nextDouble();
                        Truck truck1 = new Truck(brand, model, modelYear, type,  color, numberWheels,
                                numberPassengers, price, means, heightTheCargo);
                        System.out.println(truck1.toString());
                    } else {
                        int numberEngines;
                        setAttributes(optionBuild);
                        System.out.println("Enter the number of engines.");
                        numberEngines = scanner.nextInt();
                        Boat boat1 = new Boat(brand, model, modelYear, type,  color, numberWheels,
                                numberPassengers, price, means, numberEngines);
                        System.out.println(boat1.toString());
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Non-numeric option.");
                    scanner.next();
                    exitOption = true;
                }
            }while (exitOption);
            option++;

        }
    }

    /**
     * Assign the values to the attributes, it is assigned in a separate method to optimize the code.
     *
     * @param optionBuild It receives a numeric option that refers to the type of vehicle the user wants to build.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public static void setAttributes(int optionBuild) {
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

        switch (optionBuild) {
            case 1 -> type = Vehicle.typeVehicle.CAR;
            case 2 -> type = Vehicle.typeVehicle.MOTORCYCLE;
            case 3 -> type = Vehicle.typeVehicle.BIKE;
            case 4 -> type = Vehicle.typeVehicle.TRUCK;
            default -> type = Vehicle.typeVehicle.BOAT;
        }
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

        switch (optionBuild) {
            case 1, 2, 3, 4 -> means = Vehicle.meansTransport.LAND;
            default -> means = Vehicle.meansTransport.WATER;
        }

        do {
            exitOption = false;
            try {
                switch (optionBuild) {
                    case 1 -> {
                        numberWheels = 4;
                        System.out.println("Enter number of passengers.");
                        numberPassengers = scanner.nextInt();
                        System.out.println("Enter the price of the vehicle.");
                        price = scanner.nextInt();
                        exitOption = false;
                    }
                    case 2 -> {
                        numberWheels = 2;
                        numberPassengers = 2;
                        System.out.println("Enter the price of the vehicle.");
                        price = scanner.nextInt();
                        exitOption = false;
                    }
                    case 3 -> {
                        numberWheels = 2;
                        numberPassengers = 1;
                        System.out.println("Enter the price of the vehicle.");
                        price = scanner.nextInt();
                        exitOption = false;
                    }
                    case 4 -> {
                        System.out.println("Enter number of wheels.");
                        numberWheels = scanner.nextInt();
                        System.out.println("Enter number of passengers.");
                        numberPassengers = scanner.nextInt();
                        System.out.println("Enter the price of the vehicle.");
                        price = scanner.nextInt();
                        exitOption = false;
                    }
                    default -> {
                        numberWheels = 0;
                        System.out.println("Enter number of passengers.");
                        numberPassengers = scanner.nextInt();
                        System.out.println("Enter the price of the vehicle.");
                        price = scanner.nextInt();
                        exitOption = false;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Non-numeric option, repeat the last 3 options.");
                scanner.next();
                exitOption = true;
            }
        }while (exitOption);
    }
}