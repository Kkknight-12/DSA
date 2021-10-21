package Patterns2;

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int TotalNumberOfRows = input.nextInt();
//        int TotalNumberOfRows = 4;
        int rowNumber = 1;

        while( rowNumber <= TotalNumberOfRows ) {
            int count = TotalNumberOfRows - rowNumber + 1;
            int number = count;

            while( count > 0){
                System.out.print(number);
                count--;
            }

            System.out.println();
            rowNumber += 1;
        }

    }
}
