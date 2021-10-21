package Patterns1;

import java.util.Scanner;

public class TriangleNumberPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int n = 4;
        int rowNumber = 1;

        while( rowNumber <= n ) {
            int count = rowNumber;

            while (count >= 1 ) {
                System.out.print(count);
                count -= 1;
            }

            System.out.println();
            rowNumber += 1;

        }

    }
}
