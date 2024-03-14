package Arrays;

public class Average {
    public static void main(String[] args) {
        int[] list = {10,20,30,50,60,45,66,32,22,56,88,122};
        double average = 0;
        double sum = 0;

        for (int i = 0; i < list.length ; i++) {
            sum += list[i];
        }
        average = sum/ list.length;

        System.out.print("Average of the given array is : "+average);
    }
}
