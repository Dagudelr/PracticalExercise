package Exercise5.interfaces;

/**
 * Interface that implements functionalities to classes with engines.
 *
 * @version 1.0.0 15/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public interface IAction {

    /**
     * Method that assigns the speed of any vehicle under certain conditions.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    void setCurrentSpeed();

    /**
     * Method that assigns the accelerate of any vehicle under certain conditions.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    void setAccelerate();
    /**
     * Method that assigns the stop of any vehicle under certain conditions.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    void setStop();

    /**
     * Method that assigns the turn on of any vehicle under certain conditions.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    void setTurnOn(Boolean turnOn);
}
