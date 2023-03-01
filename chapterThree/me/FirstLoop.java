package chapterThree.me;

import java.util.Scanner;

public class FirstLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int userInput= input.nextInt();

        while (userInput < 1||userInput > 10){
            System.out.println("The number is not between 1 and 10, try again: ");
            userInput = input.nextInt();
        }
        System.out.println("The number is between 1 and 10. Thanks");
    }
}
