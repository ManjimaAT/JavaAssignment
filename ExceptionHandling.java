package org.example;

import java.util.Scanner;

public class ExceptionHandling {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (Math.pow((1 + rate / 100), time) - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the principal amount:");
            double principal = sc.nextDouble();
            if (principal <= 0) {
                throw new IllegalArgumentException("Principal amount must be greater than zero.");
            }

            System.out.println("Enter the rate of interest:");
            double rate = sc.nextDouble();
            if (rate <= 0) {
                throw new IllegalArgumentException("Rate of interest must be greater than zero.");
            }

            System.out.println("Enter the time period in years:");
            double time = sc.nextDouble();
            if (time <= 0) {
                throw new IllegalArgumentException("Time period must be greater than zero.");
            }

            double simpleInterest = calculateSimpleInterest(principal, rate, time);
            double compoundInterest = calculateCompoundInterest(principal, rate, time);
            System.out.println("Simple Interest: " + simpleInterest);
            System.out.println("Compound Interest: " + compoundInterest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

