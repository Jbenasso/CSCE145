

// Name: Josefa Benasso

// Apple class
class Apple {
    // Attributes
    private String type;
    private double weight;
    private double price;

    // Default Constructor
    public Apple() {
        this.type = "Gala";
        this.weight = 0.5;
        this.price = 0.88;
    }

    // Parameterized Constructor
    public Apple(String xType, double xWeight, double xPrice) {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    // Accessor for type
    public String getType() {
        return type;
    }

    // Mutator for type with validation
    public void setType(String type) {
        if (type.equals("Red Delicious") || type.equals("Golden Delicious") ||
            type.equals("Gala") || type.equals("Granny Smith")) {
            this.type = type;
        } else {
            System.out.println("Invalid value for type!");
            this.type = null;
        }
    }

    // Accessor for weight
    public double getWeight() {
        return weight;
    }

    // Mutator for weight with validation
    public void setWeight(double weight) {
        if (weight >= 0 && weight <= 2) {
            this.weight = weight;
        } else {
            System.out.println("Invalid value for weight!");
            this.weight = 0.0;
        }
    }

    // Accessor for price
    public double getPrice() {
        return price;
    }

    // Mutator for price with validation
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid value for price!");
            this.price = 0.0;
        }
    }

    // Method to display the values of the instance variables
    public void writeOutput() {
        System.out.printf("Type: %s\n", (type == null ? "null" : type));
        System.out.printf("Weight: %.2f kg\n", weight);
        System.out.printf("Price: $%.2f\n", price);
    }
}

// AppleTester class
public class Lab08 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Welcome to the Apple tester!!!");
        
        // Creating the first apple using the default constructor
        System.out.println("Creating the first apple!");
        Apple apple1 = new Apple();
        System.out.println("Default values of the first apple object:");
        apple1.writeOutput();
        
        // Creating the second apple using the parameterized constructor
        System.out.println("\nEnter the type of the second apple object:");
        String type = scanner.nextLine();
        
        System.out.println("Enter the weight of the second apple object:");
        double weight = scanner.nextDouble();
        
        System.out.println("Enter the price of the second apple object:");
        double price = scanner.nextDouble();
        
        System.out.println("\nCreating the second apple object!");
        Apple apple2 = new Apple(type, weight, price);
        
        System.out.println("Values of the second apple object:");
        apple2.writeOutput();
        
        scanner.close();
    }
}
