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
	}

}
