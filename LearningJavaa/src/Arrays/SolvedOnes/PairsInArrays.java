package Arrays.SolvedOnes;

public class PairsInArrays {
    public static void Pairring(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        Pairring(arr);
    }
}
