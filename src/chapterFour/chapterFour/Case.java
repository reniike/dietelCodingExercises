package chapterFour.chapterFour;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("""
                1. 2000
                2. 5000
                3. 10000
                4. 15000
                5. 20000
                6. Other amounts
                """);

        System.out.println("Pick an option: ");
        int userInput = input.nextInt();
        switch (userInput) {
            case 6:
                System.out.println("Enter amount: ");
                String amount = input.next();
                handleOtherAmounts(amount);
            case 2:
                System.out.println("Take your 5k");
                break;
            case 1:
                System.out.println("Take your 2k");
                break;
//            case 2:
//                System.out.println("Take your 5k");
            case 3:
                System.out.println("Take your 10k");
                break;
        }
    }

    private static void handleOtherAmounts(String amount) {
        System.out.println("take your " + amount + "k");
    }
}
