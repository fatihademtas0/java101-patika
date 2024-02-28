package loops;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;

        int right = 3;
        int balance = 10000;
        int select;

        while (right > 0) {
            System.out.print("Please enter your user name : ");
            userName = input.nextLine();

            System.out.print("Please enter your password  : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to our ATM.");
                do {
                    System.out.println("1- Deposit\n" +
                            "2- Withdraw\n" +
                            "3- See the Balance\n" +
                            "4- Exit");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Enter the amount you want to deposit : ");
                        int deposit = input.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your new balance is : " + balance);
                    } else if (select == 2) {
                        System.out.print("Enter the amount you want to withdraw : ");
                        int withdraw = input.nextInt();
                        if (balance >= withdraw) {
                            balance -= withdraw;
                            System.out.println("Your new balance is : " + balance);
                        }else{
                            System.out.println("Your balance is insufficient.");
                            System.out.print("Please enter a valid amount :");
                            int withdraw2 = input.nextInt();
                            if(balance>=withdraw2){
                                balance -= withdraw2;
                                System.out.println("Your new balance is : " + balance);
                            }else if (balance<withdraw2){
                                System.out.println("Your balance is insufficient.");
                                System.out.println("Please enter a valid amount later.");
                            }
                        }
                    } else if (select == 3) {
                        System.out.println("Your balance is : "+balance);
                    }
                } while (select != 4);
                System.out.println("Thank you for choosing us.");
                System.out.println("You have succesfully logged out.");
                break;

            } else {
                right--;
                if (right == 0) {
                    System.out.println("You have reached your trial limit.");
                    System.out.println("Try again later.");
                    break;
                }
                System.out.println("Please try again.");
                System.out.println("You have " + right + " left.");
            }
        }
    }
}
