package Arrays.SolvedOnes;

public class LinearSearch {
    public static int Search(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,34,4,5,6,67,78,9,0};
        // int key = 7;
        // int index = Search(arr, key);
        // if(index == -1) {
        //     System.out.println("Element not found");
        // }else {
        //     System.out.println(index);
        // }

        // LINEAR SEARCH IN A MENU:-
        String menu[] = {"dosa", "idli", "noodles", "momos"};
        String key = "momos";
        int index = Search(menu, key);
        if(index == -1) {
            System.out.println("Item is not there");
        }else {
            System.out.println(index);
        }
    }
}
