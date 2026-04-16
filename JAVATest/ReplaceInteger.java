package com.gla.JAVATest;
import java.util.*;
public class ReplaceInteger {
    public static void main(String[] args){
        int num = 102030;
        String str = Integer.toString(num);
        str = str.replace("0","1");
        int result = Integer.parseInt(str);
        System.out.println("After Replacing:" + result);
    }
}
