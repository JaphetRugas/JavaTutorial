package challenge;

public class Pyramid2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
