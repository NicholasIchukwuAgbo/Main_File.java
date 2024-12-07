import java.util.Scanner;

   public class LargestNum {

       public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.print("First Score  ");

       int firstNum = input.nextInt();

       System.out.print("Second Score ");

       int secondNum = input.nextInt();

       System.out.print("Third Score ");

       int thirdNum = input.nextInt(); 

       System.out.print("Fourth Score ");

       int fourthNum = input.nextInt();

       System.out.print("Fifth Score ");

       int fifthNum = input.nextInt();

       if (firstNum > secondNum && firstNum > thirdNum && firstNum > fourthNum && firstNum > fifthNum)  {    

       System.out.println( "First is the largest "  + firstNum );
       }

       if (secondNum > firstNum && secondNum > thirdNum && secondNum > fourthNum && secondNum > fifthNum ){

       System.out.println( "Second is the largest "  + secondNum );
       }

       if (thirdNum > firstNum && thirdNum > secondNum && thirdNum > fourthNum && thirdNum > fifthNum){

       System.out.println( "Third is the largest "  +  thirdNum );
       }

       if (fourthNum > firstNum && fourthNum > secondNum && fourthNum > thirdNum && fourthNum > fifthNum){

       System.out.println( "Fourth is the largest "  + fourthNum );
       }
    
       if (fifthNum > firstNum && fifthNum > secondNum && fifthNum > thirdNum && fifthNum > fourthNum){

       System.out.println("Fifth is the largest "   + fifthNum );
       }





}


}




