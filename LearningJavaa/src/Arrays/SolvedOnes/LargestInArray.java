package Arrays.SolvedOnes;

public class LargestInArray {
    public static int LargestElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,34,4,5,6,67,78,9,0};
        System.out.println("Largest Element in the array is: "+LargestElement(arr));
    }
    
}
