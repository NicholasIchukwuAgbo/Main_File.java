
public class Arrays{

	public static void main(String[] args){

	int[] numbers = {3, 64, 76, 56, 46, 75};

	int[] newNumbers = {43, 65, 89, 54, 76, 36};

        newNumbers[3] = 100;

	for(int ages = 0; ages < numbers.length; ages++){

	numbers[ages] = newNumbers[ages];

	System.out.println(newNumbers[ages]);

        }


	System.out.println(newNumbers[3]);
   }



}