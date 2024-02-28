package loops;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the step number : ");
        int digit = input.nextInt();

        for (int i = digit; i >= 1; i--) {
            for (int j = 1; j <= (i - digit); j++) {
                System.out.print(" ");
            }
            for (int k= ((2*i)-1); k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
