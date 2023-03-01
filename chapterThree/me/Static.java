package chapterThree.me;

import java.security.SecureRandom;
import java.util.Scanner;

public class Static {
    SecureRandom secureRandom = new SecureRandom();
    int reneke = secureRandom.nextInt(100,200);


    public static void addTwoNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number");
        int num = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num + num2);
    }

    public void printRandomNumber(){
        System.out.println(reneke);
    }
}
