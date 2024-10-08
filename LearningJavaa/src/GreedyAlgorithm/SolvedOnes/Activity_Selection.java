package GreedyAlgorithm.SolvedOnes;
import java.util.*;
public class Activity_Selection {

    public static void main(String[] args) {
        // IF END TIME BASED SORTING IS THERE:-
        // int[] start = {1,3,0,5,8,5};
        // int[] end = {2,4,6,7,9,9};

        // ArrayList<Integer> ans = new ArrayList<>();
        // int maxAct = 0;

        // 1st activity:-
        // maxAct = 1;
        // ans.add(0);
        // int lastEnd = end[0];
        
        // for (int i = 1; i < end.length; i++) {
        //     if(start[i] >= lastEnd) {
        //         maxAct++;
        //         lastEnd = end[i];
        //     }
        // }

        // System.out.println("max activities = "+maxAct);
        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.println("A"+ans.get(i)+" ");
        // }
        // System.out.println();

        
        // IF THERE IS NO END TIME BASED SORTING:-
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sorting:-
        // lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        // 1st activity:-
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        
        for (int i = 1; i < end.length; i++) {
            if(start[i] >= lastEnd) {
                maxAct++;
                lastEnd = end[i];
            }
        }

        System.out.println("max activities = "+maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
