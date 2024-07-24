package javaFundamentals;

public class Methods {

	// Global Variables
	static String name = "Jade Japhet Rugas";
	public static void main(String[] args) {
		// Local variable - accessible only in main method
		String greetings = "Hello!";
		sayHello();

		say(greetings);
		add(1,2);
		int sum = add(1,2,3);
		System.out.println(sum);
		System.out.println(isLegalAge(18));
	}
	
	// modifier returntype methodname
	static void sayHello() {
		System.out.println("Hello World!");
		System.out.println("Hello to you " + name);
		Methods.name = "Sample Name";
		
		System.out.println(Methods.name);
		Methods p1 = new Methods();
		
		p1.name = "Maria Christine Handog";
		System.out.println(p1.name);
	}
	
	// Method w/ Arguments
	static void say(String word) {
		System.out.println(word);
	}
	
	// Sum
	static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	// Methods w/ return
	static int add(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		return sum;
	}
	
	
	static boolean isLegalAge(int age) {
		return age<=18;
	}

}
