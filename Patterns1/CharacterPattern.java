package Patterns1;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int n = 4;
        int rowNumber = 1;

        while( rowNumber <= n ) {
            int count = rowNumber;
            char firstCharacter = (char)('A' + rowNumber - 1 );

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
