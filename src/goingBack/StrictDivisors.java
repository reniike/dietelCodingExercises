package goingBack;

import java.util.Scanner;

public class StrictDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        int counter = 1;
        int sum = 0;
        int div = userInput / 2;
        int sumOfEverything = 0;
        for (; counter <= div; counter++)
            if (userInput % counter == 0) {
                System.out.printf("The strict divisor is %d%n", counter);
                sum = counter + sum;
                sumOfEverything = sum + userInput;
            }
        System.out.printf("Sum of everything is %d%n", sumOfEverything);

    }
}
