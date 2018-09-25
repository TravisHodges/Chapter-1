package excercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int name;
     double gpa;
     
     Scanner input =new Scanner(System.in);
     
     System.out.println("Enter your name >>");
     name = input.nextInt();
     System.out.println("Enter your GPA >>");
     gpa = input.nextDouble();
     
     System.out.println("Student Name: " + name);
 	 System.out.println("Student GPA: " + gpa);
     
     bookstoreCredit(name, gpa);
	}
    public static void bookstoreCredit(int name, double gpa) {
    	double credit;
    	
    	credit = gpa * 2;
    	System.out.println("Bookstore Credit = " + credit);
    }
}
