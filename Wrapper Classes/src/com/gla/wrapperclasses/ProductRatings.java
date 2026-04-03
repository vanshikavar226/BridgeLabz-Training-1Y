package com.gla.wrapperclasses;
import java.util.ArrayList;
import java.util.Objects;
public class ProductRatings {
        public static void main(String[] args) {
            int[] primitiveRatings = {4, 5, 3};
            ArrayList<Integer> wrapperRatings = new ArrayList<>();
            wrapperRatings.add(5);
            wrapperRatings.add(null);
            wrapperRatings.add(4);

            ArrayList<Integer> allRatings = new ArrayList<>();

            // Add primitive ratings (autoboxing)
            for (int r : primitiveRatings) {
                allRatings.add(r);
            }
            // Add wrapper ratings
            allRatings.addAll(wrapperRatings);
            int sum = 0;
            int count = 0;
            for (Integer rating : allRatings) {
                if (Objects.nonNull(rating)) {
                    sum += rating; // auto-unboxing
                    count++;
                }
            }
            double average = (count == 0) ? 0.0 : (double) sum / count;
            System.out.println("All Ratings: " + allRatings);
            System.out.println("Average Rating: " + average);
        }
}
