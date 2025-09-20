package com.napier.sem.utils;

import java.util.Random;
import java.util.Scanner;

public class InputReq {
    Scanner input = new Scanner(System.in);
    private String name;
    private String age;
    public InputReq() {
        promptName();
        greetUser();
        guessAge();

    }
    private void promptName() {
        System.out.println("Please enter your name: ");
        this.name = input.nextLine();
    }

    private void promptAge() {
        System.out.println("What is your age?");
        this.age = input.nextLine();
    }

    private void greetUser() {
        System.out.printf("Hello, %s!",
                getName()
        );
    }

    private void guessAge() {
        Random rand = new Random();
        String guessedAge = Integer.toString(rand.nextInt(1, 99));

        System.out.printf("\n I think I can guess your age. You are %s! \n", guessedAge);
        promptAge();

        if (getAge().equals(guessedAge)) {
            System.out.println(" \n I guessed it right! :)");

        }
        else {
            System.out.println(" \n Oh, I thought I had it right :(");
        }
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
