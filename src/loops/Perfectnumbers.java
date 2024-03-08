package loops;

import java.util.Scanner;

public class Perfectnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        for (int i = 1; i<num;i++){
            if(num % i == 0){
                total +=i;
            }
        }
        if(total == num){
            System.out.println("İt is a perfect number!");
        }else{
            System.out.println("İt is not a perfect number!");
        }

    }
}
