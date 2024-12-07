import java.util.Scanner;

public class TwoSum{

     public static void main(String[] args){

     Scanner userinput = new Scanner(System.in);

     System.out.println("Enter First Number");

     int num1 = userinput.nextInt();

     System.out.println("Enter Second Number");

     int num2 = userinput.nextInt();

     int sum = num1 + num2;

     if(sum > 100){

     System.out.println("Greater Than 100");

     } else if(sum < 100) {

     System.out.println("lesser Than 100");

     } else if(sum == 100){

     System.out.println("Equal to 100");
     }


    
  }

 }