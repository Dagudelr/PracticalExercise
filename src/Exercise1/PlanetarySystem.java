package Exercise1;

/**
 * The abstract class refers to a planetary system with calculation methods.
 * public class CelestialObjects extends PlanetarySystem { }
 *
 * @version 1.0.0 13/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public abstract class PlanetarySystem {

    private final Double g = 6.67E-11;
    private final Double ua = 1.496E+11;

    /**
     * The method obtains the value of the universal constant G
     *
     * @return the constant g
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Double getG() {
        return g;
    }

    /**
     * Method to obtain the ua constant that refers to the astronomical units (distance between the sun and the earth).
     *
     * @return the constant ua
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Double getUa() {
        return ua;
    }

    /**
     * Abstract method to be implemented that performs that calculates the gravitational force of two objects.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public abstract Double calculateGravitationalForce(Double m2, Double d);

    /**
     * Abstract method to be implemented that performs transforming distances from UA to KM
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public abstract Double getUaInM(Double ua);

    /**
     * Abstract method to be implemented that performs which calculates the distance between two objects in AU
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public abstract Double measuringDistances(Double ua2);





}
