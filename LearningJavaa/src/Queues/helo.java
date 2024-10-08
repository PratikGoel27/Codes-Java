package Queues;

public class helo {
    public static void removeFirst(int[] arr) {
        arr[arr.length-1] = 0;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }   
}
