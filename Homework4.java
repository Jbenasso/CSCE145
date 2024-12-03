
import java.util.Scanner;

public class Homework4 {
	/*
	 * Josefa Benasso Barriga
	 */ 
	
    // Method to calculate area of a circle
    public static double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    // Method to sort areas in ascending order
    public static void sortAscending(double[] areas) {
        for (int i = 0; i < areas.length - 1; i++) {
            for (int j = 0; j < areas.length - i - 1; j++) {
                if (areas[j] > areas[j + 1]) {
                    double temp = areas[j];
                    areas[j] = areas[j + 1];
                    areas[j + 1] = temp;
                }
            }
        }
    }

    // Method to sort areas in descending order
    public static void sortDescending(double[] areas) {
        for (int i = 0; i < areas.length - 1; i++) {
            for (int j = 0; j < areas.length - i - 1; j++) {
                if (areas[j] < areas[j + 1]) {
                    double temp = areas[j];
                    areas[j] = areas[j + 1];
                    areas[j + 1] = temp;
                }
            }
        }
    }

    // Method to find and display unique areas
    public static void displayUniqueAreas(double[] areas) {
        System.out.println("Unique circle areas:");
        boolean isUnique;

        for (int i = 0; i < areas.length; i++) {
            isUnique = true;
            for (int j = 0; j < areas.length; j++) {
                if (i != j && areas[i] == areas[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(areas[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCircles = 0;
        double[] radii = null, areas = null; // Initialize as null
        boolean collectionCreated = false;

        while (true) {
            // Display options
            System.out.println("\nOptions:");
            System.out.println("1. Enter the number of circles and their radius");
            System.out.println("2. Sort and display areas (smallest to largest)");
            System.out.println("3. Sort and display areas (largest to smallest)");
            System.out.println("4. Display unique circle areas");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Get number of circles and their radius
                    System.out.print("Enter the number of circles: ");
                    numCircles = scanner.nextInt();
                    while (numCircles <= 0) {
                        System.out.print("Invalid size. Enter a positive number: ");
                        numCircles = scanner.nextInt();
                    }

                    radii = new double[numCircles]; // Initialize arrays with valid size
                    areas = new double[numCircles];

                    for (int i = 0; i < numCircles; i++) {
                        System.out.print("Enter the radius for circle " + (i + 1) + ": ");
                        radii[i] = scanner.nextDouble();
                        areas[i] = calculateArea(radii[i]);
                    }
                    collectionCreated = true;
                    System.out.println("Circles created and areas calculated.");
                    break;

                case 2:
                    // Sort in ascending order
                    if (collectionCreated) {
                        sortAscending(areas);
                        System.out.println("Areas sorted (smallest to largest):");
                        for (double area : areas) {
                            System.out.println(area);
                        }
                    } else {
                        System.out.println("No collection created yet.");
                    }
                    break;

                case 3:
                    // Sort in descending order
                    if (collectionCreated) {
                        sortDescending(areas);
                        System.out.println("Areas sorted (largest to smallest):");
                        for (double area : areas) {
                            System.out.println(area);
                        }
                    } else {
                        System.out.println("No collection created yet.");
                    }
                    break;

                case 4:
                    // Display unique areas
                    if (collectionCreated) {
                        displayUniqueAreas(areas);
                    } else {
                        System.out.println("No collection created yet.");
                    }
                    break;

                case 5:
                    // Quit the program
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
