import java.util.Scanner;

public class EndlessCount{

   public static void main(String[] args){

   Scanner userinput = new Scanner(System.in);

   int count = 0;

   for (; ; count++ ){
   System.out.println(count);
   if(count > 20) break;
}
 

  }

}