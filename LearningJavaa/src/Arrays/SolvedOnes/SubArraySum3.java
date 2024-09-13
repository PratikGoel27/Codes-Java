package Arrays.SolvedOnes;

public class SubArraySum3 {
    // KADAN'S ALGORITHM:-
    public static void MaxSubArraysSum(int arr[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if((currSum) < 0) {
                currSum = 0;
            }
            if(currSum > MaxSum) {
                MaxSum = currSum;
            }
        }
        System.out.println(MaxSum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        MaxSubArraysSum(arr);
    }  
}
