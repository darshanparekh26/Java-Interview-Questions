package ReverseString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string which you want to reverse");
        String org = s.next();

        String reverse1=method1(org);
        System.out.println(reverse1);

        String reverse2=method2(org);
        System.out.println(reverse2);
    }

    //Method1

    public static String method1(String s1)
    {
        String s2="";

        char c;

        System.out.println("Original String");
        System.out.println(s1);

        for (int i =0; i<s1.length(); i++)
        {
            c=s1.charAt(i);
            s2=c+s2;
          }
        System.out.println("Reverse String");
        return s2;
    }

    //Method2

    public static String method2(String s1)
    {
        byte[] s2 = s1.getBytes();
        System.out.println(Arrays.toString(s2));
        byte[] result = new byte[s2.length];
        System.out.println(Arrays.toString(result));

        for (int i=0; i<s2.length; i++)
            result[i] = s2[s2.length - i - 1];
return new String(result);
    }
}