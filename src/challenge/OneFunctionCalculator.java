package challenge;

import java.util.Scanner;

public class OneFunctionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner s = new Scanner(System.in);
		
		// One Function Calculator
		int x, y;
		System.out.print("Enter value for x: ");
		x = s.nextInt();
		System.out.print("Enter value for y: ");
		y = s.nextInt();
		
		int z = x + y;
		System.out.println("Sum: " + z);

	}

}
