package chapterTwo;

import java.util.Scanner;

	import java.lang.Long;

     public class NumberOfYears{

	public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of minutes: ");
	long minutes = input.nextLong();

	long minuteDaily = 1440;
	long minuteYearly = 52560;


	long years = minutes / minuteYearly;
	long days = (years % minuteDaily) /minuteDaily;


	System.out.printf ("%f minutes is approximately %f years and %f days" , minutes , years , days);

}
}
	

