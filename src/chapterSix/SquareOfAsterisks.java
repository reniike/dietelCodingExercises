package chapterSix;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int side = input.nextInt();
        asterisks(side);
    }
    public static void asterisks(int side){
        for (int count = 1; count <= side ; count++) {
            for (int asterisksCount = 1 ; asterisksCount <= side ; asterisksCount++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
