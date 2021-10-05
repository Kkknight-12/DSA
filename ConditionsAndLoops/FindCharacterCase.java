package ConditionsAndLoops;

import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        // taking the first letter from the input to check
        char ch = input.next().charAt(0);

        // conditional loop
        if(ch>=65 && ch<=90)
            System.out.println(1);
        else if(ch>=97 && ch<=122)
            System.out.println(0);
        else
            System.out.println(-1);
    }
}
