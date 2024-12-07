import java.util.Scanner;

public class Weight {

       public static void main(String[] args){

       Scanner input = new Scanner (System.in);

       System.out.print( " Enter weight: " );

       double weight = input.nextDouble();

       double pounds = weight*0.45359237;

       System.out.print( " Enter height: " );

       double height = input.nextDouble();

       double inches = height*0.0254;

       double bml = weight*height;

       //System.out.print( " weight is: " + pounds + "pounds");

      // System.out.print( " heigt is: " + inches + "inches");

       System.out.print( " Bml is : " + bml );




    }


 }