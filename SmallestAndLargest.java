import java.util.Scanner;

public class SmallestAndLargest{

      public static void main(String[] args){

      Scanner userinput = new Scanner(System.in);

      int number,  numberOne, numberTwo,  sum ;
       
      String optional;

      do{
      System.out.println("Enter any number: ");

      numberOne = userinput.nextInt(); 

      System.out.println("Enter any number: ");

      numberTwo = userinput.nextInt();

      sum = numberOne + numberTwo;
    
      System.out.println("The sum is: " + sum);

      System.out.println("Do u still want to perform another (optional) " );

      optional = userinput.next();
      }
  
      while
     (optional.equalsIgnoreCase("Yes"));
     }


  }


