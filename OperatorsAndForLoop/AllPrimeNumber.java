package OperatorsAndForLoop;

import java.util.Scanner;

public class AllPrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int n = 9;

        for( int i=2 ; i<=n; i++ ) {
            int count=0;
            for(int j=2; j<=i; j++) {
                if( i%j ==0 )
                    count++;
            }
            // count must be 1 to be a prime number,
            // as prime number is divisible 1 and itself
            if(count==1)
                System.out.println(i);
        }
    }
}
