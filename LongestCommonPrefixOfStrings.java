//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class LongestCommonPrefixOfStrings
 {
    public static void main(String args[]) throws IOException {
      /*  BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
		*/
		Solution ob = new Solution();
		String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println(ob.longestCommonPrefix(arr));
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public String longestCommonPrefix(String arr[]) 
    {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        
        char[] first = arr[0].toCharArray();
        char[] last = arr[arr.length-1].toCharArray();
        for(int i=0;i<first.length;i++)
        {
            if(first[i] != last[i])
                {
                    break;
                }
            else
                {
                    sb.append(first[i]);
                
                }
        }
    
     if(sb.toString().isEmpty()) return "-1";
	
	else
    return sb.toString();
    }
}