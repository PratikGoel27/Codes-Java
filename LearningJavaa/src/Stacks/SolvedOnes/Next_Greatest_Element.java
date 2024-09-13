package Stacks;
import java.util.*;
public class Next_Greatest_Element {
    public static int[] NextGreatest(int[] arr, int[] narr) {
        // int j = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(j <= arr.length-1) {
        //         j = i+1;
        //     }
        //     while(arr[i] > arr[j] && j <= arr.length-1) {
        //         j++;
        //     }
        //     if(arr[i] > arr[j]) {
        //         narr[i] = -1;
        //     }else {
        //         narr[i] = arr[j];
        //     }
        // }

        // BRUTE FORCE APPROACH:-
        // boolean turns;
        // for (int i = 0; i < arr.length; i++) {
        //     turns = false;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[j] > arr[i]) {
        //             narr[i] = arr[j];
        //             turns = true;
        //             break;
        //         }
        //     }
        //     if(!turns) {
        //         narr[i] = -1;
        //     }
        // }

        // OPTIMISED APPROACH:- {T.C:- O(n)}:
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                narr[i] = -1;
            }else {
                narr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return narr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] narr = new int[arr.length];
        NextGreatest(arr,narr);
        printArr(narr);

    }
}