import java.util.Scanner;

public class FirstInteger{ 

       public static void main(String[] args){

       Scanner input = new Scanner (System.in);
       
       System.out.println( " Enter First Number: " );
      
       int firstNum = input.nextInt();

       System.out.println( " Enter Second Number: " );
      
       int secondNum = input.nextInt();

       System.out.println( " Enter Third Number: " );
      
       int thirdNum = input.nextInt();
 
       System.out.println( " Enter Fourth Number: " );
      
       int fourthNum = input.nextInt();

       System.out.println( " Enter Fifth Number: " );
      
       int fifthNum = input.nextInt();

       if( firstNum > secondNum &&  firstNum > thirdNum &&  firstNum > fourthNum &&  firstNum > fifthNum){
       System.out.println( "First Number is the largest: " );
        }
       else System.out.println( "first Number is the smallest" );


       if( secondNum > firstNum &&  secondNum > thirdNum &&  secondNum > fourthNum &&  secondNum > fifthNum){
       System.out.println( "First Number is the largest: " );
        }
       else System.out.println( "Second Number is the smallest" );

       if( thirdNum > firstNum &&  thirdNum > secondNum &&  thirdNum > fourthNum &&  thirdNum > fifthNum){
       System.out.println( " Third Number is the largest: " );
        }
       else System.out.println( "Third Number is the smallest" );

       if( fourthNum > firstNum &&  fourthNum > secondNum &&  fourthNum > thirdNum &&  fourthNum > fifthNum){
       System.out.println( " Fourth Number is the largest: " );
        }
       else System.out.println( "fourth Number is the smallest" );

      if( fifthNum > firstNum &&  fifthNum > secondNum &&  fifthNum > thirdNum &&  fifthNum > fourthNum){
       System.out.println( " Fifth Number is the largest: " );
        }
       else System.out.println( "fifth Number is the smallest" );

} 

}