package Exercise1;

import java.util.UUID;

/**
 * Class referring to a celestial object of the solar system.
 *
 * @version 1.0.0 13/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class CelestialObjects extends PlanetarySystem {

    private final UUID id;
    private final String name;
    private final Double mass;
    private final Double density;
    private final Double distanceToSun;
    private final Integer diameter;

    /**
     * constructor method that initializes the private attributes when instantiated.
     *
     * @param name of the celestial object.
     * @param mass of the celestial object.
     * @param density of the celestial object.
     * @param distanceToSun of the celestial object.
     * @param diameter of the celestial object.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public CelestialObjects(String name, Double mass, Double density, Double distanceToSun, Integer diameter) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.distanceToSun = distanceToSun;
        this.diameter = diameter;
    }

    /**
     * Method that obtains the id of the celestial body.
     *
     * @return the value of id of the celestial body.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public UUID getId() {
        return id;
    }

    /**
     * Method that obtains the name of the celestial body.
     *
     * @return the value of name of the celestial body.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Method that obtains the mass of the celestial body.
     *
     * @return the value of mass of the celestial body.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Double getMass() {
        return mass;
    }

    /**
     * Method that obtains the density of the celestial body.
     *
     * @return the value of density of the celestial body.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Double getDensity() {
        return density;
    }

    /**
     * Method that obtains the distanceToSun of the celestial body.
     *
     * @return the value of distanceToSun of the celestial body.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Double getDistanceToSun() {
        return distanceToSun;
    }

    /**
     * Method that obtains the diameter of the celestial body.
     *
     * @return the value of diameter of the celestial body.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public Integer getDiameter() {
        return diameter;
    }

    /**
     * Overwritten method of the abstract class that calculates the gravitational force.
     *
     * @param m2 Mass of the second object.
     * @param d distance between the two objects.
     * @return gravitational force.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public Double calculateGravitationalForce(Double m2, Double d) {
        return getG() *this.mass * m2 / Math.pow(d, 2);
    }

    /**
     * Overwritten method of the abstract class that calculates the astronomical units to meters.
     *
     * @param ua total astronomical unit between two celestial objects.
     * @return The value in meters of the distance between two celestial objects.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public Double getUaInM(Double ua) {
        return ua*this.getUa();
    }

    /**
     * A method that takes the astronomical units of two celestial objects and measures their distances.
     *
     * @param ua2 distance to the sun of the second object.
     * @return an astronomical unit which is the distance between objects, is used in the getUaInM method.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public Double measuringDistances(Double ua2) {
        if(this.distanceToSun>ua2){
            return this.distanceToSun-ua2;
        }else {
            return ua2-this.distanceToSun;
        }
    }

    /**
     * Method that displays celestial object information.
     *
     * @return the information that is taken from the attributes of the celestial object.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "CelestialObjects{" +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \nmass=" + mass +
                ", \ndensity=" + density + " g/cm³" +
                ", \ndistanceToSun=" + distanceToSun + " UA (Astronomic units)" +
                ", \ndiameter=" + diameter + " km\n" +
                '}';
    }
}
