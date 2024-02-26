package loops;

import java.util.Scanner;

public class armstrongnums {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int digit = 0;
        int tempNum = num;
        int digitNum;
        int result = 0;
        int pow;


        while (tempNum != 0) {
            tempNum /= 10;
            digit++;
        }
        tempNum = num;

        while (tempNum != 0) {
            digitNum = tempNum % 10;
            pow = 1;
            for (int i = 1; i <= digit; i++) {
                pow *= digitNum;
            }
            result += pow;
            tempNum /= 10;

        }


        System.out.println(result);

    }
}
