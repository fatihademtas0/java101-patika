package loops;

import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for( int i = 0; i<=num;i++){
            if( i %2 == 0){
                System.out.println(i+" *");
            }
        }
    }
}
