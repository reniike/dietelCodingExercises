package chapterTwo;

import java.util.Scanner;

	public class Equality {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Input first number: ");
	int firstNumber = input.nextInt();

	System.out.println("Input second number: ");
	int secondNumber = input.nextInt();

	System.out.println("Input third number: ");
	int thirdNumber = input.nextInt();

	System.out.println("Input fourth number: ");
	int fourthNumber = input.nextInt();


	if(firstNumber== secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber){
	System.out.println("Numbers are equal");}

	if(firstNumber != secondNumber && secondNumber != thirdNumber && thirdNumber != fourthNumber){
	System.out.println("Numbers are not equal");}
}
}


 
	










