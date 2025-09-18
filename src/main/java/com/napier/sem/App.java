package com.napier.sem;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        InputReq inputReq = new InputReq();
    }
    public static class InputReq {
        private String name;
        Scanner input = new Scanner(System.in);
        public InputReq() {
            getName();
        }
        public void getName() {
            System.out.println("Please enter your name: ");
            name = input.nextLine();
            System.out.println("Hello, " + name);
        }
    }
}
