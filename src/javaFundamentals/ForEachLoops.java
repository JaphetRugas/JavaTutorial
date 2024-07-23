package javaFundamentals;

import java.util.Scanner;

public class ForEachLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String names[] = {"Jade", "Japhet", "Rugas"};
		
		System.out.print("Enter a name to search: ");
		String search = s.nextLine();
		
		for(String name: names) {
			if(name.equals(search)) break;
			System.out.println(name);
		}
		
		// Array Summation
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int nums: num) {
			sum+=nums;
		}
		System.out.println(sum);

	}

}
