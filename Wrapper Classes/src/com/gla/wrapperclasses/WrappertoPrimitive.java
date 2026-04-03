package com.gla.wrapperclasses;

public class WrappertoPrimitive {
    public static void main (String[] args){
            Double obj = 45.67;

            // Convert to primitive double (unboxing)
            double d = obj;

            // Convert to int using casting
            int i = (int) d;
            System.out.println("Double object value: " + obj);
            System.out.println("Primitive double value: " + d);
            System.out.println("Primitive int value: " + i);
    }
}
