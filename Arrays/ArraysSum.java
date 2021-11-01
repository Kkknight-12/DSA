package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysSum {

    public static ArrayList <Integer> input(){
        ArrayList <Integer> addition = new ArrayList<>();
        int output = 0;
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for( int i = 0; i < testCase; i++){
            int arraySize = input.nextInt();
            int array[] = new int[arraySize];

            for( int j = 0; j < arraySize; j++){
                 array[j] = input.nextInt();
            }
            output = sum(array);
            addition.add(output);
        }
        return addition;
    };

    public static int sum(int[] arr){
        int addition = 0;
        for( int i : arr ) {
            addition += i;
        }
        return addition;
    }

    public static void main(String[] args) {
        ArrayList<Integer> storedVaraibles = input();

        for (int storedVaraible : storedVaraibles) {
            System.out.println(storedVaraible);
        }
    }
}
