package BasicSortingAlgorithm;

public class CountingSort {
    public static void Sorting3(int[] arr) {
        
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        // CREATING COUNT ARRAY(OR FREQUENCY ARRAY):-
        int[] narr = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            narr[a]++;
        }
        // MAIN STEP:-(TRAVERSING OVER THE NEW ARRAY OR COUNT ARRAY)
        int j = 0;
        for (int i = 0; i < narr.length; i++) {
            while(narr[i] > 0) {
                arr[j] = i;
                j++;
                narr[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        Sorting3(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
