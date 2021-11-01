package OperatorsAndForLoop.Assignment;
import java.util.Scanner;

public class SquareRoot {

        public static int square(int number){
            int t;

            int squareroot = number / 2;

            do {
                t = squareroot;
                squareroot = (t + (number / t)) / 2;
            } while ((t - squareroot) != 0);

            return squareroot;
        }

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int number = sc.nextInt();
            int root;
            root = (int) square(number);
            System.out.println(root);
        }
}

