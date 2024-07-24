package challenge;

import java.util.Scanner;

public class SummationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter number of items to add: ");
		int num = s.nextInt();
		
		int numbers[] = new int[num];
		
		System.out.println();
		for(int i = 0; i < num; i++) {
			System.out.print("Enter number " + i + ": ");
			numbers[i] = s.nextInt();
		}
		
		System.out.println("Summation Result: " + summation(numbers));
	}
	
	static int summation(int numbers[]) {
		int sum = 0;
		for(int number: numbers) {
			sum+=number;
		}
		return sum;
	}

}
