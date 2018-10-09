package excercises;

import java.util.Scanner;

public class EvenEntryLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int numChoice;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Please pick a Number >>>");
     numChoice = input.nextInt();
     
     do {
     if(numChoice % 2 == 0) 
     {
    	System.out.println("Good Job!"); 
     }
     else
    	 System.out.println("ERROR!");
	 }while(numChoice != 999); 
  }	
}
