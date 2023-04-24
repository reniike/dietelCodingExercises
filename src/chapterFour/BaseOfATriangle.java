package chapterFour;

import java.util.Scanner;

public class BaseOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the base of a triangle: ");
        int length = input.nextInt();

        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= i; j++) {
                if(length >= 1 && length <= 10) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
