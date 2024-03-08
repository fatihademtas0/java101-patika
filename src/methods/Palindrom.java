package methods;

import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int number) {
        int temp = number, reversedNumber = 0, lastNumber, count = 1;
        while (temp != 0) {
            System.out.println("------------------" + count + ". STEP");

            System.out.println("Number => " + temp);
            lastNumber = temp % 10;

            System.out.println("Last Number => " + lastNumber);
            reversedNumber = (reversedNumber * 10) + lastNumber;

            System.out.println("Reversed Number => " + reversedNumber);

            temp /= 10;

            count++;
        }
        if (reversedNumber == number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        System.out.print("İs the number palindrom ? --> " + isPalindrom(number));
    }
}
