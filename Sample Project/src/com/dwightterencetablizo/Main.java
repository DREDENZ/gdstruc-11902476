package com.dwightterencetablizo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Prints out "Hello World"
        //System.out.println("Hello World");

        // Scanner class -> gets user input
        Scanner scanner = new Scanner(System.in);

        // Output
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        // This is a change!!!
    }
}
