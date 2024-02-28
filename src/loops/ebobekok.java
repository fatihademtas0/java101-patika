package loops;

import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ebob = 0, ekok = 0;

        System.out.print("Please enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Please enter the second number : ");
        int num2 = input.nextInt();

        if (num1 < num2) {
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
            }
        } else if (num2 < num1) {
            for (int i = 1; i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
            }
        } else {
            System.out.println("Given numbers are even.");
        }
        System.out.println("Ebob is : "+ebob);

        for (int i = 1; i <= num1*num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                ekok = i;
                break;
            }
        }
        System.out.println("Ebob is : "+ekok);
    }
}
