package Conditional_Statements;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1 , n2, n3;

        System.out.print("Enter first number : ");
        n1 = input.nextInt();

        System.out.print("Enter second number : ");
        n2 = input.nextInt();

        System.out.print("Enter third number : ");
        n3 = input.nextInt();

        if( n1>n2 && n1>n3){
            if(n2>n3){
                System.out.println("a  >  b  >  c");
            }else{
                System.out.println("a  >  c  >  b");
            }
        }else if(n2>n1 && n2>n3){
            if(n1>n3){
                System.out.println("b  >  a  >  c");
            }else{
                System.out.println("b  >  c  >  a");
            }
        }else{
            if(n1>n2){
                System.out.println("c  >  a  >  b");
            }else{
                System.out.println("c  >  b  >  a");
            }
        }
    }
}
