//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class ReverseSentence {
    public static void main(String[] args) {
		String S = "i.like.this.program.very.much";
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
	
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String S) {
        // Split the string based on dots.
        String[] words = S.split("\\.");
        
        // Create a StringBuilder for efficient string manipulation.
        StringBuilder reversed = new StringBuilder();
        
        // Loop from the last word to the first word.
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(".");  // Add the dot except after the last word.
            }
        }
        
        return reversed.toString();  // Convert StringBuilder to string and return.
    }
}
