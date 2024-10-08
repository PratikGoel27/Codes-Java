package GreedyAlgorithm.SolvedOnes;

import java.util.*;

public class Min_Absolute_Diff_Pairs {
    public static void main(String[] args) {
        int[] A = {1,4,7,8};
        int[] B = {2,3,5,6};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i]-B[i]);  //Calculates the absolute value:-
        }

        System.out.println("Min absolute diff of pairs: "+minDiff);
    }
}
