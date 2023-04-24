package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        palindrome();
    }
    private static int countNumber(int number){
        int count = 0;
        if (number == 0){
            return 1;
        }
        while (number != 0){
            number = number / 10;
            count++;
        }
        return count;
    }

    private static void palindrome(){
        System.out.println("Enter a 5 digits number to know if its a palindrome: ");
        Scanner input = new Scanner(System.in);
        int userInput  = input.nextInt();
        int firstNumber = (userInput / 10000) % 10;
        int secondNumber = (userInput / 1000) % 10;
        int thirdNumber = (userInput / 100) % 10;
        int fourthNumber = (userInput / 10) % 10;
        int fifthNumber = (userInput / 1) % 10;
        if (countNumber(userInput) == 5) {
            if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
                System.out.println("This is a palindrome.");
            } else {
                palindrome();
            }
        }else {
            palindrome();
        }
    }
}
