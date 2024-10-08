package GreedyAlgorithm.SolvedOnes;

import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {

        // WHEN THE RATIO ARRAY IS SORTED:-
        // int[] value = {60,100,120};
        // int[] weight = {10,20,30};
        // int W = 50;

        // int[] ratio = new int[3];

        // for (int i = 0; i < value.length; i++) {
        //     ratio[i] = value[i] / weight[i];
        // }

        // int capacity = 50;
        // int fValue = 0;

        // for (int i = 0; i < ratio.length; i++) {
        //     if(capacity >= weight[i]) {  //Yaha item completely pura aa jayega:-
        //         capacity -= weight[i];
        //         fValue += value[i];
        //     }else {  //Yaha item fraction mai ayega because bag mai sufficient jagah nahi hai:-
        //         fValue += capacity*ratio[i];
        //         break;
        //     }
        // }
        // System.out.println(fValue);


        // WHEN THE RATIO ARRAY IS NOT SORTED:-
        int[] value = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;

        double[][] ratio = new double[value.length][2];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        // SORTING IN ASCENDING ARRAY:-
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int fValue = 0;

        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) {  //Yaha item completely pura aa jayega:-
                capacity -= weight[idx];
                fValue += value[idx];
            }else {  //Yaha item fraction mai ayega because bag mai sufficient jagah nahi hai:-
                fValue += capacity*ratio[i][1];
                capacity = 0;
                break;
            }
        }
        System.out.println(fValue);
    }
}
