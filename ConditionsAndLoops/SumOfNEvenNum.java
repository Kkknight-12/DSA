package ConditionsAndLoops;

import java.util.Scanner;

public class SumOfNEvenNum {
    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int start = 1;
        int sum = 0;

        // condition
        while( start <= n ){
            // logic
            if( start % 2 == 0 ){
                sum += start;
            }
            start++;
        }
        System.out.println(sum);

    }
}
