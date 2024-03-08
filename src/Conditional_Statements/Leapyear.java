package Conditional_Statements;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.print("Please enter the year : ");
        Scanner input = new Scanner(System.in);

        double year = input.nextDouble();

        if( year %100 == 0){
            if ( year %4 == 0 && year %400 == 0 ){
                System.out.println("İt is a leap year!");
            }else {
                System.out.println("İt is not a leap year!");
            }
        }else{
            if (year %4 == 0){
                System.out.println("İt is a leap year!");
            }else {
                System.out.println("İt is not a leap year!");
            }
        }
    }
}
