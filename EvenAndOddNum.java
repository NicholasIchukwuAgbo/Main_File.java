import java.util.Scanner;

public class EvenAndOddNum{

      public static void main(String[] args){ 

      Scanner input = new Scanner(System.in);

      System.out.println("Enter Score 1");

      int largest = input.nextInt();


      System.out.println("Enter Score 2");

      int userinput = input.nextInt();

      if(userinput > largest) largest = userinput;

      System.out.println("Enter Score 3");

      userinput = input.nextInt();

      if(userinput > largest) largest = userinput;


      System.out.println("Enter Score 4");

      userinput = input.nextInt();

      if(userinput > largest) largest = userinput;


      System.out.println("Enter Score 5");

      userinput = input.nextInt();

      if(userinput > largest); largest = userinput;

      while(largest < userinput){ if(largest %2 > 0)
      System.out.println("the even number is : " + largest);
      }
 
    }

  }