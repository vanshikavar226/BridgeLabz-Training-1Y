package com.gla.exception;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Input array size
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // Input elements
            System.out.println("Enter elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Input index and divisor
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            try {
                // Access array element
                int value = arr[index];

                try {
                    // Perform division
                    int result = value / divisor;
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            sc.close();
        }
    }
}