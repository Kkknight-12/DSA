package ConditionsAndLoops;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int n = 4;
        int outputNum = 1;
        int rowNumber = 1;

        while( rowNumber <= n ) {
            int count = 1;
            int space = n - rowNumber;

            while( space > 0 ){
                System.out.print(" ");
                space--;
            }

            if(rowNumber > 1 ) {
                while (count < rowNumber + outputNum) {
                    System.out.print("*");
                    count += 1;
                }
            }else{
                System.out.print("*");
            }

            System.out.println();
            rowNumber += 1;
            outputNum += 1;
        }

    }
}
