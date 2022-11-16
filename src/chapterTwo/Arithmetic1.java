package chapterTwo;

import java.util.Scanner;

   public class Arithmetic1{

	public static void main(String [] args){

 	Scanner input= new Scanner(System.in); 

	System.out.println("12 34");
	System.out.print("1");
	System.out.print("2");
	System.out.print(" 3");
	System.out.print("4\n");
	System.out.printf("%s%n", "12 34");

	System.out.print(" Enter first interger: ");
	int number1= input.nextInt();

	System.out.print(" Enter second interger: ");
	int number2= input.nextInt();
	int number3= number1 * number1;
	int number4= number2 * number2;
	int sum= number3 + number4;
	int diff= number3 - number4;
	
	System.out.printf("sum is %d%n", sum);
	System.out.printf("diff is %d%n", diff);

	
}
}