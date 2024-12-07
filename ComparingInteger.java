import java.util.Scanner;

public class ComparingInteger{

       public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       System.out.println("Enter one Integer");

       int num1 = input.nextInt();

       int square = num1*num1;

       if(square > 100) {
       System.out.println("This is greater than 100");
       }

       if(square == 100) {
       System.out.println("This is equal to 100");
       }

       if(square < 100) {
       System.out.println("This is less than 100");
       }

    }

  }