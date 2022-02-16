package Exercise4;

import java.util.Date;
import java.util.Objects;
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
    /**
     *protected attribute that can be used from classes that extend the vehicle class and refers to the vehicle id.
     *
     * @since 1.0.0
     */
    protected final UUID id;
    /**
     *protected attribute that can be used from classes that extend the vehicle class and refers to the vehicle brand.
     *
     * @since 1.0.0
     */
    protected final String brand;
    /**
     * protected attribute that can be used from classes that extend the vehicle class and refers to the vehicle model.
     *
     * @since 1.0.0
     */
    protected final String model;
    /**
     * protected attribute that can be used from classes that extend the vehicle class and
     * refers to the vehicle modelYear.
     *
     * @since 1.0.0
     */
    protected final Date modelYear;
    /**
     * protected attribute that can be used from classes that extend the vehicle class and refers to the vehicle type.
     *
     * @since 1.0.0
     */
    protected final typeVehicle type;
    /**
     * protected attribute that can be used from classes that extend the vehicle class and refers to the vehicle color.
     *
     * @since 1.0.0
     */
    protected final colors color;
    /**
     * protected attribute that can be used from classes that extend the vehicle class and
     * refers to the vehicle numberWheels.
     *
     * @since 1.0.0
     */
    protected final Integer numberWheels;
    /**
     * protected attribute that can be used from classes that extend the vehicle class and
     * refers to the vehicle NumberPassengers.
     *
     * @since 1.0.0
     */
    protected final Integer NumberPassengers;
    /**
     * protected attribute that can be used from classes that extend the vehicle class and refers to the vehicle price.
     *
     * @since 1.0.0
     */
    protected final Integer price;
    /**
     * protected attribute that can be used from classes that extend the vehicle class and refers to the vehicle meansTransport.
     *
     * @since 1.0.0
     */
    protected final meansTransport means;

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
        this.brand = Objects.requireNonNull(brand);
        this.model = Objects.requireNonNull(model);
        this.modelYear = Objects.requireNonNull(modelYear);
        this.type = Objects.requireNonNull(type);
        this.color = Objects.requireNonNull(color);
        this.numberWheels = Objects.requireNonNull(numberWheels);
        this.NumberPassengers = Objects.requireNonNull(numberPassengers);
        this.price = Objects.requireNonNull(price);
        this.means = Objects.requireNonNull(means);
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
