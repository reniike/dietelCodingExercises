package me;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int counter;

        for (counter = 1; counter <= 10; counter++) {
            switch (counter) {
                case 1 -> System.out.println("Enter first grade: ");
                case 2 -> System.out.println("Enter second grade: ");
                case 3 -> System.out.println("Enter third grade: ");
                case 4 -> System.out.println("Enter fourth grade: ");
                case 5 -> System.out.println("Enter fifth grade: ");
                case 6 -> System.out.println("Enter sixth grade: ");
                case 7 -> System.out.println("Enter seventh grade: ");
                case 8 -> System.out.println("Enter eighth grade: ");
                case 9 -> System.out.println("Enter ninth grade: ");
                case 10 -> System.out.println("Enter tenth grade: ");
            }
            int grade = input.nextInt();
            while (isValidGradeScore(grade)) {
                System.out.println("Invalid grade, enter valid grade");
                grade = input.nextInt();
            }
            sum = sum + grade;
        }
        int average = sum / counter;
        System.out.printf("The sum of the grade is %d%n", sum);
        System.out.printf("The average of the grade is %d%n", average);
    }
    public static boolean isValidGradeScore(int grade) {
        return grade < 0 || grade > 100;
    }

}