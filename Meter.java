import java.util.Scanner;


public class Meter{

         public static void main(String[] args){

        Scanner Scanner = new Scanner(System.in);

        System.out.println("press any number in feet:");

        double feet = Scanner.nextDouble();

        double result  = feet*0.0305;

        double meter = result;

  
    System.out.printf(feet +   "feet is"   +   meter   +   "meters");


    }


}