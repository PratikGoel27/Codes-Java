package BasicSortingAlgorithm;

public class SelectionSort {

    // SELECTION???????

    // public static void Sorting2(int[] arr) {
    //     for (int i = 0; i <= arr.length-2; i++) {
    //         for (int j = i+1; j <= arr.length-1; j++) {
    //             if(arr[i] > arr[j]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[i];
    //                 arr[i] = temp;
    //             }
    //         }
    //     }
    // }

    public static void Sorting2(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minpos] > arr[j]) {
                    minpos = j;
                }
            } 
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Sorting2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
