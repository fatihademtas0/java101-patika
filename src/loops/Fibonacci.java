package loops;

import  java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Fibonacci series : ");
        int nums = input.nextInt();

        int firstNum = 0, secondNum = 1, sum;

        for (int i = 0; i <= nums; i++) {
            System.out.println(firstNum+ " + "+secondNum+" = "+(firstNum+secondNum));
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
