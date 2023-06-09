package BasicMathProblems;
import java.util.Scanner;

public class CheckPalindrome {

    static boolean isPalindrome(int n)
    {
        int num = n;
        int res = 0;
        while(n>0)
        {
            int temp = n%10;
            res = res*10 + temp;
            n = n/10;
        }
        if(res == num)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println(isPalindrome(num));
        sc.close();
    }
}
