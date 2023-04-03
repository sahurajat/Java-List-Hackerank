import java.io.*;
import java.util.*;

public class java_string {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA=A.length();
        int lenb=B.length();
        int finalLen=lenA+lenb;
        System.out.println(finalLen);
        if(lenA < lenb)
        {
            System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
        String str1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String str2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(str1 + " " + str2);  
        
    }
}



