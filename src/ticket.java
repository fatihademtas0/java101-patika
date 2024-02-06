import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {

        double km;
        int age, type;

        System.out.println("Welcome to the Patika Airlines!");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Km : ");
        km = input.nextDouble();

        double price = 0.10 * km;

        System.out.println("Your fee without the discount : " + price + " dolar.");

        System.out.print("Please enter your age : ");
        age = input.nextInt();

        System.out.println("İf your ticket is a round trip please enter 1 if not enter 2.");
        type = input.nextInt();

        double discount1, discount2, newPrice;
        if (age >= 1 && age <= 120 && km >= 1) {
            if (age <= 12 && type == 1) {
                discount1 = price * 0.50;
                discount2 = discount1 * 0.20;
                newPrice = price - (discount2 + discount1);
                System.out.println("Your fee is = " + newPrice * 2 + " dolar");
            } else if (age <= 12 && type == 2) {
                discount1 = price * 0.50;
                newPrice = price - discount1;
                System.out.println("Your fee is = " + newPrice + " dolar");
            } else if (age > 12 && age <= 24 && type == 1) {
                discount1 = price * 0.10;
                discount2 = (price - discount1) * 0.20;
                newPrice = price - (discount2 + discount1);
                System.out.println("Your fee is = " + newPrice * 2 + " dolar");
            } else if (age > 12 && age <= 24 && type == 2) {
                discount1 = price * 0.10;
                newPrice = price - discount1;
                System.out.println("Your fee is = " + newPrice + " dolar");
            } else if (age >= 24 && age < 65 && type == 1) {
                discount1 = price * 0.20;
                newPrice = price - discount1;
                System.out.println("Your fee is = " + newPrice * 2 + " dolar");
            } else if (age >= 24 && age < 65 && type == 2) {
                newPrice = price;
                System.out.println("Your fee is = " + newPrice + " dolar");
            } else if (age >= 65 && type == 1) {
                discount1 = price * 0.30;
                discount2 = (price - discount1) * 0.20;
                newPrice = price - (discount2 + discount1);
                System.out.println("Your fee is = " + newPrice * 2 + " dolar");
            } else if (age >= 65 && type == 2) {
                discount1 = price * 0.30;
                newPrice = price - discount1;
                System.out.println("Your fee is = " + newPrice + " dolar");
            } else {
                System.out.println("Please enter valid numbers.");
            }
        }

    }
}
