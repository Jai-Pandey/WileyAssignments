package com.jai.reverse;

import java.util.*;

public class StringReverse {
		
	public static void reverse(String k)
    {
 
        // Create an empty character array stack
        Stack<String> s = new Stack<>();
        String[] token = k.split(" ");
 
        // Push words into the stack
        for (int i = 0; i < token.length; i++) {
            s.push(token[i]);
        }
 
        while (!s.empty()) {
 
            // Get the words in reverse order
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
	 public static void main(String[] args)
	    {
	        String k = "geeks for geeks";
	        reverse(k);
	    }
}
