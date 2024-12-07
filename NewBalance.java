import java.util.Scanner; 

public class NewBalance{

     public static void main(String[] args){

     Scanner userinput = new Scanner(System.in);

     System.out.print("Enter beginning balance: ");

     int oldBalance = userinput.nextInt(); 

     System.out.print("Enter charges: ");

     int charges = userinput.nextInt(); 

     System.out.print("Enter credits: ");

     int credits = userinput.nextInt(); 
    
     int newBalance = (oldBalance +  charges) - credits;


     System.out.println("The New Balance is: " + newBalance);

     if(newBal ance > credits) System.out.println("Credit Limit Exceeded");

   }


 }

