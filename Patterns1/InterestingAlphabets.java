package Patterns1;

import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int n = 8;
        int rowNumber = 1;

        while( rowNumber <= n ) {
            int count = rowNumber;
            char firstCharacter = (char)( 'A' + n - rowNumber );

            while( count >= 1 ) {
                System.out.print(firstCharacter);
                firstCharacter += 1;
                count -= 1;
            }

            System.out.println();
            rowNumber += 1;

        }

    }
}
