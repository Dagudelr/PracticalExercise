package Exercise4;

import java.util.ArrayList;
import java.util.List;


/**
 * Class referring to a customs ferry port where imported vehicles arrive.
 *
 * @version 1.0.0 14/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class Ferry {

    private final String nameOfficial;
    private Boolean passVehicle;
    private final List<Vehicle> vehicles;

    /**
     *Construct method that initializes the values of the class when it is instantiated.
     *
     * @param nameOfficial customs officer.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Ferry(String nameOfficial) {
        this.vehicles = new ArrayList<>(10);
        this.nameOfficial = nameOfficial;
    }

    /**
     * Method that enters an object of type Vehicle to a list.
     *
     * @param vehicle Vehicle type object.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public void registerVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return this.vehicles;
    }
}
