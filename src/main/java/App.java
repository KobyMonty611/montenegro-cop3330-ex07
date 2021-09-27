/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("What is the length of the room in feet? ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = scanner.nextInt();

        int square_feet = length * width;

        double square_meters = square_feet * 0.09290304;

        double round = Math.round(square_meters  * 1000.0)/1000.0;

        System.out.println("You entered dimensions of "+ length + " feet by "+ width + " feet.");

        System.out.println("The area is");

        System.out.println(square_feet + " square feet");

        System.out.println(round + " square meters");

        scanner.close();

    }
}