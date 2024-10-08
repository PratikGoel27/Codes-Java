package GreedyAlgorithm.SolvedOnes;

import java.util.*;

public class Max_Length_Chain_of_Pairs {
    public static void main(String[] args) {
        int[][] pairs = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        // Sorting on the basis of 2nd num:-
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int chainLen = 0;
        int lastSelectedEnd;

        // Selected 1st pair:-
        chainLen = 1;
        lastSelectedEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > lastSelectedEnd) {
                chainLen++;
                lastSelectedEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of chain is: "+chainLen);
    }
}