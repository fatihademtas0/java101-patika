package loops;

import java.util.Scanner;
public class Largernumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest,smallest;

        System.out.print("Please enter how many numbers you would like to enter : ");
        int enter = input.nextInt();

        System.out.print("1 . Number : ");
        int first = input.nextInt();

        largest = first;
        smallest = first;

        for (int i = 2;i<=enter;i++){
            System.out.print(i+" . Number : ");
            int nums = input.nextInt();

            if(nums>largest){
                largest = nums;
            }

            if(nums< smallest){
                smallest = nums;
            }
        }
        System.out.println("Largest number is : "+largest);
        System.out.println("Smallest number is : "+smallest);
    }
}
