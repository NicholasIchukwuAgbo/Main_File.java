import java.util.Scanner;

  public class MeterFeet {

         public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

	 System.out.println("enter a number in feet");

	 double feet = input.nextInt();

         double result = feet*0.305;

	 double meter = result;

	 System.out.printf( feet + "  feet is  " + meter + " meters ");

   }

 }