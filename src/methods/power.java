package methods;

import java.util.Scanner;

public class power {

    static int power(int base, int exponent) {
        if (base == 1)
            return 1;
        else if (base == 0)
            return 0;
        else if (exponent == 1)
            return base;
        else if (exponent == 0 && base != 0)
            return 1;
        else if (exponent < 0) {
            System.out.println("Can not if base is under 0.");
            return 0;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base :");
        int base = input.nextInt();

        System.out.print("Enter the exponent : ");
        int exponent = input.nextInt();

        System.out.println(power(base, exponent));
    }

}
