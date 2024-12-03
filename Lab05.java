import java.util.Scanner;

public class Lab05 {

	public static void main(String[] args) {
		
		/*
		 * Josefa Benasso Barriga
		 */
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount of money to spend
        System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
        int dollars = scanner.nextInt();

        // Check for invalid input
        if (dollars < 0) {
            System.out.println("Invalid value for amount! Exiting the program!");
            return; // Exit the program if the input is invalid
        }

        // Initialize variables for total chocolate bars and coupons
        int totalChocolateBars = dollars; // Each dollar buys 1 chocolate bar
        int coupons = dollars; // Each chocolate bar gives 1 coupon

        // Continue redeeming coupons while enough are available for at least one chocolate bar (6 coupons = 1 chocolate bar)
        while (coupons >= 6) {
            int additionalBars = coupons / 6; // Calculate additional bars from redeeming coupons
            totalChocolateBars += additionalBars; // Add additional bars to the total
            coupons = coupons % 6 + additionalBars; // Update the remaining coupons
        }

        // Output the results
        System.out.println("You can buy " + totalChocolateBars + " chocolate bars and will have " + coupons + " coupons left!");

        // Close the scanner
        scanner.close();
	}

}
