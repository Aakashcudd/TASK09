package javaprogramming;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        
        if(n<1) {
        	System.out.println("Please enter a positive integer.");
        } else {
        	printPattern(n);	
        }
	}

	private static void printPattern(int n) {
		int startnum = 1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(startnum+ "");
				startnum++;
			}
		}
		System.out.println();
	}

}
