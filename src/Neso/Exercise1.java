package Neso;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to input between 1-20? ");
        int userInput = input.nextInt();

        int[] numbers = new int[userInput];

        if (userInput >= 1 && userInput <= 20) {
            for (int index = 0; index < userInput; index++) {
                System.out.println("Enter a number: ");
                numbers[index] = input.nextInt();
            }
            System.out.println(Arrays.toString(numbers));
        } else {
            System.out.println("Enter a number between 1- 20.");
        }

    }
}
