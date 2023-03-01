package chapterFour;

import java.util.Scanner;

public class SpecificSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a specific number, the program will continuously asks for another number till the sum of the numbers is greater than or equal to the specific number: ");
        int userInput = input.nextInt();

       int sum = 0;
        while (sum < userInput) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            sum = sum + number;
                sum++;
        }
        System.out.printf("Sum is %d%n its now greater than or equal to the specific number.", sum);
    }
}
