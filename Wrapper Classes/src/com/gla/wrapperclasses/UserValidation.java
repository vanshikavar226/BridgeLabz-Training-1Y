package com.gla.wrapperclasses;

public class UserValidation {
        public static boolean isValidAge(String ageInput) {
            try {
                int age = Integer.parseInt(ageInput);

                if (age >= 18) {
                    return true;
                } else {
                    return false;
                }

            } catch (NumberFormatException e) {
                return false;
            }
        }
        public static void main(String[] args) {
            String[] testInputs = {"20", "17", "abc", "18"};

            for (String input : testInputs) {
                boolean result = isValidAge(input);
                System.out.println("Input: " + input + " → Valid: " + result);
            }
        }
}
