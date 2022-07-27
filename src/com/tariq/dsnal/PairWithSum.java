package com.tariq.dsnal;

import java.util.HashSet;
import java.util.Set;

public class PairWithSum {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,5};
        int[] array2 = {1,2,4,4};
        System.out.println("BruteForce approach: "+hasPairWithSumBruteForce(array1, 8));
        System.out.println("BruteForce approach: "+hasPairWithSumBruteForce(array2, 8));

        System.out.println("Optimized approach: "+hasPairWithSumOptimized(array1, 8));
        System.out.println("Optimized approach: "+hasPairWithSumOptimized(array2, 8));
    }

    public static boolean hasPairWithSumBruteForce(int[] listOfNumbers, int sum){
        for (int i: listOfNumbers) {
            for(int j: listOfNumbers){
                if(i+j==sum) return true;
            }
        }
        return false;
    }

    public static boolean hasPairWithSumOptimized(int[] listOfNumbers, int sum){
        Set<Integer> compliments = new HashSet<>();
        for (int number: listOfNumbers){
            if(compliments.contains(number)){
                return true;
            }else {
                compliments.add(sum-number);
            }
        }
        return false;
    }
}
