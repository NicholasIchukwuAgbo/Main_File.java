import java.util.Scanner;

public class SmallestAndLarg{

   public static void main(String[] args){

   Scanner userinput = new Scanner(System.in);

   int total = 0;
   int smallest = Integer.MAX_VALUE;
   int largest = 0;
   int count = 1;
   int num;
   
  while(count < 5){
    
   System.out.println("Enter number " + count);
   num = userinput.nextInt();
   count++;
   total = total + num;
   if(num > largest){
    largest = num;
   }

   if(num < smallest){
    smallest = num;
   }

  }

   int average = total/5;

System.out.println("Sum is " + total);
System.out.println("Average is " + average);
System.out.println("The largest is " + largest);
System.out.println("The smallest is " + smallest);

   }

 }


