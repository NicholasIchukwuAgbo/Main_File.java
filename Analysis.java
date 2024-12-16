import java.util.Scanner;

	public class Analysis{

		public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);

		int passes = 0;

		int failures = 0;

		int studentCounter = 1;

		while(studentCounter <= 10){

		System.out.print("Enter result (1 = passes, 2 = failures): ");

		int result = userInput.nextInt();

		if(result == 1){

		passes++;

		} else {

		failures++;

		}
		
		studentCounter++;

	      }

	System.out.printf("Passed: %d%nFailed: %d%n", passes, failures );


	if(passes > 5){

	System.out.println("Bonus to instructor!");

	 }

	}

    }