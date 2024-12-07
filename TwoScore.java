import java.util.Scanner;

public class TwoScore{

     public static void main(String[] args){

     Scanner userinput = new Scanner(System.in);

     System.out.println("Enter first Score");

     double num1 = userinput.nextInt();

     System.out.println("Enter Second Score");

     double num2 = userinput.nextInt();

     double nums = num1 + num2;


     System.out.println( "Sum: " + nums);

     double avg = nums/2;

     System.out.println("Average: "  + avg );
     
   

  }

 }