import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String userName , password;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter yout user name : ");
        userName = input.nextLine();

        System.out.print("Please enter your password : ");
        password = input.nextLine();

        if( userName.equals("patika") && password.equals("java123")){
            System.out.println("You logged in successfully!");
        }else{
            System.out.println("You entered wrong user name or password.");
            System.out.println("Please try again.");
        }
    }
}
