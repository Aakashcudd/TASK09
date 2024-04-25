package javaprogramming;

import java.util.Scanner;

public class Hoteltariff {

	private static final int case4 = 0;

	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number (1-12):");
        int month = scanner.nextInt();

        System.out.println("Enter the room rent per day:");
        double roomRent = scanner.nextDouble();

        System.out.println("Enter the number of days stayed:");
        int numDays = scanner.nextInt();

        double totalRoomRent = roomRent * numDays;

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                totalRoomRent *= 1.20;
                break;
            default:
                break;
}
		
		System.out.printf("The hotel tariff to be paid: %02f%n", totalRoomRent);
		
		

	}

}
