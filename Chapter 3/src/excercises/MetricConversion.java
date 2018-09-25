package excercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		
		Scanner input =new Scanner(System.in); 
		
		System.out.println("Enter a number >>");
	    num1 = input.nextDouble();
		
	    cmToIn(num1);
	    gallonsToLiters(num1);
	}
	    public static void cmToIn(double num1) {
    	double inches;
    	
    	inches = num1 * 0.39;
    	System.out.println(num1 + " centimeters is equal to " + inches + " inches");
    	}
	    public static void gallonsToLiters(double num1) {
	    	double liters;
	    	
	    	liters = num1 * 3.7854;
	    	System.out.println(num1 + " gallons is equal to " + liters + " liters");
	    }
}
