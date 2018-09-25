package youDoIt;

import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) 
	{
     double salary;
     Scanner input =new Scanner(System.in);
     System.out.println("Demonstrating some raises");
     System.out.println("Enter your salary >> ");
     salary = input.nextDouble();
     
     predictRaise(salary);
	}
	
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current slary: " + salary + "    After raise: " + newSalary);
	}

}
