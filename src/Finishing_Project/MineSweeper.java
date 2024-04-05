package Finishing_Project;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MineSweeper {
    int row;
    int col;
    int mineNumber;
    String[][] gameBoard;
    String[][] mineBoard;
    boolean gameOver = false;

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        gameBoard = new String[row][col];
        mineBoard = new String[row][col];
    }

    public void run() {

        if (row <= 2 && col <= 2) {

            System.out.println("Board must be at least 3x3.");
            System.out.println("Try again.");

        } else {

            System.out.println("--Mine Locations--");
            mineLocation();
            createBoard();

            while (!gameOver) {
                Scanner input = new Scanner(System.in);

                print2DArray(gameBoard);

                System.out.print("Please select row : ");
                int selectedRow = input.nextInt();
                --selectedRow;

                System.out.print("Please select a column : ");
                int selectedCol = input.nextInt();
                --selectedCol;

                int number = 0;

                if (selectedRow + 1 < 0 || selectedRow + 1 > this.row && selectedCol + 1 < 0 || selectedCol + 1 > this.col) {
                    System.out.println("Please select correct column and row within play area!");
                    continue;
                }

                if (mineBoard[selectedRow][selectedCol].equals("*")) {
                    System.out.println("***************************");
                    System.out.println("You stepped on a mine!");
                    print2DArray(gameBoard);
                    System.out.println("***************************");
                    System.out.println("--GAME OVER--");
                    print2DArray(mineBoard);
                    gameOver = true;

                } else if (gameBoard[selectedRow][selectedCol].equals("-") && mineBoard[selectedRow][selectedCol].equals("-")) {

                    for (int i = selectedRow - 1; i < selectedRow + 2; i++) {
                        for (int j = selectedCol - 1; j < selectedCol + 2; j++) {

                            if (i >= 0 && j >= 0 && i < row && j < col && mineBoard[i][j].equals("*")) {
                                number++;
                                gameBoard[selectedRow][selectedCol] = Integer.toString(number);
                            } else {
                                gameBoard[selectedRow][selectedCol] = Integer.toString(number);
                            }
                        }
                    }
                    if (!checkWin()) {
                        print2DArray(gameBoard);
                        System.out.println("***************************");
                        print2DArray(mineBoard);
                        System.out.println("***************************");
                        System.out.println("--YOU WİN--");
                        gameOver = true;
                    }
                } else if (!gameBoard[selectedRow][selectedCol].equals("-")) {
                    System.out.println("You have selected this cell before.");
                    System.out.println("Please select a new cell.");
                }
            }
        }
    }

    public void createBoard() {

        System.out.println("Game Board");
        gameBoard = new String[this.row][this.col];

        fill(gameBoard);
    }

    public void mineLocation() {
        Random random = new Random();

        mineBoard = new String[this.row][this.col];

        fill(mineBoard);

        mineNumber = (this.col * this.row) / 4;
        for (int i = 0; i < mineNumber; i++) {
            int row = random.nextInt(this.row); // pick a random row
            int col = random.nextInt(this.col); // pick a random column

            // if selected cell is not filled with " * " fill with " * "
            if (!(mineBoard[row][col].equals("*"))) {
                mineBoard[row][col] = "*";
            } else {
                // if selected cell is already filled with " * " decrease i and try again
                i--;
            }
        }
        print2DArray(mineBoard);
        System.out.println("--------------------------");
    }

    public void print2DArray(String[][] arr) {
        for (String[] row : arr) {
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public String[][] fill(String[][] arr) {

        for (String[] strings : arr) {
            Arrays.fill(strings, "-");
        }
        return arr;
    }

    private boolean checkWin() {
        int count = 0;
        int mineNumber = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {

                if (gameBoard[i][j].equals("-")) {
                    count++;
                }
                if (mineBoard[i][j].equals("*")) {
                    mineNumber++;
                }
            }
        }
        if (mineNumber == count) {
            return false;
        }
        return true;
    }
}


