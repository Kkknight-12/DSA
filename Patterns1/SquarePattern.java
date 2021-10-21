package Patterns1;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if( n > 0 && n <= 50){
            int row = 1;
            while( row <= n ){
                int column = 1;
                while (column <= n){
                    System.out.print(n);
                    column++;
                }
                row++;
                System.out.println();
            }
        }
    }
}
