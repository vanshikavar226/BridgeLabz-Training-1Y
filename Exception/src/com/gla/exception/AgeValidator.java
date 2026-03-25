package com.gla.exception;

import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class AgeValidator {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            // throwing custom exception
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Access granted!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}