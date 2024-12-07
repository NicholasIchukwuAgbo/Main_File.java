import java.util.Scanner;

public class Area{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println( " Enter First Point " );

double firstPoint = input.nextDouble();

System.out.println( "Enter second point");

double secondPoint = input.nextDouble();

System.out.println( "Enter third point" );

double thirdPoint = input.nextDouble();

double Sum = firstPoint + secondPoint + thirdPoint / 2;

double Area = Math.sqrt(Sum);

System.out.println("Area is: " + Area );



     }


  }