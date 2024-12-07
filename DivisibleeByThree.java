import java.util.Scanner;

public class DivisibleeByThree{

	public static void main(String[] args){

	Scanner userinput = new Scanner(System.in);

	System.out.println("Enter a number");

	int num = userinput.nextInt();

        if(num % 3 == 0){
        System.out.println("This is divisible by 3");
	} 
        else System.out.println("Not divisible by 3");

    }



  }