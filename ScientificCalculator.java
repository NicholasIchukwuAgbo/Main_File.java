	import java.util.*;
  
	public class ScientificCalculator{

	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	System.out.println("""

	:::Select:::Any:::Operator:::Below:::

		1: Add (+)

		2: Multiply (*)

		3: Divide (/)

		4: Subtract (-)

		5: Power (x^y)

		6: Square Root

		7: Sine (sin)

		8: Cosine (cos)

		9: Tangent (tan)

	 """);

	System.out.print("Enter number of your choice (1 - 9): ");
	
	int fromUser = userInput.nextInt();
 
	double  num1, num2, result;

	switch(fromUser){

	case 1: 
		System.out.print("Enter First Number: ");
		num1 = userInput.nextDouble();
		System.out.print("Enter Second Number: ");
		num2 = userInput.nextDouble();
		result = num1 + num2;
		System.out.print("Result: " + result);
		break;

	case 2:
		System.out.print("Enter First Number: ");
		num1 = userInput.nextDouble();
		System.out.print("Enter Second Numbe: ");
		num2 = userInput.nextDouble();
		result = num1 * num2;
		System.out.print("Result: " + result);
		break;

	case 3:
		System.out.print("Enter First Number: ");
		num1 = userInput.nextDouble();
		System.out.print("Enter Second Numbe: ");
		num2 = userInput.nextDouble();
		result = num1 / num2;
		System.out.print("Result: " + result);
		break;

	case 4:
		System.out.print("Enter First Number: ");
		num1 = userInput.nextDouble();
		System.out.print("Enter Second Numbe: ");
		num2 = userInput.nextDouble();
		result = num1 - num2;
		System.out.print("Result: " + result);
		break;

	case 5:
		System.out.print("Enter First Number: ");
		num1 = userInput.nextDouble();
		System.out.print("Enter Second Numbe: ");
		num2 = userInput.nextDouble();
		result = Math.pow(num1, num2);
		System.out.print("Result: " + result);
		break;

	case 6:
		System.out.print("Enter A Number: ");
		num1 = userInput.nextDouble();
		if(num1 >= 0){
		result = Math.sqrt(num1);
		System.out.println("Square Root: " + result);
		} else { 
		System.out.println("Error");
		}
		break;

	case 7:
		System.out.print("Enter A Number: ");
		num1 = userInput.nextDouble();
		result = Math.sin(num1);
		System.out.print("Sin: " + result);
		break;

	case 8:
		System.out.print("Enter A Number: ");
		num1 = userInput.nextDouble();
		result = Math.cos(num1);
		System.out.print("Cos: " + result);
		break;

	case 9:
		System.out.print("Enter A Number: ");
		num1 = userInput.nextDouble();
		result = Math.tan(num1);
		System.out.print("Tan: " + result);
		break;

	default:
		System.out.println("Invalid choice! select a valid choice pls.");

	  }

     }

  }

