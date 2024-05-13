package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LudvigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LudvigDemoApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		Calculator calculator = new Calculator();

		System.out.println("Enter first number: ");
		double num1 = scanner.nextDouble();

		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();

		System.out.println("Enter operation (+, -, *, /): ");
		char operation = scanner.next().charAt(0);

		double result = calculator.calculate(num1, num2, operation);

		System.out.println("Result: " + result);
	}

	static class Calculator {
		public double calculate(double num1, double num2, char operation) {
			switch (operation) {
				case '+':
					return add(num1, num2);
				case '-':
					return subtract(num1, num2);
				case '*':
					return multiply(num1, num2);
				case '/':
					return divide(num1, num2);
				default:
					throw new IllegalArgumentException("Invalid operation.");
			}
		}

		public static double add(double a, double b) {
			return a + b;
		}

		public static double subtract(double a, double b) {
			return a - b;
		}

		public static double multiply(double a, double b) {
			return a * b;
		}

		public static double divide(double a, double b) {
			if (b == 0) {
				throw new IllegalArgumentException("Cannot divide by zero");
			}
			return a / b;
		}
	}

}
