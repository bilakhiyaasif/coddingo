import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'\
        String temp="";
        int c=0,x=0;
        String s2[]=new String[s.length()];
        for(int i=0;i<s.length();i++)
        {
            if((i+k)>s.length())
            {
                break;
            }
            for(int j=i;j<(i+k);j++)
            {
                temp=temp+s.charAt(j);
                //System.out.print(s.charAt(j));

            }


            s2[x++]=temp;
          //  System.out.print(temp+" ");
            temp="";
        }



        for(int i=0;i<s2.length;i++)
        {
            System.out.println(s2[i]);
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
