package Two_D_Arrays.UnsolvedOnes;

public class Q2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if(i == 1) {
                    sum += nums[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    
}
