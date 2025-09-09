package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSimple Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
            
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add(a, b));
                    break;
                case 2:
                    System.out.println("Result: " + calc.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Result: " + calc.multiply(a, b));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + calc.divide(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
