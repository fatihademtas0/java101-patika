package methods;

import java.util.Scanner;

public class Advanced_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n"
                + "2- Substraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mode Operation\n"
                + "8- Rectangles Area and Perimeter Calculation\n"
                + "0- Exit";

        while (true) {
            System.out.println(menu);
            System.out.println("------------------------");
            System.out.print("Please select an operation : ");
            select = input.nextInt();


            if (select == 0) {
                System.out.println("You have succesfully logged out.");
                break;
            }

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiple();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Enter a valid number later.");
            }
        }
    }

    static void plus() {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        a = input.nextInt();

        System.out.print("Enter the second number : ");
        b = input.nextInt();

        System.out.println("------------------------");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println("------------------------");
    }

    static void minus() {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        a = input.nextInt();

        System.out.print("Enter the second number : ");
        b = input.nextInt();

        System.out.println("------------------------");
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println("------------------------");
    }

    static void multiple() {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        a = input.nextInt();

        System.out.print("Enter the second number : ");
        b = input.nextInt();

        System.out.println("------------------------");
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println("------------------------");
    }

    static void divide() {
        float a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        a = input.nextInt();

        System.out.print("Enter the second number : ");
        b = input.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("------------------------");
            System.out.println("You can not divide 0.");
            System.out.println("------------------------");
        } else {
            System.out.println("------------------------");
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println("------------------------");
        }
    }

    static void power() {
        int a, b, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        a = input.nextInt();

        System.out.print("Enter the second number : ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("------------------------");
        System.out.println(a + " ^ " + b + " = " + result);
        System.out.println("------------------------");
    }

    static void factorial() {
        long a, factorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number for which you want to calculate the factorial : ");
        a = input.nextInt();

        if (a == 0 || a == 1) {
            System.out.println("------------------------");
            System.out.println(a + " ! = 1");
            System.out.println("------------------------");
        } else if (a > 1) {
            for (int i = 2; i <= a; i++) {
                factorial *= i;
            }
            System.out.println("------------------------");
            System.out.println(a + " ! = " + factorial);
            System.out.println("------------------------");
        } else {
            System.out.println("------------------------");
            System.out.println("Can not calculate the negative factorial");
            System.out.println("------------------------");
        }
    }

    static void mode() {
        int a, b, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        a = input.nextInt();

        System.out.print("Enter the second number : ");
        b = input.nextInt();
        result = a % b;
        System.out.println("------------------------");
        System.out.println(result);
        System.out.println("------------------------");
    }

    static void rectangle() {
        double longSide, shortSide, area = 1, perimeter = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the long side of the rectangle : ");
        longSide = input.nextInt();

        System.out.print("Enter the short side of the rectangle : ");
        shortSide = input.nextInt();

        area = shortSide * longSide;
        perimeter = (shortSide + longSide) * 2;

        System.out.println("------------------------");
        System.out.println("Rectangles area = "+area);
        System.out.println("------------------------");
        System.out.println("Rectangles perimeter = "+perimeter);
        System.out.println("------------------------");
    }
}
