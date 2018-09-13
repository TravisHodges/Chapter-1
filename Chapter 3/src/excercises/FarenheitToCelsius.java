package excercises;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double f8;
      double f12;
      double f5;

      Scanner input =new Scanner(System.in);
      
      System.out.println("What was the Temperature at 8:00am in Farenheit? >>");
      f8 = input.nextDouble();
      System.out.println("What was the Temperature at 12:00pm in Farenheit? >>");
      f12 = input.nextDouble();
      System.out.println("What was the Temperature at 5:00pm in Farenheit? >>");
      f5 = input.nextDouble();
      
      displayConversion(f8, 8);
      displayConversion(f12, 12);
      displayConversion(f5, 5);
      
	 }
     public static void displayConversion(double fahren, int time) {
    	 double celsius = (fahren - 32) * 5/9;   
         System.out.println("The temperature at " + time + " was degrees farenheit and " + celsius 
       		  + " degrees celcius");
     }
     public static void displayConversion(double fahren, int time) {
    	 double celsius = (fahren - 32) * 5/9;   
         System.out.println("The temperature at " + time + " was degrees farenheit and " + celsius 
       		  + " degrees celcius");
     }
     public static void displayConversion(double fahren, int time) {
    	 double celsius = (fahren - 32) * 5/9;   
         System.out.println("The temperature at " + time + " was degrees farenheit and " + celsius 
       		  + " degrees celcius");
     }