package chapterTwo;

import java.util.Scanner;

     public class Minutes{

	public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of minutes: ");
	int minutes = input.nextInt();

	int hours = minutes/60;
	int days = hours/24;
	int years = days/365;
	int remainder = days % 365;


	System.out.printf ("%s minutes is approximately %s years and %s days" , minutes , years , remainder);

}
}
	

