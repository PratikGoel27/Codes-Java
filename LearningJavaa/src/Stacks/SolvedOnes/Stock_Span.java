package Stacks.SolvedOnes;
import java.util.*;
public class Stock_Span {
    public static void StockSpan(int[] Stock, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < Stock.length; i++) {
            int currPrice = Stock[i];
            while(!s.isEmpty() && currPrice > Stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                Stock[i] = i+1;
            }else {
                Stock[i] = i-s.peek();
            }

            s.push(i);
        }
    }
    
}
