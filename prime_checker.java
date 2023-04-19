/*
You are given a class Solution and its main method in the editor. Your task is to create a class Prime which contains a single method checkPrime so that the code prints only prime numbers as the output.
Please do not use method overloading!
Input Format
There are only five lines of input, each containing one integer.
Output Format
There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to checkPrime in the main method of the class Solution. In case there is no prime number, then a blank line should be printed.
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

import static java.lang.System.in;
class Prime {
    void checkPrime(int... arr) {   //xp:1
        int n = arr.length-1;
        for(int i=0; i<=n; i++) {
          int count = 0;
          for(int j=1; j<=arr[i]; j++) {
              if(arr[i]%j == 0) count++;
          }  
          if(count == 2) System.out.print(arr[i] + " ");
        }        
        System.out.println();
    }
}

public class prime_checker  {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));    //xp:2
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);  //xp:3
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();  //xp:4
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());

		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}