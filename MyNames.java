import java.util.Scanner;

public class MyNames{

     public static void main(String[] args){

     Scanner userinput = new Scanner(System.in);

     System.out.println("Enter first Name");

     String name1 = userinput.next();

     System.out.println("Enter Last Name");

     String name2 = userinput.next();

     
     System.out.println("Good evening "  + name1 + name2);

  }

 }