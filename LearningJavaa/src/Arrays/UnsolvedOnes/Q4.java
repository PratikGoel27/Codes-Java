package Arrays.UnsolvedOnes;

public class Q4 {

    public static int TrappingRainWater(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        int currMax = arr[0];
        // LEFT MAX BOUNDRY:-
        for (int i = 1; i < n; i++) {
            if(arr[i] > currMax) {
                currMax = arr[i];
                leftMax[i] = currMax;
            }else {
                leftMax[i] = currMax;
            }
        }

        // RIGHT MAX BOUNDRY:-
        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1] =  arr[arr.length-1];
        int currMax2 = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] > currMax2) {
                currMax2 = arr[i];
                rightMax[i] = currMax2;
            }
            else {
                rightMax[i] = currMax2;
            }
        }
        int waterTrapped = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += (waterLevel - arr[i])*1;
        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        int arr[]={4, 2, 0, 3, 2, 5};
        System.out.println(TrappingRainWater(arr));
    }
    
}
