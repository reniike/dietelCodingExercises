package chapterSix;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int userInput = input.nextInt();

            System.out.println(isDivisible(userInput));
        }
    }
    public static boolean isDivisible(int userInput) {
        if (userInput % 5 == 0){
            return true;
        }
            return false;
    }
}
