package BasicSortingAlgorithm;

public class BubbleSort {
    public static void Sorting1(int[] arr) {
        boolean swaps = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    // SWAPING:-
                    int  temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swaps = true;
                }
            }
            if(swaps == false) {
                System.out.println("Array is already sorted");
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Sorting1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
