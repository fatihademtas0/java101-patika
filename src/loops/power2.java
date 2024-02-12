package loops;

import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.print("Enter the power : ");
        int pow = input.nextInt();

        int total = 1;
        for (int i = 1; i <= pow; i++) {
            total *= number;
        }
        System.out.println(number + " ^ " + pow + " = " + total);
    }
}
