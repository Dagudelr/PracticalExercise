package Exercise5;

import Exercise4.Vehicle;
import Exercise5.interfaces.IAction;

import java.util.Date;

/**
 * Class that refers to a boat that extends the vehicle class and implements actions of an interface.
 *
 * @version 1.0.0 15/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class Boat extends Vehicle implements IAction {

    private Integer numberEngines;
    private Boolean turnOn = false;
    private Integer currentSpeed;
    private Boolean accelerate;
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
    public Boat(String brand, String model, Date modelYear, typeVehicle type, colors color, Integer numberWheels,
            Integer numberPassengers, Integer price, meansTransport means, Integer numberEngines) {
        super(brand, model, modelYear, type, color, numberWheels, numberPassengers, price, means);

        this.numberEngines = numberEngines;
    }

    /**
     * Method that obtains the number of motors in the boat.
     *
     * @return the value of the numberEngines attribute
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Integer getNumberEngines() {
        return numberEngines;
    }

    /**
     * Method that obtains the verification if the boat is starting.
     *
     * @return the value of the turnOn attribute
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Boolean getTurnOn() {
        return turnOn;
    }

    /**
     * Method that obtains the value of the currentSpeed attribute
     *
     * @return the speed of the motorcycle.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * Method that obtains verification if the boat is accelerating.
     *
     * @return the value of the accelerate attribute
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Boolean getAccelerate() {
        return accelerate;
    }

    /**
     * Method that obtains the verification if the boat is stopping.
     *
     * @return the value of the stop attribute
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Boolean getStop() {
        return stop;
    }

    /**
     * Method that assigns the boat speed under certain conditions.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public void setCurrentSpeed() {
        if(this.turnOn) {
            if(this.accelerate) {
                this.currentSpeed += 10;
            }
        }
    }

    /**
     * method assigning the Boolean action of accelerating the boat.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public void setAccelerate() {
        if(this.turnOn) {
            this.accelerate = true;
            this.stop = false;
        }else {
            System.out.println("start the boat first.");
        }
    }

    /**
     * method assigning the Boolean action of stopping the boat.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public void setStop() {
        if(this.turnOn) {
            if(this.accelerate) {
                if (this.currentSpeed >= 10) {
                    this.accelerate = false;
                    this.currentSpeed = 0;
                    this.stop = true;
                }
            }else {
                System.out.println("The boat is on, but not in motion.");
            }
        }else {
            System.out.println("the boat is turned off");
        }
    }

    /**
     * method assigning the Boolean action of starting the boat.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public void setTurnOn(Boolean turnOn) {
        this.turnOn = turnOn;
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
        return "\nBoat{" +
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
                ", \nnumberEngines=" + numberEngines +
                ", \nturnOn=" + turnOn + "\n" +
                '}';
    }
}
