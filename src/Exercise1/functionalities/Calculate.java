package Exercise1.functionalities;

import Exercise1.CelestialObjects;

/**
 * Class that refers to the calculation that is delivered to the user, it helps to optimize the code.
 * Calculate calculate = new Calculate
 *
 * @version 1.0.0 13/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class Calculate {
    /**
     * Method that obtains the objects and a number for the control flow.
     *
     * @param optionPlanet that manages the control flow.
     * @param object1 It is an object of type CelestialObjects
     * @param object2 It is an object of type CelestialObjects
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public void calculateGravitationalForce(int optionPlanet, CelestialObjects object1, CelestialObjects object2) {
        Double distances = object1.getUaInM(object1.measuringDistances(object2.getDistanceToSun()));
        Double massObject2 = object2.getMass();
        if (optionPlanet == 1) {
            System.out.println("The gravitational force between  " + object1.getName() + " and " + object2.getName() +
                    " is: " + object1.calculateGravitationalForce(massObject2, distances)+ " Newtons");
        }else if (optionPlanet == 2) {
            System.out.println("The gravitational force between  " + object1.getName() + " and " + object2.getName() +
                    " is: " + object1.calculateGravitationalForce(massObject2, distances) + " Newtons");
        }else if(optionPlanet == 3) {
            System.out.println("The gravitational force between  " + object1.getName() + " and " + object2.getName() +
                    " is: " + object1.calculateGravitationalForce(massObject2, distances) + " Newtons");
        }else if(optionPlanet == 4) {
            System.out.println("The gravitational force between  " + object1.getName() + " and " + object2.getName() +
                    " is: " + object1.calculateGravitationalForce(massObject2, distances) + " Newtons");
        }else if(optionPlanet == 5) {
            System.out.println("The gravitational force between  " + object1.getName() + " and " + object2.getName() +
                    " is: " + object1.calculateGravitationalForce(massObject2, distances) + " Newtons");
        }else if(optionPlanet == 6) {
            System.out.println("The gravitational force between  " + object1.getName() + " and " + object2.getName() +
                    " is: " + object1.calculateGravitationalForce(massObject2, distances) + " Newtons");
        }else if(optionPlanet == 7) {
            System.out.println("The gravitational force between  " + object1.getName() + " and " + object2.getName() +
                    " is: " + object1.calculateGravitationalForce(massObject2, distances) + " Newtons");
        }else if(optionPlanet == 8) {
            System.out.println("The gravitational force between  " + object1.getName() + " and " + object2.getName() +
                    " is: " + object1.calculateGravitationalForce(massObject2, distances) + " Newtons");
        }
    }
}

