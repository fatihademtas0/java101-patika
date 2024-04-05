package Finishing_Project;

import java.util.Scanner;

public class Main {
    static int row;
    static int col;

    public static void main(String[] args) {
        askSize();

        MineSweeper mine = new MineSweeper(row, col);

        System.out.print("Creating board");
        waiting();

        mine.run();
    }

    public static void waiting() {
        int count = 0;
        while (count < 4) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
            count++;
        }
        System.out.println();
    }

    public static void askSize() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to MineSweeper!");
        System.out.print("Please enter the number of rows : ");
        row = input.nextInt();

        System.out.print("Please enter the number of columns : ");
        col = input.nextInt();
    }
}
