package loops;

import java.util.Scanner;

public class primenums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        for (int i = 2; i <= num; i++) {

            boolean prime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i + " is a prime number.");
            }


        }
    }
}
