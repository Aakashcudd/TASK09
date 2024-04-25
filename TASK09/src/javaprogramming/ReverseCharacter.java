package javaprogramming;

import java.util.Scanner;

public class ReverseCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a string:");
		String userinput= scanner.nextLine();
		String reversedString= reverseString (userinput);
				System.out.println("Reversed string:"+ reversedString);
	}

	private static String reverseString(String userinput) {
		StringBuilder reversed = new StringBuilder();
		for (int i=userinput.length() -1; i>=0; i--) {
			reversed.append(userinput.charAt(i));
		}
		return reversed.toString();
	}

}
