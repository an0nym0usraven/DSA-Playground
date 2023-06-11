package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static void fibo(int n1, int n2, int n)
    {
        if(n == 0)
        {
            System.out.print(n);
        }
        else{
            System.out.print(n1 + " ");
            fibo()
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fibo(0,1,n);
        sc.close();
    }
}
