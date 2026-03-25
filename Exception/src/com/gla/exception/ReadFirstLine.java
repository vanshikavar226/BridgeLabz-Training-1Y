package com.gla.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstLine {
    public static void main(String[] args) {

        // try-with-resources (auto-closes BufferedReader)
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            // Read first line
            String line = br.readLine();

            // Print it
            System.out.println(line);

        } catch (IOException e) {
            // Handles file not found or read error
            System.out.println("Error reading file");
        }
    }
}
