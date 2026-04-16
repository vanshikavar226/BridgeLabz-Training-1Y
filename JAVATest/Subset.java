package com.gla.JAVATest;
import java.util.*;
public class Subset {
    public static void main(String[] args){
        int[]A= { 1,2,3,4,5};
        int[]B= { 3,4,5};
        int[]C= { 1,2,3,4};
        int[]D= { 1,2,9};
        HashSet<Integer> set = new HashSet<>();
        for(int num: A){
            set.add(num);
        }
        boolean isSubset = true;
        for(int num : B){
            if(!set.contains(num)){
                isSubset = false;
                break;
            }
        }
        if(isSubset)
            System.out.println("Bis a subset of A:");
        else
            System.out.println("B is a subset of A:");
    }
}
