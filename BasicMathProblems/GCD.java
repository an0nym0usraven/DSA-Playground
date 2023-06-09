package BasicMathProblems;
import java.util.Scanner;

public class GCD {

    //Brute Force Approach - O(n)
    static int gcd(int x,int y)
    {
        if(y>x)
        {
            y = y+x;
            x = y-x;
            y = y-x;
        }
        // System.out.println(x + " " + y);
        for(int i=y; i>1; i--)
        {
            if(x%i==0 && y%i==0)
                return i;
        }
        return 1;
    }

    //Euclid's Algo - O(logɸmin(a,b)), where ɸ is 1.61
    static int euclid(int a,int b)
    {
        if (b == 0)
            return a;
        else
            return euclid(b, a%b);
    }

    static int gcd2(int x, int y)
    {
        if(y>x)
        {
            y = y+x;
            x = y-x;
            y = y-x;
        }

        return euclid(x,y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int x = sc.nextInt();

        System.out.print("Enter number 2: ");
        int y = sc.nextInt();

        System.out.println(gcd2(x,y));
        sc.close();
    }
}
