import java.util.Scanner;

public class LargestScore{

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

      if(userinput > largest) largest = userinput;

      System.out.println("The largest is: " + largest);
      
 
    }

  }

       