// A palindrome is a word, phrase, number, or other sequence 
// of characters which reads the same backward or forward.

// Given a string , print Yes if it is a palindrome, print No otherwise.

// Constraints

//  will consist at most  lower case english letters.
// Sample Input

// madam
// Sample Output

// Yes
import java.io.*;
import java.util.*;

public class pallindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        // /* Enter your code here. Print output to STDOUT. */
       boolean isPalindrome = true;
    for (int i = 0; i < s.length() / 2; i++)
     {
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
         {
            isPalindrome = false;
            break;
          }
      }

    if (isPalindrome)
     {
        System.out.println("Yes");
     }
     else
     {
        System.out.println("No");
     }

        
    }
}



