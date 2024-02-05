import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {
        int num1 = getAnIntFromTheUser();
        int num2 = getAnIntFromTheUser();
        
        compareTwoInts(num1, num2);
        int sum = sumTwoInts(num1, num2);
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    private static int getAnIntFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        return scanner.nextInt();
    }

    private static void compareTwoInts(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
    }

    private static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }
}
