package Exercise3;

/**
 * An interface that refers to the sorting methods.
 * public class CalculateSorting implements ISort { }
 *
 * @version 1.0.0 13/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public interface ISort {
    /**
     * Method that assigns random numbers to an array.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    void assigningNumber();

    /**
     * Sorting by the bubble method.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    void BubbleMethod();

    /**
     * Sorting by the quick sort method.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    void quickSort(int[] array, int left, int right);
}
