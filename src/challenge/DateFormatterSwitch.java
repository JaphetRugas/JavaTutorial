package challenge;

import java.util.Scanner;

public class DateFormatterSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		// Date Formatter
		int month, day, year;
		
		System.out.print("Enter Month: ");
		month = s.nextInt();
		System.out.print("Enter Day: ");
		day = s.nextInt();
		System.out.print("Enter year: ");
		year = s.nextInt();
		
		
		if(month >= 1 && month <= 12) {
			int daysInMonth = switch(month) {
				case 2 -> {  
		            if (year % 4 == 0)
		                yield 29;
		            else
		                yield 28;
		        }
				case 4, 6, 9, 11 -> 30;
				default -> 31;
			};
			
			if(day >= 1 && day <= daysInMonth) {
				System.out.printf("Date: %02d-%02d-%d", month, day, year);
			} else System.out.println("Invalid Date");
			
		} else System.out.println("Invalid month"); 
	}

}
