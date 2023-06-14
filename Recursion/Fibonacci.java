package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n)
    {
        if(n < 2)
        {
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            System.out.print(fibo(i) + " ");
        }
        
        sc.close();
    }
}
