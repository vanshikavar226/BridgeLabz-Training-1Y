package com.gla.wrapperclasses;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeDataProcessing {
        public static void main(String[] args) {
            int[] ages = {25, 30, 19, 45, 22};
            ArrayList<Integer> ageList = new ArrayList<>();

            for (int age : ages) {
                ageList.add(age); // autoboxing
            }
            int youngest = Collections.min(ageList);
            int oldest = Collections.max(ageList);

            System.out.println("Age List: " + ageList);
            System.out.println("Youngest: " + youngest);
            System.out.println("Oldest: " + oldest);
        }
}
