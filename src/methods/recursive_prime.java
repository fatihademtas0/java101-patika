package methods;

import java.util.Scanner;

public class recursive_prime {
    static boolean isPrime(int number , int div){
        if(number == 0 || number == 1)
            return false;
        else if (number == div)
            return true;
        else if (number%div == 0)
            return false;
        else
            return isPrime(number,div+1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        System.out.println(isPrime(n,2));
    }
}
