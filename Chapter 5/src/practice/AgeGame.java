package practice;

import java.util.Scanner;

public class AgeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int usersAge;
      String result;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter your age to be insulted");
      usersAge = input.nextInt();
      
      if(usersAge >= 12)
      {
	   result = "You are a child! Go away";
      }
      else if (usersAge >= 13 && usersAge <= 25)
      {
       result = "You ara a snotty teen hhahaha";
      }
      else if (usersAge >= 19 && usersAge <= 25)
      {
       result = "Get a job!";  
      }
      else if(usersAge >= 26 && usersAge <= 30)
      {
       result = "You're past your prime!"; 
      }
      else if(usersAge >= 31 && usersAge <= 40)
      {
       result = "You're old now!";
      }
      else if(usersAge >= 41 && usersAge <= 50)
      {
       result = "";  
      }
      //0-12
      //13-18
      //19-25
      //26-30
      //31-40
      //41-50
      //51 - 60
      //61 - death
	}
	public static void displayMessage(String result) {
		System.out.println(result);
	}	
}