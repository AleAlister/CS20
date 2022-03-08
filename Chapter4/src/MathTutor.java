import java.util.Scanner;
import java.util.Random;
public class MathTutor {

	public static void main(String[] args) {
		
		
		  int number1;      // A number
	      int number2;      // Another number
	      int sum;          // The sum of the numbers
	      int userAnswer;   // The user's answer
	      
	      // Create a Scanner object for keyboard input.
	      Scanner Scan = new Scanner(System.in);
	      
	      // Create a Random class object.
	      Random randomNumbers = new Random();

	      // Get two random numbers within the range 0-100
	      number1 = randomNumbers.nextInt(100);
	      number2 = randomNumbers.nextInt(100);

	      // Display an addition problem.
	      System.out.println("What is the answer to the " +  "following problem?");
	      System.out.print(number1 + " + " + number2 + " = ? ");

	      // Calculate the answer.
	      sum = number1 + number2;

	      // Get the user's answer.
	      userAnswer = Scan.nextInt();

	      // Display the user's results.
	      if (userAnswer == sum)
	         System.out.println("Correct!");
	      else
	      {
	         System.out.println("Sorry, wrong answer. " + "The correct answer is " + sum);
	      }

	      
	      Scan.close();
	}

}
