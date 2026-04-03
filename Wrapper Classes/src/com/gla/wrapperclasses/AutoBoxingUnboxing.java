package com.gla.wrapperclasses;
import java.util.ArrayList;
public class AutoBoxingUnboxing {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            // Adding values using auto-boxing (int → Integer)
            list.add(5);
            list.add(10);
            list.add(15);
            list.add(20);
            list.add(5);

            // Calculate sum using auto-unboxing (Integer → int)
            int sum = 0;
            for (Integer num : list) {
                sum += num;
            }
            System.out.println("ArrayList: " + list);
            System.out.println("Sum of elements: " + sum);
    }
}
