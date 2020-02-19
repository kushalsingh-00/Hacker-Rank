/*
Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
*/
import java.io.*;
import java.util.*;

public class J14 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        int l1=A.length();
        int l2=B.length();
        System.out.println(l1+l2);
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
    


        
    }
}



