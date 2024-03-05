package methods;

import java.util.Scanner;

public class recursive_pattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();

        recursive(number);
    }
    public static void recursive(int n)
    {
        System.out.println(n);

        if (n <= 0) {
            System.out.println(n);
            return;
        }

        recursive(n - 5);
        System.out.println(n);
    }
}
