import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to read input
        System.out.println("Enter a string: "); // Prompt the user to enter a string
        String inputString = scanner.nextLine(); // Read user input
        
        // Reverse the input string using StringBuilder and its reverse method
        String reversedString = new StringBuilder(inputString).reverse().toString();
        
        // Print the reversed string to the console
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close(); // Close the scanner to free up resources
    }
}
