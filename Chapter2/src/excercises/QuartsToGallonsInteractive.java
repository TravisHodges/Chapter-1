package excercises;
import java.util.Scanner;
public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
     int numberOfQuartsNeeded;
     int QTS_IN_GALLONS = 4;
	 int numberOfGallons;
     int numberOfQuartsRemaining;

     Scanner input = new  Scanner(System.in);
     
     System.out.println("How many quarts are needed? ");
     numberOfQuartsNeeded = input.nextInt();
     
     numberOfGallons = numberOfQuartsNeeded / QTS_IN_GALLONS;
     numberOfQuartsRemaining = numberOfQuartsNeeded % QTS_IN_GALLONS;
     
     System.out.println("This job needs " + numberOfQuartsNeeded + " quarts");
     System.out.println("A job that needs " + numberOfQuartsNeeded + " quarts requires "
    		 + numberOfGallons + " gallons plus " + numberOfQuartsRemaining + " quarts.");
	}
}
