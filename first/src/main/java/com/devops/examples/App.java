package com.devops.examples;

/**
 * Hello world!
 *
 */

 import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int num;
        
        if (args.length > 0) {
            // If command-line argument provided, use it
            num = Integer.parseInt(args[0]);
        } else {
            // For testing in Jenkins, use a predefined number (e.g., 10)
            num = 10;
        }

        // Check if the number is odd or even
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

