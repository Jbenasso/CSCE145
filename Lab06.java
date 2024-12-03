
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
    	
    	/*
		 * Josefa Benasso Barriga
		 */
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the heig                   ht of the triangle: ");
        int height = scanner.nextInt();
        
        // Upper part of the triangle
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower part of the triangle
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // End of the program message
        System.out.println("End of program!");
        
        scanner.close();
    }
}
