package excercises;
import java.util.Scanner;
public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int nauticalMiles;
     double trueMiles = 1.150779;
     double trueKm = 1.852;
     double miles;
     double kilometers;
     
     Scanner input = new  Scanner(System.in);
     
     System.out.println("How many Nautical Miles? ");
     nauticalMiles = input.nextInt();
     
     miles = nauticalMiles *trueMiles;
     kilometers = nauticalMiles * trueKm;
    
     System.out.println(nauticalMiles + " nautical miles is " + miles + " miles and " + kilometers +
    		 " kilometers.");
	}

}
