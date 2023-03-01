package chapterTwo;

import java.util.Scanner;

	public class Area {

	public static void main (String [] args) {

	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter x1: " ) ;
	double x1 = input.nextDouble ();

	System.out.println("Enter y1: ") ;
	double y1 = input.nextDouble ();

	System.out.println("Enter x2: ") ;
	double x2 = input.nextDouble ();

	System.out.println("Enter y2: ") ;
	double y2 = input.nextDouble();

	System.out.println("Enter x3: ");
	double x3 = input.nextDouble();

	System.out.println("Enter y3: ");
	double y3 = input.nextDouble() ;

	double a =  x1 * (y2 - y3);
	double b =  x2 * (y3 - y1);
	double c =  x3 * (y1 - y2);
  
	double area = 0.5 * (a + b + c);

	if (area < 0) {
	System.out.printf ("The area of the triangle is %.2f" , area *-1);}
else {
	System.out.printf ("The area of the triangle is %.2f" , area);
}

}
}

	
	

	
