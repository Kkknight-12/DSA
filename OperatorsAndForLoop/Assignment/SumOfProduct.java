package OperatorsAndForLoop.Assignment;

import java.util.Scanner;

public class SumOfProduct {

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    static int sum( int n) {
        int sum = 0;
        for( int i = 0; i <= n; i++){
            sum +=i;
        }
        return  sum;
    }

    public static void main(String args[]){
        int i, fact=1, addition = 1;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int option = input.nextInt();

        fact = factorial(n);
        addition = sum(n);

        if( option == 2){
            System.out.println(fact);
        }else if( option == 1){
            System.out.println(addition);
        }else{
            System.out.println(-1);
        }
    }
}
