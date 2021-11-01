package OperatorsAndForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {

    static int Fibonacci(int n)
    {
        if (n <= 1)
            return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();

        System.out.println( Fibonacci(n) );
    }

}
