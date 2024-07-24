package javaFundamentals;

import java.util.Scanner;

public class ForLoops {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String names[] = {"Jade", "Japhet", "Rugas", "Secret"};
		
		System.out.print("Enter a name to search: ");
		String search = s.nextLine();
		
		
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(search)) {
				System.out.println("We found " + search);
				break;
			}
			System.out.println(names[i]);
		}
		
	}
}
