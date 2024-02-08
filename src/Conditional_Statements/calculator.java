package Conditional_Statements;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        int n1 = input.nextInt();
        System.out.println("Enter the second number.");
        int n2 = input.nextInt();

        System.out.println("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
        System.out.print("Your choice: ");
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println(n1+"  +  "+n2+"  =  "+(n1+n2));
                break;
            case 2:
                System.out.println(n1+"  -  "+n2+"  =  "+(n1-n2));
                break;
            case 3:
                System.out.println(n1+"  *  "+n2+"  =  "+(n1*n2));
                break;
            case 4:
                System.out.println(n1+"  /  "+n2+"  =  "+(n1/n2));
                break;
            default:
                System.out.println("You entered wrong number.");
                break;
        }
    }
}
