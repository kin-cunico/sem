package com.napier.sem;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String name;

        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();

        System.out.println("Hello, " + name);
    }
}
