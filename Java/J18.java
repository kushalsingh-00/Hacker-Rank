import java.util.Scanner;
//import java.util.Arrays;


public class J18 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length())
            return false;
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        java.util.Arrays.sort(c);
        java.util.Arrays.sort(d);
        for(int i=0;i<a.length();i++)
            if(c[i]!=d[i])
                return false;
        
        return true;
        
    }

  public static void main(final String[] args) {
    
        final Scanner scan = new Scanner(System.in);
        final String a = scan.next();
        final String b = scan.next();
        scan.close();
        final boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
