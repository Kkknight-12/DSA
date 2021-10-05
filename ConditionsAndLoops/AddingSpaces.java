package ConditionsAndLoops;

import java.util.Scanner;

public class AddingSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int val = 1;

        while( i<= n) {
            int space = 1;
            // space will in decrease as int space will increase
            while( space <= n - i ){
                System.out.print(" ");
                space +=1;
            }
            int j = 1;
            // on each iteration i will be equal to j
            // and will break on first iteration
            while( j<= i){
                System.out.print(val);
                val += 1;
                j += 1;
            }
            System.out.println();
            i += 1;
        }
    }
}
