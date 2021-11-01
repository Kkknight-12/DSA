package OperatorsAndForLoop.Assignment;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res;
        int no=1, count=0;;

        while(count<n) {
            res = 3*no+2;
            if( res%4 != 0 ) {
                System.out.print(res+" ");
                count++;
            }
            no++;
        }
    }
}
