package DivideAndConquer;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        quickSort(arr,0,arr.length-1);
        display(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partIdx = partition(arr,low,high);
            quickSort(arr,low,partIdx-1); //For Left SubArr
            quickSort(arr,partIdx+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i < j) {
            //Finding 1st greater element than pivot from front:-
            while(arr[i] <= pivot && i <= high-1) {
                i++;
            }
            //finding 1st smaller element than  pivot from last:-
            while(arr[j] > pivot && j >= low-1) {
                j--;
            }
            
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = pivot;
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
