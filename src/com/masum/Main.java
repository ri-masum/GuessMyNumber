/*
* in this problem i make a random value and ask the user to guess my number
* if the number match then the run time will be over
* if not then it will run until you get tired
* if you get tired then type any number less then 0 then it will stop
* */


package com.masum;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Mini  Project
        System.out.println("Guess any number between 1-100");
        Scanner scanner = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);

        int userNumber;
        do {
            System.out.println("Guess my number:");
             userNumber = scanner.nextInt();
            if (userNumber == myNumber) {

                System.out.println("Woooooooooo!!!!!!!!!!! man dammmm it how did you guess my number shittt");
            break;
            } else if (userNumber > myNumber) {
                System.out.println("your guess number is bigger than my number ....plz try again");
            } else {
                System.out.println("your guess is too small than my number ");
            }


        }while (userNumber>=0);

            System.out.println("my number was:");
            System.out.println(myNumber);


    }

}

