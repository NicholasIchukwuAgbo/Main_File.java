import java.util.Scanner;

public class SmallLarg{

   public static void main(String[] args){

   Scanner userinput = new Scanner(System.in);

   System.out.println("Enter Five Integer");

   float total = 0;

   float largest = 0;

   float smallest = Integer.MAX_VALUE;

   float average = 0;

   float count = 1;

   while(count < 6){
 
   System.out.println("Enter a number");

   float num = userinput.nextInt();
   count++;

   total = total + num;

   if(num > largest){
   largest = num;
   }

   if(num < smallest){
   smallest = num;
   }
     }

average = total/5;
float range = largest - smallest;

System.out.println("total is: " + total);
System.out.println("Average is: " + average);
System.out.println("Smallest is: " + smallest);
System.out.println("Largest is: " + largest);
System.out.println("Range is: " + range);

   }


}