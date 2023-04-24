package chapterFour;

import java.util.Scanner;

public class TaxCalculatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter citizen's " + i + " name: ");
            String name = input.nextLine();
            System.out.println("Enter citizen's " + i + " earning: ");
            double earning = input.nextDouble();
            System.out.println("Enter year: ");
            int year = input.nextInt();
            input.nextLine();

            TaxCalculator taxCalculator = new TaxCalculator(name , earning, year);
            taxCalculator.setTax();
            double result = taxCalculator.getTax();
            System.out.println(result);
        }
    }
}
