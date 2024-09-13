package Arrays.SolvedOnes;

public class TrappingRainWater {
    public static void main(String[] args) {
        // LEFT MAX BOUNDRY:-
        // int arr[] = {4,2,0,6,3,2,5};
        int arr[] = {4,2,0,3,2,5};
        int narr[] = new int[arr.length];
        narr[0] = arr[0];
        int currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > currMax) {
                currMax = arr[i];
                narr[i] = currMax;
            }else {
                narr[i] = currMax;
            }
        }
        // RIGHT MAX BOUNDRY:-
        int narr2[] = new int[arr.length];
        int currMax2 = arr[arr.length-1];
        narr2[narr2.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] > currMax2) {
                currMax2 = arr[i];
                narr2[i] = currMax2;
            }else {
                narr2[i] = currMax2;
            }
        }
        int waterTrapped = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(narr[i], narr2[i]);
            waterTrapped += waterLevel-arr[i];
        }
        
        System.out.println(waterTrapped);
    }
    
}
