
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
    	
    	/*
		 * Josefa Benasso Barriga
		 */
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        // Game loop to allow replaying the game
        while (playAgain) {
            int userScore = 0;
            int computerScore = 0;
            int round = 1;

            // Play 3 rounds
            while (round <= 3) {
                System.out.println("Round " + round + ": Enter rock, paper, or scissors:");
                String userChoice = scanner.nextLine().toLowerCase();
                
                // Randomly select the computer's choice
                int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors
                String computerChoiceStr = "";
                
                // Convert computer choice to string
                switch (computerChoice) {
                    case 0:
                        computerChoiceStr = "rock";
                        break;
                    case 1:
                        computerChoiceStr = "paper";
                        break;
                    case 2:
                        computerChoiceStr = "scissors";
                        break;
                }

                // Check if user input is valid
                if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                    System.out.println("Invalid input! The computer gets the point.");
                    computerScore++;
                } else {
                    // Display choices
                    System.out.println("Computer chose: " + computerChoiceStr);

                    // Determine the winner of the round
                    if (userChoice.equals(computerChoiceStr)) {
                        System.out.println("It's a draw!");
                    } else if ((userChoice.equals("rock") && computerChoiceStr.equals("scissors")) ||
                               (userChoice.equals("paper") && computerChoiceStr.equals("rock")) ||
                               (userChoice.equals("scissors") && computerChoiceStr.equals("paper"))) {
                        System.out.println("You win this round!");
                        userScore++;
                    } else {
                        System.out.println("Computer wins this round!");
                        computerScore++;
                    }
                }
                round++;
            }

            // Determine overall winner
            if (userScore > computerScore) {
                System.out.println("Congratulations! You won the game.");
            } else if (computerScore > userScore) {
                System.out.println("The computer won the game.");
            } else {
                System.out.println("The game ended in a tie.");
            }

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (yes or no)");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false; // Exit the game loop
            }
        }
        // Close the scanner
        scanner.close();
        System.out.println("Thank you for playing!");
    }
}
