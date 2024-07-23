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
