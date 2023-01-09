package goingBack;

import java.util.Scanner;

public class By_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        if (userInput % 3 == 0) {
            System.out.printf("%d is divisible by 3", userInput);
        } else {
            System.out.printf("%d is not divisible by 3", userInput);
        }
    }
}
