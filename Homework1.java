import java.util.Scanner;
public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Josefa Benasso Barriga
		 */
Scanner scanner = new Scanner(System.in);
        
        // Accepting user input for required fields
        System.out.print("Josefa");
        String firstName = scanner.nextLine();

        System.out.print("Benasso Barriga");
        String lastName = scanner.nextLine();

        System.out.print("18");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline left by nextInt()

        System.out.print("8649088758");
        String phone = scanner.nextLine();

        System.out.print("Computer Science");
        String major = scanner.nextLine();

        System.out.print("Freshman");
        String year = scanner.nextLine();

        System.out.print("16/09/2024");
        String date = scanner.nextLine();

        // Additional creative questions
        System.out.print("soccer");
        String favoriteSport = scanner.nextLine();

        System.out.print("La La Land");
        String favoriteMovie = scanner.nextLine();

        System.out.print("5");
        int luckyNumber = scanner.nextInt();

        // Calculating birth year
        int birthYear = 2024 - age;

        // Convert date to European format (dd.mm.yyyy)
        String[] dateParts = date.split("/");
        String europeanDate = dateParts[1] + "." + dateParts[0] + "." + dateParts[2];

        // Formatting phone number (xxx)xxx-xxxx
        String formattedPhone = "(" + phone.substring(0, 3) + ")" + phone.substring(3, 6) + "-" + phone.substring(6);

        // Displaying an interesting introduction about the user
        System.out.println("\nHere’s a quick intro for " + firstName + " " + lastName + ":");
        System.out.println("You were born in the year " + birthYear + ". In your free time, you love to watch " + favoriteSport + 
                            " and catch up on movies, with '" + favoriteMovie + "' being one of your favorites.");
        System.out.println("Your lucky number is " + luckyNumber + ". You are a " + year + " at USC majoring in " + major + ".");
        System.out.println("You can be reached at " + formattedPhone + ". You are now officially a Gamecock!");
        System.out.println("Last Updated: " + europeanDate);
        scanner.close();
	}

}
