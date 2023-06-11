package Recursion;
import java.util.Scanner;


public class CheckPalindrome {
    static boolean isPalindrome(String s, int start, int end)
    {
        if(start<end)
        {
            if(s.charAt(0) == s.charAt(end))
            isPalindrome(s, start+1, end-1);
            else
            return false;
        }
       
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String x = Integer.toString(num);
        System.out.println(isPalindrome(x, 0, x.length()-1));
        sc.close();
    }
}
