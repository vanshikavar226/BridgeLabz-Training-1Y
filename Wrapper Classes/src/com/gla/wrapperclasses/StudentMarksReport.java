package com.gla.wrapperclasses;

public class StudentMarksReport {
        public static void main(String[] args) {
            Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};
            int sum = 0;
            int count = 0;
            for (Object obj : inputs) {
                try {
                    Integer mark = null;

                    if (obj instanceof Integer) {
                        mark = (Integer) obj;
                    } else if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.equalsIgnoreCase("null")) {
                            mark = Integer.parseInt(str);
                        }
                    }

                    if (mark != null) {
                        sum += mark;
                        count++;
                    }

                } catch (NumberFormatException e) {
                    // ignore invalid entries like "abc"
                }
            }

            double average = (count > 0) ? (double) sum / count : 0;
            System.out.println("Valid entries: " + count);
            System.out.println("Average marks: " + average);
        }
}
