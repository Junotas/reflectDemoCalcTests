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
}

