package Recursion;
import java.util.Scanner;

public class Sum {

    static int sum(int n)
    {
        if(n==1)
        return 1;
        else
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(sum(n));
        sc.close();
    }
}
