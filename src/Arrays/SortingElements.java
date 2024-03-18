package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SortingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of the array : ");
        int length = input.nextInt();

        int[] list = new int[length];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the " + i + ". element of the array : ");
            list[i] = input.nextInt();
        }

        System.out.print("Sorting from min to max : ");
        System.out.println(Arrays.toString(maxtoMin(list)));

        System.out.print("Sorting from max to min : ");
        System.out.println(Arrays.toString(mintoMax(list)));
    }

    static int[] maxtoMin(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static int[] mintoMax(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
