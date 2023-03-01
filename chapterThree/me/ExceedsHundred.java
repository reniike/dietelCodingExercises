package chapterThree.me;

import java.util.Scanner;

public class ExceedsHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while (sum <= 100) {
            System.out.println("Enter a number :");
            sum += input.nextInt();

        }
        System.out.println("Done " + sum);
    }
}
