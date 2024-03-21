package org.example;

import java.util.Scanner;

public class Calculators {
    interface Operation {
        double calculate(double x, double y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter first operand: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter second operand: ");
        double operand2 = scanner.nextDouble();

        double result = 0;
        Operation operation;

        switch (operator) {
            case '+':
                operation = (x, y) -> x + y;
                result = performOperation(operation, operand1, operand2);
                break;
            case '-':
                operation = (x, y) -> x - y;
                result = performOperation(operation, operand1, operand2);
                break;
            case '*':
                operation = (x, y) -> x * y;
                result = performOperation(operation, operand1, operand2);
                break;
            case '/':
                operation = (x, y) -> x / y;
                result = performOperation(operation, operand1, operand2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }

    private static double performOperation(Operation operation, double x, double y) {
        return operation.calculate(x, y);
    }
}

