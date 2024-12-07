import java.util.Scanner;

     public class RemenderOperator {

                public static void main(String[] args) {

                 Scanner input =new Scanner (System.in);

                 System.out.println( "Enter Number" );
            
                  int Divisible3 = input.nextInt();

                  if(Divisible3 % 3 == 0) {

                  System.out.println(  "Sure," + Divisible3 +  " Is Divisble by 3" );

                  }

                  else System.out.println( "Nope," + Divisible3 + " Is Not Divisble by 3" );



           }
   

    }