package Excercises;

import java.util.Scanner;

class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int talkUsed;
		int textSent;
		int dataUsed;
		
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the maximum amount of minutes you use on talk monthly? >>");
		talkUsed = input.nextInt();
		System.out.println("What is the maximum amount of texts you send monthly? >>");
		textSent = input.nextInt();
		System.out.println("What is the maximum amount of data in gigabytes you use monthly? >>");
		
		if(talkUsed > 500 && dataUsed == 0 && textSent == 0)
		  { 
   		  result = "You need plan A this will cost $49 per month";
		  }
		else if(talkUsed < 500 && dataUsed == 0 && textSent > 0)
		  {
			result = "You need plan B this will cost $55 per month"; 
		  }
		else if(talkUsed >= 500 && dataUsed == 0 && textSent <= 100)
		  {
			result = "You need plan C this will cost $61 per month";
		  }
		else if(talkUsed >= 500 && dataUsed == 0 && textSent >= 100)
		  {
			result = "You need plan D this will cost $70 per month";
		  }
		else if(dataUsed <= 2)
		  {
			result = "You need plan E this will cost $79 per month";
		  }
		else if(dataUsed >= 2)
		  {
			result = "You need plan F this will cost $87 per month";
		  }	
		  displayMessage(result);
	}
}	
		public static void displayMessage(String result) {
	 		System.out.println(result);
	}
}
