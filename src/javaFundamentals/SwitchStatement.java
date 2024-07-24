package javaFundamentals;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        // Grade Handling
        System.out.print("Enter Grade (A-D): ");
        char grade = s.next().charAt(0);
		
		switch(grade) {
	        case 'A':
	        case 'B':
	        case 'C':
	            System.out.println(grade);
	            break;
	        default:
	            System.out.println("Break");
		}
		
	}
}
