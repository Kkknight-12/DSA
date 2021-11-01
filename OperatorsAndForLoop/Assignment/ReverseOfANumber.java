package OperatorsAndForLoop.Assignment;

import java.util.Scanner;

public class ReverseOfANumber {
    static int revers(int num) {
        int reverseNumber = 0;
        while(num > 0){
            reverseNumber = reverseNumber * 10 + num % 10;
            num = num/ 10;
        }
        return reverseNumber;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int n = 1980;
        System.out.println(revers(n));
    }
}
