import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        // Handle negative numbers
        if (num < 0) return false;

        int originalNumber = num;
        int sum = 0;
        
        // Find the total number of digits
        int digits = String.valueOf(num).length();
        
        // Extract digits and calculate the power sum
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        // Return true if the sum matches the original number
        return sum == originalNumber;
    }
}
