package ConditionsAndLoops;

import java.util.Scanner;

public class NumberWithPattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int n = 3;
        int rowNumber = 1;

        while( rowNumber <= n ) {
            int OutputNumber = rowNumber;
            int count = 1;
            int space = n - rowNumber;
            while( space > 0 ){
                System.out.print(" ");
                space--;
            }
            while( count <=  rowNumber ){
                System.out.print(OutputNumber);
                OutputNumber += 1;
                count += 1;
            }
            System.out.println();
            rowNumber += 1;
        }
    }
}
