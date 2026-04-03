package com.gla.wrapperclasses;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeData {
        public static void main(String[] args) {
            int[] ages = {25, 30, 19, 45, 22};
            ArrayList<Integer> ageList = new ArrayList<>();
            for (int age : ages) {
                ageList.add(age); // autoboxing (int → Integer)
            }
            int youngest = Collections.min(ageList);
            int oldest = Collections.max(ageList);
            System.out.println("Ages: " + ageList);
            System.out.println("Youngest Age: " + youngest);
            System.out.println("Oldest Age: " + oldest);
        }
}
