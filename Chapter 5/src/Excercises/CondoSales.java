package Excercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int viewChoice;
     String result;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Pick a view for your Condo. \n1- for park view\n2- for golf course view"
     		+ "\n3-for lake view");
     viewChoice = input.nextInt();
     
     if(viewChoice == 1)
     {
 	    result = "you chose a park view condo this will cost $150,000.";
 	 }
     else if(viewChoice == 2)
     {
        result = "you chose a golf course view condo this will cost $170,00.";
     }
     else if(viewChoice == 3)
     {
    	result = "you chose a lake view condo this will cost $210,000."; 
     }
     else
     {	 
    	 result = "That was not a choice!!!!!!";
    	 displayMessage(result);
     }
     }
     public static void displayMessage(String result) {
 		System.out.println("You won " + result);
  }
}    
     
 		
	
