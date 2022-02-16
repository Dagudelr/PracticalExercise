package Exercise5;

import Exercise4.Vehicle;

import java.util.Date;

/**
 * Class that refers to a bike that extends the vehicle class.
 *
 * @version 1.0.0 15/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class Bike extends Vehicle {

    private Boolean ridingBike = false;
    private Boolean pedaling;
    private Boolean stop;

    /**
     * constructor method that initializes the values of the class when it is instantiated.
     *
     * @param brand of vehicle.
     * @param model of vehicle.
     * @param modelYear of vehicle.
     * @param type of vehicle.
     * @param color of vehicle.
     * @param numberWheels of vehicle.
     * @param numberPassengers of vehicle.
     * @param price of vehicle.
     * @param means of transport of the vehicle
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     * @since 1.0.0
     */
    public Bike(String brand, String model, Date modelYear, typeVehicle type, colors color, Integer numberWheels,
            Integer numberPassengers, Integer price, meansTransport means) {
        super(brand, model, modelYear, type, color, numberWheels, numberPassengers, price, means);
    }

    /**
     * Method that obtains the Boolean action of riding the bicycle.
     *
     * @return the boolean value of the ridingBike attribute.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Boolean getRidingBike() {
        return ridingBike;
    }

    /**
     * Method that assigns the Boolean action of riding the bicycle.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public void setRidingBike(Boolean ridingBike) {
        this.ridingBike = ridingBike;
    }

    /**
     * Method that obtains the boolean action of pedaling the bicycle.
     *
     * @return the boolean value of the ridingBike attribute.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Boolean getPedaling() {
        return pedaling;
    }

    /**
     * Method that assigns the Boolean action of pedaling the bicycle.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public void setPedaling() {
        if(this.ridingBike) {
            this.pedaling = true;
            this.stop= false;
        } else {
            System.out.println("Get on your bike.");
        }
    }

    /**
     * Method that obtains the Boolean action of stopping the bicycle.
     *
     * @return the boolean value of the stop attribute.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Boolean getStop() {
        return stop;
    }

    /**
     * Method that assigns the Boolean action of stopping the bicycle.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public void setStop() {
        if(this.ridingBike) {
            if (this.pedaling) {
                this.pedaling = false;
                this.stop= true;
            } else {
                System.out.println("You're on the bike, but you haven't started pedaling.");
            }
        } else {
            System.out.println("Get on your bike.");
        }
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
        return "\nBike{" +
                "\nid=" + id +
                ", \nbrand='" + brand + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \nmodelYear=" + modelYear +
                ", \ntype=" + type +
                ", \ncolor=" + color +
                ", \nnumberWheels=" + numberWheels +
                ", \nNumberPassengers=" + NumberPassengers +
                ", \nprice=" + price +
                ", \nmeans=" + means +
                ", \nridingBike=" + ridingBike + "\n" +
                '}';
    }
}
