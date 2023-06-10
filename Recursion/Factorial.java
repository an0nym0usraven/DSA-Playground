package Recursion;
import java.util.Scanner;

public class Factorial {

    static int factorial(int f)
    {
        if (f==0)
            return 1;
        else
            return f * factorial(f-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(factorial(n));
        sc.close();
    }
}
