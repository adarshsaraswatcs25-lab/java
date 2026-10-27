import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        // Calculate the sum
        double sum = num1 + num2 + num3;
        
        System.out.println("The sum of the three numbers is: " + sum);
        
        scanner.close();
    }
}
