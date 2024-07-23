package javaFundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Enter your name: ");
		name = s.nextLine();
		
		System.out.print("Enter your age: ");
		age = s.nextInt();

		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
		
	

		// One Function Calculator
		int x, y;
		System.out.print("Enter value for x: ");
		x = s.nextInt();
		System.out.print("Enter value for y: ");
		y = s.nextInt();
		
		int z = x + y;
		System.out.println("Sum: " + z);
		
		
	}

}
