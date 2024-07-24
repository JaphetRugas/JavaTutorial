package challenge;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
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
