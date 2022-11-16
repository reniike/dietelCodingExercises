package chapterTwo;

import java.util.Scanner;

	public class FeetToMeters {

	public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a value for feet: ");
	double feetValue = input.nextDouble();

	//one foot is 0.305 meter
	
	double feetMeters = feetValue * 0.305;
	
	System.out.printf ("%s feet is %.4f meters" , feetValue, feetMeters);

}
}
