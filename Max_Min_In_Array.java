//Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            pair product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
            
        }
	}
}


class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
      long len = a.length;
      
       pair element = new pair(a[0],a[0]);
       
       int i =0 ;
       while(i<len){
       
           if (element.first > a[i])
           {
               element.first = a[i];
           }
           if(element.second < a[i])
           {
               element.second = a[i];
           }
       i++;
           
       }
       return element;
   }
    
}
