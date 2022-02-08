//You are given a string s. You need to reverse the string.

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
class Reverse
{
    
    public static String reverseWord(String str)
    {
        // Reverse the string str
       int j=str.length()-1;
       String st="";
       while(j>=0)
       {
           st=st+str.charAt(j);
           j--;
       }
       str=st;
       return str;
   }
        
    
}
