package Classes;

import java.util.Scanner;
public class test {
    public static class Car{
        String type;
        String color;
        int modelYear;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Please enter the cars color : ");
        car.color = input.nextLine();

        System.out.print("Please enter the cars type : ");
        car.type = input.nextLine();

        System.out.print("Please enter the cars model year : ");
        car.modelYear = input.nextInt();

        System.out.println("Cars color      = "+car.color);
        System.out.println("Cars type       = "+car.type);
        System.out.println("Cars model year = "+car.modelYear);

    }
}
