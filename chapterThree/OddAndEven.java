package chapterThree;
import java.util.Scanner;
public class OddAndEven{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        int number = userInput % 2;

        if(number == 1) {
            System.out.printf("%s is an odd number", userInput);
        }
            if (number  == 0 ){
                System.out.printf("%s an even number " , userInput);
            }






        }
    }