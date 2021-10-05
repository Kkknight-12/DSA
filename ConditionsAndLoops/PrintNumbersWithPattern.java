package ConditionsAndLoops;

import java.util.Scanner;

public class PrintNumbersWithPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int n = 3;
        int rowNumber = 1;

        while( rowNumber <= n ) {
            int OutputNumber = rowNumber;
            int count = 1;
            // on each iteration i will be equal to j
            // and will break on first iteration
//            while( OutputNumber <= ( 2 * rowNumber - 1 )){
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
