
import java.util.Scanner;
//Josefa Benasso
class Coffee {
    // Instance variables
    private String name;
    private int caffeineContent;

    // Default constructor
    public Coffee() {
        this.name = "none";
        this.caffeineContent = 50;
    }

    // Parameterized constructor
    public Coffee(String name, int caffeineContent) {
        this.name = name;
        setCaffeineContent(caffeineContent); // Using mutator to ensure valid value
    }

    // Accessor for name
    public String getName() {
        return name;
    }

    // Accessor for caffeine content
    public int getCaffeineContent() {
        return caffeineContent;
    }

    // Mutator for name
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    // Mutator for caffeine content (must be between 50 and 300)
    public void setCaffeineContent(int caffeineContent) {
        if (caffeineContent >= 50 && caffeineContent <= 300) {
            this.caffeineContent = caffeineContent;
        } else {
            System.out.println("Caffeine content must be between 50 and 300 mg.");
        }
    }

    // Method to calculate the risky amount of coffee cups
    public double riskyAmount() {
        return 180.0 / ((caffeineContent / 100.0) * 6.0);
    }

    // Equals method to compare two Coffee objects
    public boolean equals(Coffee other) {
        return this.name.equals(other.name) && this.caffeineContent == other.caffeineContent;
    }

    // toString method to display coffee information
    public String toString() {
        return "Name: " + name + "\nCaffeine Amount: " + caffeineContent + " mg";
    }
}

public class CoffeeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean moreCoffee = true;

        while (moreCoffee) {
            // Create two Coffee objects
            Coffee coffee1 = new Coffee();
            Coffee coffee2 = new Coffee();

            // Input for the first coffee
            System.out.println("Welcome to the Coffee Hour!!!");
            System.out.print("What’s the name of the first coffee? ");
            coffee1.setName(input.nextLine());
            System.out.print("What’s the caffeine content? ");
            coffee1.setCaffeineContent(input.nextInt());
            input.nextLine(); // Consume newline

            // Input for the second coffee
            System.out.print("What’s the name of the second coffee? ");
            coffee2.setName(input.nextLine());
            System.out.print("What’s the caffeine content? ");
            coffee2.setCaffeineContent(input.nextInt());

            // Display the properties of both coffees
            System.out.println(coffee1.toString());
            System.out.println("It would take " + coffee1.riskyAmount() + " cups of " + coffee1.getName() + " before it’s dangerous to drink more.");
            System.out.println(coffee2.toString());
            System.out.println("It would take " + coffee2.riskyAmount() + " cups of " + coffee2.getName() + " before it’s dangerous to drink more.");

            // Check if the two coffee objects are the same
            System.out.println("Are both coffee’s the same? " + coffee1.equals(coffee2));

            // Prompt user to create more coffee objects or stop
            System.out.print("Do you want to create more coffee objects? Enter “Yes” or “No”: ");
            String answer = input.next();
            moreCoffee = answer.equalsIgnoreCase("Yes");

            input.nextLine(); // Consume newline
        }

        input.close();
        System.out.println("Goodbye!");
    }
}
