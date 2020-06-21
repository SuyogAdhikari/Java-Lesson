package org.meicode.firstJava;

import java.util.Random;
import java.util.Scanner;

public class FirstJavaCode {
    public static void main(String[] args) {

        boolean isPlaying = false;
        int playerLife = 5;

        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(20)+1;

        System.out.println("Welcome To my brand new game");
        System.out.print("Please Enter your beautifully crafted Name : ");
        String userName = userInput.next();
        System.out.println("Hello Mr./Mrs. " + userName);
        System.out.println();

        System.out.println("Please Confirm your Entry");
        System.out.println("1. Play");
        System.out.println("2. Be a coward");
        int play = userInput.nextInt();
        System.out.println();
        do
        {

            if (play == 1) {
                System.out.println();
                System.out.println();
                System.out.println("Please Enter a random number between 0-20");
                int userChoice = userInput.nextInt();

                if (userChoice == randomNumber) {
                    System.out.println("Congratulation your Guess is Legendary");
                    isPlaying = false;
                }
                else if (userChoice > randomNumber)
                {

                    System.out.println("Sorry you guessed smaller number than system's number");
                    playerLife--;
                    System.out.println("You now have " + playerLife +" lives left");
                    isPlaying = true;
                }
                else
                {
                    System.out.println("Sorry you guessed larger number than system's number");
                    playerLife--;
                    System.out.println("You now have " + playerLife +" lives left");
                    isPlaying = true;
                }
            }
            else{isPlaying = false;}

            if(playerLife == 0)
            {
                System.out.println();
                System.out.println();
                System.out.println("Game Over \n The number was " + randomNumber );
                isPlaying = false;
            }

        }while(isPlaying);

        System.out.println("Thank you for playing");

    }


}
