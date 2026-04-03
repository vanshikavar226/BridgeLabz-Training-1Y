package com.gla.wrapperclasses;

public class BankTransaction {
        public static double getRemainingLimit(Double limit) {
            if (limit == null) {
                return 0.0;
            }
            return limit; // auto-unboxing (Double → double)
        }
        public static void main(String[] args) {
            Double limit1 = 5000.0;
            Double limit2 = null;
            System.out.println("Limit1: " + getRemainingLimit(limit1));
            System.out.println("Limit2: " + getRemainingLimit(limit2));
        }
}
