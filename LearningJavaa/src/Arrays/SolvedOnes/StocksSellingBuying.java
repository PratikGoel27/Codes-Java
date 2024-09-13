package Arrays.SolvedOnes;
public class StocksSellingBuying {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int narr[] = new int[prices.length];
        narr[0] = prices[0];
        int currMin = Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if(currMin > prices[i-1]) {
                currMin = prices[i-1];
                narr[i] = currMin;
            }
            else {
                narr[i] = currMin;
            }
        }
        
        int profit = 0;
        int MaxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(narr[i] <= prices[i]) {
                profit = prices[i] - narr[i];
            }else {
                profit = 0;
            }

            if(MaxProfit < profit) {
                MaxProfit = profit;
            }
        }

        System.out.println(MaxProfit);
        


        // for (int i = 0; i < narr.length; i++) {
        //     System.out.print(narr[i]+" ");
        // }
    }
}
