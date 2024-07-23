package javaFundamentals;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 0;
		// While Loop
		while(i < 5) {
			System.out.println(i++);
		}
		
		// Iterating Arrays
		String names[] = {"Jade", "Maria", "Japhet", "Christine"};
		int j = 0;
		
		System.out.print("Enter the name of the person to find: ");
		String search = s.nextLine();
		
		while(j < names.length) {
			if(names[j].equalsIgnoreCase(search)) {
				System.out.println("Found you, hheheehee");
				break;
			}
			System.out.println(names[j]);
			j++;
		} 
		
		// Do While Loop
		
		do {
			System.out.println(i--);
		} while(i > 0);
		
		System.out.println("-----------------------------------");
		
		int z = 0;
		
		while(z <= 100) {
			System.out.println(z++);
			if(z == 10) break; 
		}
		
		// Quiz Game W/ Lives
		
		int lives = 3;

        // Array of questions
        String[] questions = {
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "What is the chemical symbol for water?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the square root of 64?"
        };

        // Array of corresponding answers
        String[] answers = {
            "Paris",
            "Jupiter",
            "H2O",
            "William Shakespeare",
            "8"
        };
        
        while(lives != 0) {
    		int counter = 0;

    		System.out.println("Current Lives: " + lives);
            // Ask the user to choose a question to answer
        	System.out.println("Choose a question to answer (enter number 0 to " + (questions.length - 1) + "):");
        	while(counter < questions.length) {
        		System.out.println(counter + ": " + questions[counter]);
        		counter++;
        	} 
        	System.out.print("Enter your question: ");
        	int questionIndex = s.nextInt();
        	
            s.nextLine();  // Consume the newline character
        	
        	
        	if(questionIndex >= 0 && questionIndex < questions.length) {
        		System.out.println("Questions: " + questions[questionIndex]);
        		
        		System.out.print("Enter your answer: ");
        		String answer = s.nextLine();
        		
        		if(answer.equalsIgnoreCase(answers[questionIndex])) {
        			System.out.println("Correct");
        			break;
        		}
        		else {
        			System.out.println("Incorrect. The correct answer is " + answers[questionIndex]);
        			lives--;
        			if (lives == 0) {
        				System.out.println("You Lost!");
        				break;
        			}
        		}
        		
        	} else System.out.println("Invalid question number"); 
        }
		
	}
}
