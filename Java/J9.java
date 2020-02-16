//End of File

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class J9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a;
        for(int i=1;sc.hasNextLine()==true;i++)
        {
            a=sc.nextLine();
            System.out.printf("%d %s\n",i,a);
        } 
        sc.close();
    }
}

