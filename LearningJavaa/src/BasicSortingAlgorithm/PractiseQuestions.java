package BasicSortingAlgorithm;

public class PractiseQuestions {
    public static void CountingSort(int[] arr) {
        // DESCENDING ORDER:-

        // FINDING LARGEST ELEMENT:-
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        int narr[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            narr[a]++;
        }

        int j = 0;
        for (int i = narr.length-1; i >= 0; i--) {
            while(narr[i] > 0) {
                arr[j] = i;
                j++;
                narr[i]--;
            }
        }
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = 0; j <= arr.length-2-i; j++) {
                if(arr[j+1] > arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]> arr[minpos]) {
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }

    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // CountingSort(arr);
        // BubbleSort(arr);
        SelectionSort(arr);
        PrintArr(arr);
       
    }
    
}
