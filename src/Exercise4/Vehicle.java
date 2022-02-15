package Exercise4;

import java.util.Date;
import java.util.UUID;

/**
 * Class that refers to a vehicle with its own characteristics.
 *
 * @version 1.0.0 14/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class Vehicle {

    private final UUID id;
    private final String brand;
    private final String model;
    private final Date modelYear;
    private final typeVehicle type;
    private final colors color;
    private final Integer numberWheels;
    private final Integer NumberPassengers;
    private final Integer price;
    private final meansTransport means;

    /**
     * constructor method that initializes the values of the class when it is instantiated.
     * @param brand of vehicle.
     * @param model of vehicle.
     * @param modelYear of vehicle.
     * @param type of vehicle.
     * @param color of vehicle.
     * @param numberWheels of vehicle.
     * @param numberPassengers of vehicle.
     * @param price of vehicle.
     * @param means of transport of the vehicle
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Vehicle(String brand, String model, Date modelYear, typeVehicle type,
                   colors color, Integer numberWheels, Integer numberPassengers,
                   Integer price, meansTransport means) {
        this.id = UUID.randomUUID();
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.type = type;
        this.color = color;
        this.numberWheels = numberWheels;
        this.NumberPassengers = numberPassengers;
        this.price = price;
        this.means = means;
    }

    /**
     * Method that lists the types of vehicles.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public enum typeVehicle {
        CAR, MOTORCYCLE, BOAT, TRUCK, BIKE, AIRPLANE,
    }

    /**
     * Method that lists the colors of vehicles.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public enum colors {
        BLACK, WHITE, GREEN, YELLOW, GRAY, CUSTOMIZED,
    }

    /**
     * Method that lists the meansTransport of vehicles.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public enum meansTransport {
        LAND, WATER, AIR
    }

    /**
     * Method that uses the toString method of the java Object class and
     * allows to display the class information on the screen.
     *
     * @return the class information.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "\nVehicle{" +
                "\nid=" + id +
                ", \nbrand='" + brand + '\'' +
                ",\n model='" + model + '\'' +
                ", \nmodelYear=" + modelYear +
                ", \ntype=" + type +
                ", \ncolor=" + color +
                ", \nnumberWheels=" + numberWheels +
                ", \nNumberPassengers=" + NumberPassengers +
                ", \nprice=" + price +
                ", \nmeans=" + means + "\n" +
                '}';
    }
}
