package com.gla.exception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Try to open the file
            reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            // Read and print file contents
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle exception if file is not found or cannot be read
            System.out.println("File not found");
        } finally {
            // Close the reader if it was opened
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}