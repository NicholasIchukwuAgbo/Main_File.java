 import java.util.Scanner;

 public class ClassAverage{

	public Static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	int total = 0;

	int gradeCounter = 1;

	while(gradeCounter <= 10){

	System.out.println("Enter a grade");

	int grade = userInput.nextInt();

	total += grade;

	gradeCounter++;
        }

	int average = total/10;

	System.out.println("The total is:  " + total);

	System.out.println("Average is: " + average);


     }

}