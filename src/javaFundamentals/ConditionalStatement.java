package javaFundamentals;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean isTall = false;
		int age;
		int legalage = 18; 
		
		System.out.print("Are you tall: ");
		isTall = s.nextBoolean();
		
		if(isTall == true) {
			System.out.println("You are tall!");
		} else {
			System.out.println("Short king!");
		}
		
		System.out.print("Enter your age: ");
		age = s.nextInt();
		
		if(age >= legalage) System.out.println("You are old enough");
		else if(age >= 13) 	System.out.println("Your a fucking teenager huh");
		else 				System.out.println("You are not old enough");
		
		String x = "Jade";
		
		if(x.equals("Jade")) {
			System.out.println("Hi");
		} 
		else {
			System.out.println("Huh");
		}
		
		System.out.print("Enter Greetings:");
		String greet = s.nextLine();
		
		// Compare the memory address
		if(greet == "Hello") {
			System.out.println("Hi");
		} 
		else {
			System.out.println("Huh");
		}

		System.out.print("Enter Greetings:");
		String greet2 = s.nextLine();
		
		// Compare the memory content
		if(greet2.equalsIgnoreCase("Hello")) {
			System.out.println("Hi");
		} 
		else {
			System.out.println("Huh");
		}
		
		boolean hasRuler = true;
		boolean hasBallpen = true;
		
		if(hasRuler && hasBallpen) {
			System.out.println("Nice");
		} else {
			System.out.println("The hell");
		}
		
		// Grade Average Program
		
		System.out.println("Enter your grades(4): ");
		System.out.print("Grade 1: ");
		int grade1 = s.nextInt();
		System.out.print("Grade 2: ");
		int grade2 = s.nextInt();
		System.out.print("Grade 3: ");
		int grade3 = s.nextInt();
		System.out.print("Grade 4: ");
		int grade4 = s.nextInt();
		
		int total = (grade1+grade2+grade3+grade4)/4;
		
		System.out.println(total);
		if(total >= 98) {
			System.out.println("With Highest Honors");
		}
		else if(total >= 95) {
			System.out.println("With High Honors");
		}
		else if(total >= 90) {
			System.out.println("With  Honors");
		}
		else if(total >= 75) {
			System.out.println("Passed");
		}
		else if(total < 75) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Invalid Grade");
		}
	}

}
