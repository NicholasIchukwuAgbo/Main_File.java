import java.util.Scanner;

public class SmallAndLargest{

   public static void main(String[] args){

   Scanner userinput = new Scanner(System.in);

   System.out.println("Enter five numbers");

   int sum = 0;
   
   int smallest = Integer.MAX_VALUE;

   int largest = Integer.MIN_VALUE;

   int count = 0;
   
   while(count < 10){
  
   System.out.println("Enter number");

   int num = userinput.nextInt();
  
   count++;

   sum += num;

   if(num > largest){
   largest = num;
   }

   if(num < smallest){
    smallest = num;
   }

   }
float average = sum/10;

System.out.println("SUM IS: " + sum);
System.out.println("LARGEST IS: " + largest);
System.out.println("SMALLEST IS " + smallest);
System.out.println("AVERAGE IS " + average);
      }




  }