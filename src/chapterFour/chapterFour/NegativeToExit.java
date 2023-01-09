package chapterSix.arrays.chapterFour;

import java.util.Scanner;

public class NegativeToExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 1;
        System.out.println("Enter a number and enter any negative number to exit: ");
        int userInput = input.nextInt();

        while (userInput % 2 == 0) {
            //userInput = input.nextInt();
            int evenNumber = userInput;
            int sumOfEvenNumber = counter++;
            System.out.println("Enter a number and enter any negative number to exit: ");
            userInput = input.nextInt();

            if (userInput % 2 == 1) {
                //userInput = input.nextInt();
                int oddNumber = userInput;
                int oddNumbers = counter++;
                System.out.println("Enter a number and enter any negative number to exit: ");
                userInput = input.nextInt();

                int theTotal = total + counter  ;
                System.out.printf("number of odd numbers entered is %d" , oddNumbers);
                System.out.printf("number of even numbers is %d" , sumOfEvenNumber);
            }
           // int theTotal = total + counter  ;
            //System.out.printf("number of even numbers entered is %d" , oddNumbers);
        }

    }
}