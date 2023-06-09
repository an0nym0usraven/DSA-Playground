package BasicMathProblems;
import java.util.Scanner;

public class CountDigits
{
    //Approach 1 [O(log(n)) where n is number of digits in the given number]
    static int count(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n /= 10;
            count++;
        }
        return count;
    }

    //Approach 2 [O(1)]
    static int count_2(int n)
    {
        String num = Integer.toString(n);
        return num.length();
    }

    //Approach 3[O(1)]
    static int count_3(int n)
    {
        int len = (int) (Math.floor(Math.log10(n)) + 1);
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(count(n));
        // System.out.println(count_2(n));
        // System.out.println(count_3(n));
        sc.close();
    }
}