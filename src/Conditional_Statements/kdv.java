package Conditional_Statements;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle.");
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double pi = 3.14;

        double circumference = 2*pi*radius;

        double area = pi*radius*radius;

        System.out.println("Circles circumference = "+circumference);
        System.out.println("Circles area = "+area);

    }
}
