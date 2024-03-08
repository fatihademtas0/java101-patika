package loops;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        double result = 0;

        for (double i = 1; i<=num;i++){
            result += 1/i;
        }
        System.out.println(result);
        //sa
    }
}
