package javaFundamentals;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 0;
		// While Loop
		while(i < 5) {
			System.out.println(i++);
		}
		
		// Iterating Arrays
		String names[] = {"Jade", "Maria", "Japhet", "Christine"};
		int j = 0;
		
		System.out.print("Enter the name of the person to find: ");
		String search = s.nextLine();
		
		while(j < names.length) {
			if(names[j].equalsIgnoreCase(search)) {
				System.out.println("Found you, hheheehee");
				break;
			}
			System.out.println(names[j]);
			j++;
		} 
		
		// Do While Loop
		
		do {
			System.out.println(i--);
		} while(i > 0);
		
		System.out.println("-----------------------------------");
		
		int z = 0;
		
		while(z <= 100) {
			System.out.println(z++);
			if(z == 10) break; 
		}
				
	}
}
