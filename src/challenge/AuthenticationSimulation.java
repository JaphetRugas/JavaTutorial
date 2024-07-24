package challenge;

import java.util.Scanner;

public class AuthenticationSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
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
