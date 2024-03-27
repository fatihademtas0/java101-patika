package Arrays;

import java.util.Arrays;

public class ArraysClasses {
    public static void main(String[] args) {
        int[] list = {6, 20, 18, 555, 3};

        int[] list2 = {211, 55, 73, 34, 65};

        System.out.println(Arrays.toString(list)); // prints array

        Arrays.fill(list, 2); // fills the array with the given value

        System.out.println(Arrays.toString(list));

        //FİLL
        Arrays.fill(list, 2, 3, 30); // makes 30 the numbers between second index to third

        System.out.println(Arrays.toString(list));

        //SORT
        Arrays.sort(list2); // Sorts the array from smallest to largest

        System.out.println(Arrays.toString(list2));

        // BİNARY SEARCH
        int[] list3 = {90, 23, 534, 33, 2, 7};

        Arrays.sort(list3); // first we have to sort the array

        System.out.println(Arrays.binarySearch(list3, 33)); // gives index of the searched value

        //COPY
        int[] list4 = {123, 64, 456, 12, 47, 23, 45};

        int[] copyArray = Arrays.copyOf(list4, 4); // copies first 4 values

        System.out.println(Arrays.toString(copyArray));

        int[] copy2 = Arrays.copyOfRange(list4, 1, 3); // copies values in range of 1-3

        System.out.println(Arrays.toString(copy2));

        //EQUALS

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 5, 4};

        System.out.println(Arrays.equals(array1, array2)); // prints true
        System.out.println(Arrays.equals(array3, array2)); // pritns false

    }
}
