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
			
	}

}
