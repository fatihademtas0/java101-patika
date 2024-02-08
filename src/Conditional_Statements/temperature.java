package Conditional_Statements;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.println("Welcome to our activity advice application!");

        System.out.print("Please enter the current Conditional_Statements.temperature : ");

        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();

        if(temp>-20 && temp<5){
            System.out.println("İt is cold outside.");
            System.out.println("You can go skiing!");
        }else if(temp>5 && temp<=15){
            System.out.println("İt is little warm outside.");
            System.out.println("You can go to cinema!");
        }else if(temp>15 && temp<=25){
            System.out.println("İt is really warm outside.");
            System.out.println("You can go to picnic!");
        }else if(temp>25 && temp<=50){
            System.out.println("İT İS HOT OUTSİDE!");
            System.out.println("You can go to swimming!");
        }else{
            System.out.println("I STRONGLY RECOMMEND TO YOU NOT TO GO TO OUTSİDE RİGHT NOW!");
        }

    }
}
