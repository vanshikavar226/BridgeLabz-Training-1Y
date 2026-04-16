package com.gla.JAVATest;
import java.util.*;
public class FriendlyPair {
    public static int sumOfDivisors(int n) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = 6;
        int b = 28;
        int sumA = sumOfDivisors(a);
        int sumB = sumOfDivisors(b);
        if ((double)sumA / a == (double)sumB / b) {
            System.out.println("Yes, they are a friendly pair");
        } else {
            System.out.println("No, they are not a friendly pair");
        }
    }
}