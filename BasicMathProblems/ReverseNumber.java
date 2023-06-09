package BasicMathProblems;
import java.util.Scanner;

public class ReverseNumber {

    static int reverse(int num)
    {
        int res = 0;
        while(num>0)
        {
            int temp = num%10;
            res = res*10 + temp;
            num = num/10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(reverse(n));
        sc.close();
    }
}
