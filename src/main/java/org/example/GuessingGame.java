package org.example;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // need a secret number
        // user needs to guess it -- take input?
        // if too high or low, let them know
        // if guessed correctly let them know

        System.out.println("Please enter a number between 1 and 10");

        Integer secretNumber = 9;
        Scanner scanner = new Scanner(System.in);

        String guess = scanner.nextLine();
        System.out.println("Your guess was: " + guess);

        if(guess.equals(String.valueOf(secretNumber))){
            System.out.println("Nice that was my number!");
        } else if(secretNumber < Integer.valueOf(guess)) {
            System.out.println("Too high, guess again!");
        } else if(secretNumber > Integer.valueOf(guess))
        System.out.println("Too low, guess again!");
        }
    }

