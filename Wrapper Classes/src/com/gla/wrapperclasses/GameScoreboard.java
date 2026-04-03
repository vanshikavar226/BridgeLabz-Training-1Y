package com.gla.wrapperclasses;

public class GameScoreboard {
        public static void main(String[] args) {
            Integer[] scores = {100, null, 200, 150, null, 300};
            int notPlayed = 0;
            int totalScore = 0;
            for (Integer score : scores) {
                if (score == null) {
                    notPlayed++;
                } else {
                    totalScore += score; // auto-unboxing
                }
            }
            System.out.println("Players not played: " + notPlayed);
            System.out.println("Total valid score: " + totalScore);
        }
}
