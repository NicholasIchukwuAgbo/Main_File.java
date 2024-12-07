import java.util.Scanner;

         public class MultiResult{
           
                    public static void main(String[] args){
                     
                      Scanner input = new Scanner (System.in);
  
                      System.out.println( "FIRST INTEGER" );

                      int firstInteger = input.nextInt();

                      System.out.println( "SECOND INTEGER" );

                       int secondInteger = input.nextInt();

                       System.out.println( "THIRD INTEGER" );

                       int thirdInteger = input.nextInt();

                       int Sum = firstInteger+ secondInteger+thirdInteger;

                       int Average = Sum/3;

                       int Product = firstInteger* secondInteger*thirdInteger;

                       System.out.printf( " Sum is equal to:"  +  Sum );

                       System.out.printf( " Average is equal to:"  +  Average );

                       System.out.printf( " Product is equal to:"  +  Product );

                       if( firstInteger > secondInteger && firstInteger > thirdInteger){

                       System.out.println("  FIRST INTEGER IS GREATER  ");
                         }
                       else System.out.println("  FIRST INTEGER IS THE SMALLER  ");

                       if( secondInteger > firstInteger && secondInteger > thirdInteger){

                       System.out.println("SECOND INTEGER IS GREATER");
                         }
                       else System.out.println("SECOND INTEGER IS SMALLER");

                       if( thirdInteger > firstInteger && thirdInteger > secondInteger){

                       System.out.println("THIRD INTEGER IS GREATER");
                         }
                       else System.out.println("THIRD INTEGER IS SMALLER");
                         

           }

    }