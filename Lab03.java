import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {
    	
    	/*
		 * Josefa Benasso Barriga `⎚⩊⎚´ -✧
		 */
    	
        // Set the price per package
        final double PACKAGE_PRICE = 99.0;
        
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the number of packages
        System.out.print("Enter the total number of software packages ordered: ");
        int quantity = scanner.nextInt();
        
        // Input validation
        if (quantity <= 0) {
            System.out.println("Invalid value for package count! Exiting the program!");
            return;
        }
        
        // Calculate total bill before discount
        double totalBeforeDiscount = quantity * PACKAGE_PRICE;
        
        // Determine discount percentage
        double discount = 0.0;
        if (quantity >= 10 && quantity <= 19) {
            discount = 0.20;
        } else if (quantity >= 20 && quantity <= 49) {
            discount = 0.30;
        } else if (quantity >= 50 && quantity <= 99) {
            discount = 0.40;
        } else if (quantity >= 100) {
            discount = 0.50;
        }
        
        // Calculate discount amount and total bill after discount
        double discountAmount = totalBeforeDiscount * discount;
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;
        
        // Output the results
        System.out.println("Total Bill Amount (before discount) = $" + totalBeforeDiscount);
        System.out.println("Amount of discount = $" + discountAmount);
        System.out.println("Total Bill Amount (after discount) = $" + totalAfterDiscount);
    }
}

