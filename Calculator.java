public class Main {
    
}
import java.util.Scanner;

/*
 * Program: Simple Calculator
 * Description: Performs basic arithmetic operations
 * Author: Your Name
 * Date: 16-03-2026
 */

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        System.out.println("=================================");
        System.out.println("        SIMPLE CALCULATOR        ");
        System.out.println("=================================");

        do {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 4:
                        result = divide(num1, num2);
                        System.out.println("Result = " + result);
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}