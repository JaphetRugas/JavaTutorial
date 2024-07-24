package challenge;

import java.util.Scanner;

public class PairedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		// Paired Arrays by Index
		
		String email[] = new String[5];
		String username[] = new String[5];
		String password[] = new String[5];
		
		
		System.out.println("Enter email: ");
		email[0] = s.nextLine();
		System.out.println("Enter username: ");
		username[0] = s.nextLine();
		System.out.println("Enter password: ");
		password[0] = s.nextLine();
		
		
		System.out.println("Sample Output");
		
		System.out.println("Index: 0");
		System.out.println("Email: " + email[0]);
		System.out.println("Username: " + username[0]);
		System.out.println("Password:" + password[0]);	
		
		String email2[] = {"rugas@mail.com", "sample@mail.com"};
		String username2[] = {"rugas", "sample"};
		String password2[] = {"rugas", "sample"};
		
		int i = 0;
		
		System.out.println("Index: " + i);
		System.out.println("Email: " + email2[i]);
		System.out.println("Username: " + username2[i]);
		System.out.println("Password: " + password2[i]);
	}

}
