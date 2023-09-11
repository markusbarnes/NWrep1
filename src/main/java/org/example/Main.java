package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int i = 1;

        System.out.println("Try and guess the number...");
        guess = keyboard.nextInt();

        for (i = 1; guess != randomNumber; i++){
            if (guess > randomNumber) {
                System.out.println("Your guess is too High");
            }
            else {
                System.out.println("You guess is too Low");
            }
            guess = keyboard.nextInt();
        }

        System.out.println("Congratulations, you managed to guess the number in " + i + " guesses");
    }
}
