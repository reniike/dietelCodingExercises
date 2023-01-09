package chapterSix.arrays.chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        if(userInput > 10){
            System.out.println("Out of range");
        }
        else {
            if(userInput % 2 == 0)
            System.out.println("This is an even number!");
            else{
            System.out.println("This is an odd number!");
        }

        }
        for (int i = 1; i <= 10; i++){
            System.out.println( i+ "");

           // int i = 1;
            //while ( i <= 10){
                //System.out.println(i+ " ");
               // i++;
           // }
        }
    }
}

