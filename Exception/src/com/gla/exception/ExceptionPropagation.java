package com.gla.exception;

public class ExceptionPropagation {

    // method1: generates exception
    public static void method1() {
        int result = 10 / 0;  // ArithmeticException
    }

    // method2: calls method1
    public static void method2() {
        method1();
    }

    // main: handles exception
    public static void main(String[] args) {

        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}