package chapterSix.arrays.chapterFour;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: " );
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        int counter = 1;
        int power = 1;

        while (counter <= secondNumber){
            power = firstNumber * power;
            counter++;
        }
        System.out.printf("The power is %d", power);
    }
    private static void specialNegative (int firstNumber , int secondNumber ){
        int power  = 1;
       secondNumber *= 1;
        for (int counter = 0; counter <  secondNumber ; counter++){
            double res = 1 / (double)power;
            System.out.println(res);
        }

    }
}
