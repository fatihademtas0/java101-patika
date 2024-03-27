package Standart_Classes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the number guess game.");
        System.out.println("You have 5 rights.");

        Random random = new Random(); // random number between 10-40
        int min = 10, max = 40;
        int number = random.nextInt(max - min + 1) + min;

        int right = 0;
        int[] wrongGuesses = new int[5];
        int attempts = 0;

        while (right < 5) {
            System.out.print("Guess a number between 10 - 40 : ");
            int guess = input.nextInt();
            wrongGuesses[attempts] = guess;

            if (guess == number) {
                System.out.println("Congratulations!");
                System.out.println("Your guess is correct!");
                break;
            } else if (guess != number) {
                {
                    if (guess > number) {
                        System.out.println("Guess a lower number.");
                    } else if (guess < number) {
                        System.out.println("Guess a higher number.");
                    }
                }
            }
            right++;
            attempts++;

        }
        System.out.println("Number was : "+number);
        System.out.println("Your wrong guesses : "+Arrays.toString(wrongGuesses));
    }
}
