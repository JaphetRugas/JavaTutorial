package javaFundamentals;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		
		// Not ideal thats why we will use Arrays
		String name1 = "A";
		String name2 = "B";
		String name3 = "C";
		String name4 = "D";
		String name5 = "E";

		// Declare w/ Values
		String names[] = {"A", "B", "C", "D", "E"};
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		
		
		// Declare w/o Values
		String names2[] = new String[4];
		int numbers2[] = new int[10];
		
		// Accessing arrays
		
		System.out.println(names[0]);
		
		System.out.println(numbers[0] + numbers[5]);
		
		// Assign Value to array
		names2[0] = "Z";
		System.out.println(names2[0]);
		
		// Assigning Array Element w/ User Input
		System.out.println("Enter a name: ");
		names2[0] = s.nextLine();
		System.out.println(names2[0]);
	}

}
