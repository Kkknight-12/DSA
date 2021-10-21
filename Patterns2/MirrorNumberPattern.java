package Patterns2;

import java.util.Scanner;

public class MirrorNumberPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int n = 4;
        int rowNumber = 1;

        while( rowNumber <= n ) {
            int count = 1;

            int space = 1;
            while( space <= n - rowNumber ){
                System.out.print(" ");
                space +=1;
            }

            while( count <= rowNumber  ) {
                System.out.print(count);
                count += 1;
            }

            System.out.println();
            rowNumber += 1;

        }

    }
}
