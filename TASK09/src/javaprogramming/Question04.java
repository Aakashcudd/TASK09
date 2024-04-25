package javaprogramming;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the pattern:");
		int n = scanner.nextInt();
		
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if (j==i||j==n-i+1) {
					System.out.print("*");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
