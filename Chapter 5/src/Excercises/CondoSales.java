package Excercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int viewChoice;
     int parkingChoice;
     String result;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Pick a view for your Condo. \n1- for park view\n2- for golf course view"
     		+ "\n3-for lake view");
     viewChoice = input.nextInt();
     
     if(viewChoice == 1)
     {
    	 System.out.println("Park view is a great choice, this will cost $150,000.");
    	 System.out.println("How would you like to park?");
   	  	 System.out.println("1- For Garage/n2-For parking space");
   	  	parkingChoice = input.nextInt();
   	  
   	  	if(parkingChoice == 1)
   	  	{
   		  result = "You chose a Garage, your condo will now cost $155,000";
   	  	}
   	  	else if(parkingChoice == 2)
   	  	{
   		  	result = "You chose a basic parking space, nothing will be added to the price of your "
   		  		+ "condo";
   	  	}
   	  	else
   	  	{
   		  	result = "That was not a choice!!!!!!"; 
   	  	}
 	 }
     else if(viewChoice == 2)
     {
    	 System.out.println("golf course view is a great choice, this will cost $170,000.");
    	 System.out.println("How would you like to park?");
   	  	 System.out.println("1- For Garage/n2-For parking space");
   	  	parkingChoice = input.nextInt();
   	  
   	  	if(parkingChoice == 1)
   	  	{
   	  		result = "You chose a Garage, your condo will now cost $175,000";
   	  	}
   	  	else if(parkingChoice == 2)
   	  	{
   	  		result = "You chose a basic parking space, nothing will be added to the price of your "
   		  		+ "condo";
   	  	}
   	  	else
   	  	{
   	  		result = "That was not a choice!!!!!!"; 
   	  	}
     }
     else if(viewChoice == 3)
     {
    	 System.out.println("lake view is a great choice, this will cost $210,000.");
    	 System.out.println("How would you like to park?");
   	  	 System.out.println("1- For Garage/n2-For parking space");
   	  	 parkingChoice = input.nextInt();
   	  
   	  	 if(parkingChoice == 1)
   	  	 {
   	  		 result = "You chose a Garage, your condo will now cost $215,000";
   	  	 }
   	  	 else if(parkingChoice == 2)
   	  	 {
   	  		 result = "You chose a basic parking space, nothing will be added to the price of your "
   		  		+ "condo";
   	  	 }
   	  	 else
   	  	 {
   	  		 result = "That was not a choice!!!!!!"; 
   	  	 } 
     }
     else
     {	 
    	 result = "That was not a choice!!!!!!";
     }
     displayMessage(result);
     }
     public static void displayMessage(String result) {
 		System.out.println(result);
  }
}    
     
 		
	
