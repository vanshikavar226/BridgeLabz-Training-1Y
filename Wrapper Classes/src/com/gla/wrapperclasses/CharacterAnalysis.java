package com.gla.wrapperclasses;
import java.util.Scanner;
public class CharacterAnalysis {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int letters = 0;
            int digits = 0;
            int specialChars = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isLetter(ch)) {
                    letters++;
                }
                else if (Character.isDigit(ch)) {
                    digits++;
                }
                else if (!Character.isWhitespace(ch)) {
                    specialChars++;
                }
            }
            System.out.println("Total Letters: " + letters);
            System.out.println("Total Digits: " + digits);
            System.out.println("Total Special Characters: " + specialChars);
            sc.close();
        }
}
