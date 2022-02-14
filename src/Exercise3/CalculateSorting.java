package Exercise3;

import java.util.Arrays;


/**
 * Class that performs the array ordering calculation with two available methods.
 * CalculateSorting bubble = new Calculate(5);
 *
 * @version 1.0.0 13/02/2022
 *
 * @author Daniel, Agudelo - danielagudelo103@gmail.com
 *
 * @since 1.0.0
 */
public class CalculateSorting implements ISort {

    private int[] numbers;
    private int aux;
    private int arraySize;

    /**
     *Method that obtains the list of the class.
     * @return the list already assigned.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     *A constructor method that prompts the user for the size of the list when it is instantiated.
     *
     * @param arraySize the size of the array desired by the user.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    public CalculateSorting(int arraySize) {
        this.numbers = new int[arraySize];
        this.arraySize = this.numbers.length;
    }

    /**
     * Method that refers to the assignment of random numbers to the numbers attribute.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public void assigningNumber() {
        for (int i = 0; i < (this.arraySize-1); i++) {
            this.numbers[i] = (int) (Math.random() * (30-1)+1);
        }
    }

    /**
     * Bubble sort method, sorts the list of the numbers attribute.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public void BubbleMethod() {
        for (int i = 0; i < (this.arraySize-1); i++) {
            for(int j = 0; j < (this.arraySize-1); j++) {
                if(this.numbers[j] > this.numbers[j+1]) {
                    this.aux = this.numbers[j];
                    this.numbers[j] = this.numbers[j+1];
                    this.numbers[j+1] = aux;
                }
            }
        }
    }

    /**
     * Quick sort method, sorts the list of the numbers attribute, performing recursion.
     *
     * @param array refers to the numbers array.
     * @param left First index of the arrangement.
     * @param right last index of the arrangement.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public void quickSort(int[] array, int left, int right) {
        int i, j, pivot, aux;
        i = left;
        j = right;
        pivot = array[(left+right)/2];
        do {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);
        if (left < j) {
            quickSort(array, left, j);
        }
        if (i < right) {
            quickSort(array, i, right);
        }
    }

    /**
     * Method that displays the ordered array in either of two forms.
     *
     * @return Orderly arrangement on screen.
     *
     * @author Daniel, Agudelo - danielagudelo103@gmail.com
     *
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "CalculateSorting{" +
                "\nnumbers=" + Arrays.toString(numbers) + "\n" +
                '}';
    }
}
