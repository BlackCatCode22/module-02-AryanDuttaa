import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for three integers
        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        // Determine the largest number using nested if statements
        int largest;
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }
        
        // Output the largest number
        System.out.println("The largest number is: " + largest);
    }
}
