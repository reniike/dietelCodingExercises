package chapterTwo;

import java.util.Scanner;

	public class Acceleration {

	public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter v0: ");
	double startingVelocity = input.nextDouble();

	System.out.println("Enter v1: ");
	double endingVelocity = input.nextDouble();

	System.out.println("Enter t: ");
	double timeSpan = input.nextDouble();

	double v0 = startingVelocity * 60;
	double v1 = endingVelocity * 60;
	double t = timeSpan * 60;
	
	double changeOfVelocity = v1 - v0;	
	double averageAcceleration = changeOfVelocity / t;

	
	System.out.printf ("The average acceleration is %.4f" , averageAcceleration);

}
}





	
	

