package Two_D_Arrays.SolvedOnes;
public class SpiralMatrix {

    public static void printSpiralMatrix(int[][] arr) {
    int startRow = 0;
    int startCol = 0;
    int endRow = arr.length-1;
    int endCol = arr[0].length-1;

    while(startRow <= endRow && startCol <= endCol) {
        // PRINTING TOP PART:-
        for (int i = startCol; i <= endCol; i++) {
            System.out.print(arr[startRow][i]+" ");
        }
        // PRINTING RIGHT PART:-
        for (int i = startRow+1; i <= endRow; i++) {
            System.out.print(arr[i][endCol]+" ");
        }
        // PRINTING BOTTOM:-
        for (int i = endCol-1; i >= startCol; i--) {
            System.out.print(arr[endRow][i]+" ");
        }
        // PRINTING LEFT PART:-
        for (int i = endRow-1; i > startRow; i--) {
            System.out.print(arr[i][startCol]+" ");
        }

        startRow++;
        startCol++;
        endCol--;
        endRow--;
    }
}
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        printSpiralMatrix(arr);
        
    }
}