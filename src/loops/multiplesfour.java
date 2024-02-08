package loops;
import java.util.Scanner;

public class multiplesfour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int total = 0;
        do {
            System.out.print("Enter an even number : ");
            num = input.nextInt();
            if( num % 4 == 0){
                total +=num;
            }
        }while( num % 2 == 0);
        // we found the even and multiples of four
        //then ve added them
        System.out.println("Total = "+total);
    }
}
