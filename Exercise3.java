package Neso;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {1, 1, 1, 2, 3, 4};
        int count = 1;

        System.out.println(counter(numbers, count));
    }
    private static int counter(int[] numbers, int count){
        int occurance = 0;
        for (int index = 0; index < numbers.length; index++) {
           if (numbers[index] == count){
               occurance++;
           }
        }
        return occurance;
    }
}
