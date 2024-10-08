package Queues.SolvedOnes;
import java.util.*;
public class FirstNonRepeatingLetter {

    public static void FirstNonRepeatingLetter(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            q.add(ch);
            freq[ch - 'a']++;
             
            /*Method-1 */

            // while(!q.isEmpty()) {
            //     if(freq[q.peek()-'a'] == 1) {
            //         System.out.print(q.peek()+" ");
            //         break;
            //     }else {
            //         q.remove();
            //         if(q.isEmpty()) {
            //             System.out.print(-1+" ");
            //             break;
            //         }
            //     }
            // }

            /*Method-2 */

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        String str = "aabccxb";
        FirstNonRepeatingLetter(str);
    }
}
