package excercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int high = 0;
     int low = 100;
     int avg;
     int count = 0;
     int total = 0;
     int uChoice;
     int uExit = 0;
     
     Scanner input = new Scanner(System.in);
     
     do {
     System.out.println("Enter a Number to total >>> ");
     uChoice = input.nextInt();   
     
     if(uChoice >= high)
     {
         high = uChoice;
         count = count + 1;
     }
     else if(uChoice < low)
     {
    	 low = uChoice;
    	 count = count + 1;
     }
     else if(uChoice > 100 || uChoice < 0)
     {
    	 System.out.println("OUT OF RANGE");
     }
     total = total + uChoice;
     avg = total/count;
     
     System.out.println("The highest score was " + high);
     System.out.println("The average score was " + avg);
     System.out.println("The lowest score was " + low);
     System.out.println("The total score was " + total);
     
     System.out.print("Enter a number 999 to exit or another number to continue >>> ");
     uExit = input.nextInt();
    }while(uExit != 999);  
  }

}
