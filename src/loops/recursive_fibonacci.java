package loops;

import java.util.Scanner;

public class recursive_fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }
    }

    static int fib(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
