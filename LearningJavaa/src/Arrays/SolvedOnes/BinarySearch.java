package Arrays.SolvedOnes;

public class BinarySearch {
    public static int Search(int arr[], int key) {
        int i = 0;
        int j = arr.length-1;
        while(i <= j) {
            int mid = (i+j)/2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] > key) {
                j = mid-1;
            }else {
                i = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,34,4,5,6,7,8,9,90};
        int key = 7;
        System.out.println("Element is present at: "+Search(arr, key));
        // dkghskjgalkjgelkjrg
    }
    
}
