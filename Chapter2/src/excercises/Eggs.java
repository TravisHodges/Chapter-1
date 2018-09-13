package excercises;
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int eggsWanted;
     double dozenCost = 3.25;
     double individualCost = 0.45;
     int dozenAmount;
     int individualAmount;
     double total;
     
     Scanner input = new  Scanner(System.in);
     
     System.out.println("How many eggs would you like? ");
     eggsWanted = input.nextInt();
     
     dozenAmount = eggsWanted / 12;
     individualAmount = eggsWanted % 12;
     total = (dozenCost * dozenAmount) + (individualCost * individualAmount);
     
     System.out.println("You wanted " + eggsWanted + " eggs");
     System.out.println("That is " + dozenAmount + " dozen at the price of $" + dozenCost + 
    		 " per dozen and " + individualAmount + " individual eggs at the price of $" + individualCost
    		 + " per individual.");
     System.out.println(" for a total of $" + total + ".");
	}

}
