package loops;
import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        System.out.print("Enter the n number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.print("Enter the r number : ");
        int r = input.nextInt();

        int nFac = 1;
        int i ;
        int k ;
        int rFac = 1;

        if(n>=r){
            for (i = 1; i <= n; i++) {
                nFac *= i;
            }

            for (k = 1; k <= r; k++) {
                rFac *= k;
            }
            System.out.println("-------------------------------------------");

            System.out.println("You can find the combination formula above.");
            System.out.println("C(n,r) = n! / (r! * (n-r)!)");

            System.out.println("-------------------------------------------");

            System.out.println("Our combination algorithma is :");
            System.out.println("C("+n+","+r+") = "+n+ "! / ("+r+" ! * ("+n+"-"+r+") !)");

            System.out.println("-------------------------------------------");

            int result = nFac / (rFac *(n-r));
            System.out.println("****  RESULT = "+result+"  ****");
        }else{
            System.out.println("-------------------------------------------");
            System.out.println("'N' must be greater than or equal to 'R'.");
            System.out.println("Please enter valid numbers.");
        }


    }
}
