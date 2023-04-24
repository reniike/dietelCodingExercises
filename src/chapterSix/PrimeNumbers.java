package chapterSix;

import java.util.Scanner;

public class PrimeNumbers {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        primeNumbers();
    }
    private static void primeNumbers(){
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int userInput = input.nextInt();

        int counter = 0;
        for (int count = 1; count <= userInput; count++) {
            if (userInput % count == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("This is prime number.");
        } else
            System.out.println("This is not a prime number.");{
        }
    }
}
