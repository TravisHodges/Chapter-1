package tutorial;

import java.util.Scanner;

public class TestPounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double pounds;
     double kilos;
     double ounces;
     double milligrams;
     
     Scanner input =new Scanner(System.in);
     
     System.out.println("How many pounds? >>");
     pounds = input.nextDouble();
     
     displayKilos(pounds);
     displayOunces(pounds);
     displayMilligrams(pounds);
	}
	public static void displayKilos(double pounds) {
		 double kilos;
		
		 kilos = pounds / 2.2;
		 System.out.println(pounds + " pounds is equal to " + kilos + " kilograms"); 
	}
	public static void displayOunces(double pounds) {
		double ounces;
		
		ounces = pounds * 16;
		System.out.println(pounds + " pounds is equal to " + ounces + " ounces"); 
	}
	public static void displayMilligrams(double pounds) {
		double milligrams;
	
		milligrams = pounds * 453592;
		System.out.println(pounds + " pounds is equal to " + milligrams + " milligrams"); 
		
	}

}
