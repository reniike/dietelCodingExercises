package chapterSix;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        (Test for Leap Year) Write an application that prompts the user to enter an year and uses a
//        method called isLeapYear to check whether it is a leap year.
//        1. It is evenly divisible by 100
//        2. If it is divisible by 100, then it should also be divisible by 400
//        3. Except this, all other years evenly divisible by 4 are leap years.
//                Algorithm
//        1. Take integer variable year
//        2. Assign a value to the variable
//        3. Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
//        4. Check if the year is divisible by 400, DISPLAY "leap year"
//        5. Otherwise, DISPLAY "not leap year"

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        isLeapYear(year);

    }
    public static void isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)  {
                    System.out.println("It is a leap year.");
        } else{
            System.out.println("It is not a leap year.");
        }
    }
}
