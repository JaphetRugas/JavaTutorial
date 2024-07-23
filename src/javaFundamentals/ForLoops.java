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
		
		// Authentication Simulation
		String usernames[] = {"Jade", "Japhet", "Rugas"};
		String passwords[] = {"Jade", "Japhet", "Rugas"};

		System.out.print("Enter username: ");
		String username = s.nextLine();
		System.out.print("Enter password: ");
		String password = s.nextLine();

		boolean found = false;
		
		for(int i = 0; i < usernames.length; i++) {
			if(usernames[i].equals(username) && passwords[i].equals(password)) {
				System.out.println("Welcome " + username);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Account not found");
		}
	}
}
