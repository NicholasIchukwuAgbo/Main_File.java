import java.util.Scanner;

public class TwoSquare{
 
       public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);

       System.out.print( " Enter First Integer: ");
       int firstInteger = input.nextInt();
   
       System.out.print("Enter second Integer: ");
       int secondInteger = input.nextInt();

       int squareOne = firstInteger * firstInteger  ;
       System.out.println( " The square is: " + squareOne);

       int squareTwo =  secondInteger * secondInteger ;
       System.out.println( " The square is: " + squareTwo);

       int sum =  squareOne + squareTwo;
       System.out.println( " The sum is:" + sum );

       int diff =  squareOne- squareTwo;
       System.out.println(" Difference is: " +diff);
	
}

}