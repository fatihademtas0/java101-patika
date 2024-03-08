package loops;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= (num - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
