package com.gla.wrapperclasses;
import java.util.ArrayList;
public class SensorLogger {
        // Method accepting both primitive and wrapper
        public static void logTemperature(Double temp) {
            System.out.println("Logged Temperature: " + temp);
        }
        public static void main(String[] args) {
            double primitiveTemp = 25.5;
            Double wrapperTemp = 30.2;

            ArrayList<Double> tempList = new ArrayList<>();
            tempList.add(primitiveTemp);
            tempList.add(wrapperTemp);

            // Logging values
            logTemperature(primitiveTemp); // auto-boxing
            logTemperature(wrapperTemp);
            // Auto-unboxing while reading
            for (double t : tempList) {
                System.out.println("Read Temperature: " + t);
            }
        }
}
