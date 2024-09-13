package Arrays.SolvedOnes;

public class SubArraySum2 {
    public static void MaxSubArrSum(int arr[]) {
        // PREFIX SUM:-
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int narr[] = new int[arr.length];
        narr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            narr[i] = arr[i]+narr[i-1];
        }
        
        for(int i = 0; i < arr.length; i++) {
            CurrSum = 0;
            for (int j = i; j < arr.length; j++) {
                CurrSum = i == 0 ? narr[j] : narr[j] - narr[i-1];
            }
            if(CurrSum > MaxSum) {
                MaxSum = CurrSum;
            }
        }
        System.out.println("Max Sum is: "+MaxSum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        MaxSubArrSum(arr);
    }
}
