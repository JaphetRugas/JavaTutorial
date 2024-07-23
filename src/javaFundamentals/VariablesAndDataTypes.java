package javaFundamentals;

public class VariablesAndDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char section = 'A';
		String name = "Jade Japhet R. Rugas";
		boolean isTall = false;
		int num = 20;
		float grade = 75.5f;	// considered double if theres no f
		double grade1 = 75.5;
		
		System.out.println(grade + grade1);
		System.out.println(name);
		name = "New Name";
		
		System.out.println(name);
		
		//	Concatenation
		
		System.out.println("Hello" + " World");
		System.out.println("2" + "3");
		System.out.println('a' + "b");
		System.out.println(2 + "3");
		
		// Not Concatenation
		System.out.println(2 + 3);
		System.out.println('a' + 3);
		
		// Sentence Builder Challenge
		String name1 = "Jade Rugas";
		int age = 23;
		double grade2 = 2.25;
		char bloodType = 'O';
		
		System.out.println("Hi my name is " + name1);
		System.out.println("I'm " + age + " Years Old");
		System.out.println("My GPA is " + grade2);
		System.out.println("My blood type is " + bloodType);
	}

}
