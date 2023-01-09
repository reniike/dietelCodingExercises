package chapterSix.arrays.chapterFour;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        System.out.println("Enter a number, enter any negative number to exit: ");
        int userInput = input.nextInt();

        int largestNumber =  userInput;
        int smallestNumber = userInput;


        while (userInput >= 0) {
            if (userInput > largestNumber) {
                largestNumber = userInput;
            }
            if (userInput < smallestNumber) {
                smallestNumber = userInput;
            }
            System.out.println("Enter a number, enter any negative number to exit: ");
            userInput = input.nextInt();
        }
        System.out.println("Smallest Number is " + smallestNumber);
        System.out.println("Largest number is " + largestNumber);
    }
}


