import java.util.Scanner;

public class DivisibleByThree{

       public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       System.out.println("Enter A Number");

       int divide = input.nextInt();


       if(divide % 3 == 0){
       
       System.out.println(+ divide + " is divisible by 3");
         }

       else System.out.println( + divide + " not divible by 3");
       
        }

    }