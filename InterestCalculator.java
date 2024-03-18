package org.example;
import java.util.Scanner;
public class InterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (Math.pow((1 + rate / 100), time) - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period in years:");
        double time = sc.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal,rate,time);
        double compoundInterest = calculateCompoundInterest(principal,rate,time);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
        sc.close();
    }
}
