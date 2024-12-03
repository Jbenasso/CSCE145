import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		/*
		 * Josefa Benasso Barriga
		 */
		
		Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Welcome to a very mundane adventure!");
        System.out.print("What's your name, you poor unfortunate soul? ");
        String name = scanner.nextLine();
        System.out.println("Alright " + name + ", buckle up!");

        // First decision
        System.out.print("You're walking down the street and see a mysterious box. Do you 'open' it or 'ignore' it? ");
        String firstChoice = scanner.nextLine();

        if (firstChoice.equalsIgnoreCase("open")) {
            openBox(scanner); // Call the function for opening the box path
        } else if (firstChoice.equalsIgnoreCase("ignore")) {
            ignoreBox(scanner); // Call the function for ignoring the box path
        } else {
            System.out.println("That wasn't an option. You trip over your own feet and embarrass yourself in front of everyone. Everyone laughs and points at you. You will never forget this moment. Game over.");
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    // Open the box path
    public static void openBox(Scanner scanner) {
        System.out.print("You open the box and find... a spider? Do you 'eat' it or 'throw' it? ");
        String secondChoice = scanner.nextLine();

        if (secondChoice.equalsIgnoreCase("eat")) {
            eatSandwich(scanner); // Go to eat sandwich scenario
        } else if (secondChoice.equalsIgnoreCase("throw")) {
            System.out.println("You throw the spider like a normal person would, but it boomerangs back and hits you in the face. The spider, sadly, was made of tungsten. You get knocked out. Game over.");
        } else {
            System.out.println("Invalid choice. You stand there awkwardly for too long.You look at the spider, and the spider looks back at you. Then a bird steals the spider and eats it in front of you. You see the spider's agony. Game over.");
        }
    }

    // Ignore the box path
    public static void ignoreBox(Scanner scanner) {
        System.out.print("You walk past the box, but suddenly a wild hoard of geese starts chasing you. Do you 'run' or 'fight'? ");
        String secondChoice = scanner.nextLine();

        if (secondChoice.equalsIgnoreCase("run")) {
            runFromGoose(scanner); // Go to running from goose scenario
        } else if (secondChoice.equalsIgnoreCase("fight")) {
            System.out.println("You try to fight the geese, but they're black-belts in karate. You absolute buffoon. You die. Game over.");
        } else {
            System.out.println("Invalid choice. The geese take this opportunity to steal your brand new Jordan shoes that took you months to get. Game over.");
        }
    }

    // Eat the sandwich scenario
    public static void eatSandwich(Scanner scanner) {
        System.out.print("The spider gives you superpowers! Do you 'fly' or 'become invisible'? ");
        String thirdChoice = scanner.nextLine();

        if (thirdChoice.equalsIgnoreCase("fly")) {
            System.out.println("You soar through the skies, but immediately hit a Boeing plane. The pilot isn’t happy. Boeing isn't happy. You get sucked into a turbine. Game over.");
        } else if (thirdChoice.equalsIgnoreCase("become invisible")) {
            System.out.print("You become invisible! How old are you? ");
            int age = scanner.nextInt();  // Numeric comparison
            scanner.nextLine();  // Consume the leftover newline

            if (age < 18) {
                System.out.println("You use your powers to sneak into an R rated movie theater. You indecent person. You win... but is that really winning?");
            } else {
                System.out.println("You prank your coworkers by moving their stuff around invisibly by just one inch. You win, but everyone at work now thinks they're haunted and begin doing rituals to kill the ghost that moves around their things. The office becomes a cult.");
            }
        } else {
            System.out.println("You couldn't decide, and the spider's powers wear off. You're just a regular person again. How sad. Game over.");
        }
    }

    // Running from the goose scenario
    public static void runFromGoose(Scanner scanner) {
        System.out.print("You run as fast as you can, but you're not flash, therefore the geese are getting closer, and closer, and closer. Do you 'climb' a tree or 'jump' into a pond? ");
        String thirdChoice = scanner.nextLine();

        if (thirdChoice.equalsIgnoreCase("climb")) {
            System.out.println("You climb the tree, but the geese can fly. Did you fail basic elementary science? They wait for you to come down. You're stuck forever. You begin a new life on a branch.  Game over.");
        } else if (thirdChoice.equalsIgnoreCase("jump")) {
            System.out.println("You jump into the pond and the geese loses interest. But you remember that you never learned how to swim, so you drown. You make friends with the small fish in the pond though! And they...help? They help you back to the surface and live once more. Still, you win... I guess?");
        } else {
            System.out.println("You trip while deciding and the geese catch you and beat you up. They also take your wallet and commit credit card and identity fraud. The geese are now you. Game over.");
        }
    }

	}


