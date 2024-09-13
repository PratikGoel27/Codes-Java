package Arrays.SolvedOnes;

public class SubArraySum1 {
    public static void MaxSubArraysSum(int arr[]) {
        // BRUTE FORCE APPROACH:-
        int count = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (minSum > sum) {
                    minSum = sum;
                }
                count++;
            }
        }
        System.out.println("Total Subarrays is: " + count);
        System.out.println("Maximum Sum is " + maxSum);
        System.out.println("Minimum Sum is " + minSum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        MaxSubArraysSum(arr);

    }
}

