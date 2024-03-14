package Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] list = {20, 52, 11, 99, 333, 211, 4421, 554, 234, 5};

        int min = list[0];
        int max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println("Maximum element of the given array is : " + max);
        System.out.println("Minimum element of the given array is : " + min);
    }
}
