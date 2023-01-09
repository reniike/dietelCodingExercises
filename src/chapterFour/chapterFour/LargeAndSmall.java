package chapterSix.arrays.chapterFour;

import java.util.Scanner;

public class LargeAndSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number or enter 0 to quit: ");
        int userInput = input.nextInt();
        int small = userInput;
        int large = userInput;

       // while (userInput >= 1){
            //userInput = input.nextInt();

        do {

            if (userInput > large){
                 large = userInput;
            }
            if (userInput < small){
                small = userInput;
            }
            System.out.println("Enter a number or enter 0 to quit: ");
            userInput = input.nextInt();
        }
        while (userInput != 0);

        System.out.println("smallest number is " + small );
        System.out.println("largest number is "+ large);
    }
}
