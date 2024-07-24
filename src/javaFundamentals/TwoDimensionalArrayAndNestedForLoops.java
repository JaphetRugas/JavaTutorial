package javaFundamentals;

public class TwoDimensionalArrayAndNestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring w/ values
		String users[][] = {
				{"Jade", "Japhet", "Rugas"},
				{"Maria", "Christine", "Handog"}
		};
		
		for(String user[]: users) {
			for(String u: user) {
				System.out.print(u + " ");
			}
			System.out.println();
		}
		
		// Declaring w/o values
		String users2[][] = new String[2][2];
		
		System.out.println(users[0][0]);
		
		users2[0][0] = "asd";
		System.out.println(users2[0][0]);
		
		// Version 1 
		int rows = 5;
		for(int i = 1; i <= rows; i++) {
			for(int x = rows; x > i; x--) {
				System.out.print(" ");
			}
			for(int y = 1; y < i; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Version 2
		for(int i = 0; i < rows; i++) {
			System.out.print((" ").repeat(rows-i));
			System.out.println(("* ").repeat(i));
		}
	}

}
