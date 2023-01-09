package chapterSix.arrays.chapterFour;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 - 11 to know the roles: ");
        int userInput = input.nextInt();

        switch(userInput){
            case 1:
                System.out.println("GoalKeeper");
                break;
            case 2:
            case 5:
            case 4:
            case 3:
                System.out.println("Defender");
                break;
            case 6:
            case 8:
            case 7:
                System.out.println("Midfielder");
                break;
            case 9:
            case 10:
                System.out.println("Attacker");
                break;
            case 11:
                System.out.println("Attacker");
            default:
                System.out.println("Invalid");
        }
    }
}
