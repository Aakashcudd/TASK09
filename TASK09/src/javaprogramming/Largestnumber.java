package javaprogramming;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Enter the first number:");
   double num1 = scanner.nextDouble();
   
   System.out.println("Enter the second number:");
   double num2 = scanner.nextDouble();
   
   System.out.println("Enter the third number:");
   double num3 = scanner.nextDouble();
   
   double largest = findLargest (num1, num2, num3);
   
   System.out.println("The largest number is:" +largest);
	}

	private static double findLargest(double num1, double num2, double num3) {
		
		double largest = num1;
		if (num2> largest) {
			largest=num2;
		}
		if(num3>largest) {
			largest = num3;
		}
		return largest;
		
	}
      
}
