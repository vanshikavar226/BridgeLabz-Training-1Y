package com.gla.wrapperclasses;
import java.util.Scanner;
public class PrimitivetoWrapper {
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();

                Integer obj = Integer.valueOf(num);   // Method 1
                // Display both values
                System.out.println("Primitive value: " + num);
                System.out.println("Wrapper object value: " + obj);
    }
}