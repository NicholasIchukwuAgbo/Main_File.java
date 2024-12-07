import java.util.Scanner;

public class DrivingCost{

    public static void main(String[] args){

    Scanner userinput = new Scanner(System.in);

    System.out.println("Enter the driving distance: ");

    double num1 = userinput.nextDouble();

    System.out.println("Enter mile per gallon: ");

    double num2 = userinput.nextDouble();

    System.out.println("Enter price per gallon: ");

    double num3 = userinput.nextDouble();

    System.out.println("The cost of driving is : " + cost );

    double cost = (num1*num3)/num2;

  

    }



 }

