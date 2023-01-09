package chapterSix.arrays.chapterFour;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        for( int counter = 1 ; counter <= 12 ; counter++){
            System.out.printf("%d times %d is %d%n" , userInput, counter , (counter * userInput));
        }
    }
}
