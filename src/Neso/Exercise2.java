package Neso;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int userInput = input.nextInt();
        int[] numbers = new int[userInput];

        int sum = 0;
        int product = 1;
        int average = 0;

        for (int index = 0; index < userInput; index++) {
            System.out.println("Enter a number: ");
            numbers[index] = input.nextInt();
            sum += numbers[index];
            product = numbers[index] * product;
            average = sum / userInput;
        }
        System.out.println(sum);
        System.out.println(product);
        System.out.println(average);
    }
}
