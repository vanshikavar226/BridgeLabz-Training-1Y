package com.gla.JAVATest;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4));
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}