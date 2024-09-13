package Stacks;
import java.util.*;
public class Reversing_A_String {
    public static StringBuilder reverseString(String str) {
        Stack<Character> s = new Stack<>();
        // ADDING EACH CHARACTERS OF THE STRING TO THE STACK:-
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder("");
        // REMOVING THE ELEMENTS FROM THE STACK:- 
        while(!s.isEmpty()) {
            sb.append(s.peek());
            s.pop();
        }
        return sb;
    }

    public static void main(String[] args) {
        String str = "pratik";
        System.out.println(reverseString(str));
    }
    
}
