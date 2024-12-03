import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Josefa Benasso Barriga
		 */
		// Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of books purchased
        System.out.println("How many books did you purchase at BN booksellers this month?");
        int booksPurchased = input.nextInt();

        // Check if the input is positive
        if (booksPurchased < 0) {
            System.out.println("Invalid value entered! Exiting the program!");
        } else {
            int pointsEarned = 0;

            // Use a switch statement to determine the points earned based on the number of books purchased
            switch (booksPurchased) {
                case 0:
                    pointsEarned = 0;
                    System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
                    break;
                case 1:
                    pointsEarned = 5;
                    break;
                case 2:
                    pointsEarned = 15;
                    break;
                case 3:
                    pointsEarned = 30;
                    break;
                default:
                    pointsEarned = 60;
                    break;
            }

            // Display the points earned message if booksPurchased is greater than 0
            if (booksPurchased > 0) {
                System.out.println("Congratulations!!! You have earned " + pointsEarned + " points!");
                System.out.println("You may redeem these points on your next book purchase!");
            }
        }

        // Close the scanner
        input.close();
	}

}
