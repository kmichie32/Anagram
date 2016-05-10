package com.kevinmichie;

import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String A, String B) {

        if(A.length() != B.length()){
            return false;
        }

        String convertedA = A.toLowerCase();
        String convertedB = B.toLowerCase();


        char[] charHolderA = new char[convertedA.length()];
        char[] charHolderB = new char[convertedB.length()];

        for (int i = 0; i < convertedA.length(); i++) {
            charHolderA[i] = convertedA.charAt(i);
        }

        for (int i = 0; i < convertedB.length(); i++) {
            charHolderB[i] = convertedB.charAt(i);
        }

        char[] arraySwap = new char[2];
        for (int i = 0; i < charHolderA.length; i++) {
            for (int j = 0; j < charHolderA.length - 1; j++) {
                if (charHolderA[j] > charHolderA[j + 1]) {
                    arraySwap[0] = charHolderA[j + 1];
                    arraySwap[1] = charHolderA[j];
                    charHolderA[j] = arraySwap[0];
                    charHolderA[j + 1] = arraySwap[1];
                }
            }
        }

        char[] arraySwap2 = new char[2];
        for (int i = 0; i < charHolderB.length; i++) {
            for (int j = 0; j < charHolderB.length - 1; j++) {
                if (charHolderB[j] > charHolderB[j + 1]) {
                    arraySwap2[0] = charHolderB[j + 1];
                    arraySwap2[1] = charHolderB[j];
                    charHolderB[j] = arraySwap2[0];
                    charHolderB[j + 1] = arraySwap2[1];
                }
            }
        }


        for (int i = 0; i < charHolderA.length; i++) {
            if (charHolderA[i] != charHolderB[i]) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}
