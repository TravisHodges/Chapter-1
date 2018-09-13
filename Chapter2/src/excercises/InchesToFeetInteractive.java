package excercises;
import java.util.Scanner;
public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int numberOfInchesNeeded;
		 int INCHES_IN_A_FOOT = 12;	
    	 int numberOfFeet;
    	 int numberOfInchesRemaining;
    	 
	     Scanner input = new  Scanner(System.in);
	     
	     System.out.println("How many Inches? ");
	     numberOfInchesNeeded = input.nextInt();
	    
	     
    	 numberOfFeet = numberOfInchesNeeded / INCHES_IN_A_FOOT;
	     numberOfInchesRemaining = numberOfInchesNeeded % INCHES_IN_A_FOOT;
	     
	     System.out.println(numberOfInchesNeeded + " inches becomes " + numberOfFeet + " Feet and "
	    		 + numberOfInchesRemaining + " inches.");
	}
}
