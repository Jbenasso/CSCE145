import java.util.Scanner;
import java.util.Arrays;

public class Lab07 {
    public static void main(String[] args) {
    	
    	/*
		 * Josefa Benasso Barriga
		 */
    	
        Scanner input = new Scanner(System.in);
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];

        // Accept values for arrayA
        System.out.println("Enter 10 elements for array A:");
        for (int i = 0; i < 10; i++) {
            arrayA[i] = input.nextInt();
        }

        // Accept values for arrayB
        System.out.println("Enter 10 elements for array B:");
        for (int i = 0; i < 10; i++) {
            arrayB[i] = input.nextInt();
        }

        // Check if both arrays are equal
        if (Arrays.equals(arrayA, arrayB)) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
        input.close();
    }
}
