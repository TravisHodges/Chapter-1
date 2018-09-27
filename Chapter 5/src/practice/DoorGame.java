package practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int doorChoice;
      int chestChoice;
      int bookChoice;
      String result;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome to the amazing door choice game!");
      System.out.println("Your host Steve Harvey");
      System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3-for door Three");
      doorChoice = input.nextInt();
      
      if(doorChoice == 1)
      {
    	  System.out.println("Door 1 good choice choose among the following Chests.");
    	  System.out.println("1- For Chest One/n2-For Chest Two");
    	  chestChoice = input.nextInt();
    	  
    	  if(chestChoice == 1)
    	  {
    	    result = "a pile of gold";
    	  }
    	  else if(chestChoice == 2)
    	  {
    		  result = "EMPTY Hahahahahaha...ha!";
    	  }
    	  else
    	  {
    		  result = " just kidding, I said 1 or 2!, now die!"; 
    	  }
      }
      else if(doorChoice == 2) {
    	  result = "a donkey";
      }
      else if(doorChoice == 3) {
    	  result = "a barely competent cashier and you're third in line.";
      }
      else if(doorChoice == 999) {
    	  System.out.println("You enter a special room with 3 books on the table, there are no "
    	  		+ "words on the cover. Do you choose Book 1, Book 2, or Book 3?");
    	  bookChoice = input.nextInt();
    	  if(bookChoice == 1)
    	  {
    	   result = "wrong choice choose book 3 ";  
    	  }  
    	  else if(bookChoice == 2)
    	  {
    		  result = "The book exploded, You're dead";
    	  }
    	  else if(bookChoice == 3)
    	  {
    		  result = "wrong choice choose book 2";
    	  }
    	  else
    	  {
    		  result = "you found secret treasure in a box under the table, YOU WON!";
    	  }
      }
      else
    	  result = "nothing because that was not a choice! ";
      displayMessage(result);
	}
	public static void displayMessage(String result) {
		System.out.println("You won " + result);
	}

}
