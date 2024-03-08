package Conditional_Statements;

import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        double apple , tomato , banana , strawberry;
        double apkg = 2.25;
        double tomkg = 1.64;
        double bankg = 4.51;
        double strkg = 7.89;
        System.out.println("How many kg apple did you get?");
        Scanner input = new Scanner(System.in);
        apple = input.nextDouble();

        System.out.println("How many kg banana did you get?");
        banana = input.nextDouble();

        System.out.println("How many kg tomato did you get?");
        tomato = input.nextDouble();

        System.out.println("How many kg strawberry did you get?");
        strawberry = input.nextDouble();

        double apprice = apkg*apple;
        double tomprice = tomkg*tomato;
        double banprice = bankg*banana;
        double strawprice = strkg*strawberry;

        double totalprice = apprice+tomprice+banprice+strawprice;

        System.out.println("Total fee = "+totalprice);

    }
}
