package loops;
import java.util.Scanner;

public class powers {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        int num1 = 4;
        int num2 = 5;
        int five = 0, four = 0;
        int i = 1;
        int k = 1;
        do {
            System.out.println(i + " is power of four.");
            if (i > value) {
                break;
            }
            i *= 4;
        } while (i <= value);

        System.out.println("------------------");

        do {
            System.out.println(k + " is power of five.");
            if (k > value) {
                break;
            }
            k *= 5;
        } while (k <= value);
    }
}
