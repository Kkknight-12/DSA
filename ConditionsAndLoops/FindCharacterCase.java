package ConditionsAndLoops;

import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        char ch = input.next().charAt(0);
        if(ch>=65 && ch<=90)
            System.out.println(1);
        else if(ch>=97 && ch<=122)
            System.out.println(0);
        else
            System.out.println(-1);
    }
}
