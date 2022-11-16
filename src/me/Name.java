package me;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String userInput = input.nextLine();

        System.out.printf("Good morning %s%n" , userInput);
    }
}
