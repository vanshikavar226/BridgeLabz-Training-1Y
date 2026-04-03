package com.gla.wrapperclasses;
import java.util.ArrayList;
public class PriceAnalysis {
        public static void main(String[] args) {
            double[] prices = {10.5, 20.0, 35.75, 5.5};
            // Convert primitive array to ArrayList<Double>
            ArrayList<Double> priceList = new ArrayList<>();
            for (double price : prices) {
                priceList.add(price); // autoboxing
            }
            double max = priceList.get(0);
            double sum = 0;
            for (double price : priceList) {
                if (price > max) {
                    max = price;
                }
                sum += price;
            }
            double average = sum / priceList.size();
            System.out.println("Prices: " + priceList);
            System.out.println("Highest Price: " + max);
            System.out.println("Average Price: " + average);
    }
}
