package Patterns2;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int n = 4;
        int rowNumber = 1;

        while( rowNumber <= n ) {
            int space = n - rowNumber;

            while( space > 0 ){
                System.out.print(" ");
                space--;
            }

            int j = 1;
            int p = rowNumber;
            while ( j <= rowNumber) {
                System.out.print(p);
                p++;
                j++;
            }

            p = p - 2;
            int l = 1;
            while (l <= rowNumber - 1){
                System.out.print(p);
                p--;
                l++;
            }


            System.out.println();
            rowNumber += 1;
        }
    }
}
