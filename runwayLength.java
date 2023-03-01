package chapterTwo;

import java.util.Scanner;

	public class runwayLength {

	public static void main (String [] args){

	Scanner input = new Scanner(System.in);


	System.out.println("Enter v in m/s: ");
	double v = input.nextDouble();
	
	System.out.println("Enter a in m/s: ");
	double a = input.nextDouble();

	
	double vSquare = v * v;
	double twoA = 2 * a ;
	double length = vSquare / twoA;

	
 	System.out.printf ("The minimum runway length for this airplane is %.3f" , length );

}

}


	
	
	