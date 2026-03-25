package com.gla.exception;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Accept size of array
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            // Create array
            int[] arr = new int[size];

            // Input elements
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Accept index
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            // Retrieve value
            int value = arr[index];

            // Output
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");

        } finally {
            sc.close();
        }
    }
}
