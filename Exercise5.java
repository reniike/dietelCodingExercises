package Neso;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {

        int[] numbers = {2,3,4,4,5,6,7,8,9,2};
        int[] temp = new int[numbers.length];


        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0){
               int userInput = numbers[index];
                System.out.println(userInput);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                int oddCount = numbers[i];
               System.out.println(oddCount);
            }
        }
    }
}
