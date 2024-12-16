public class PraticeMode{

	public static void main(String[] args){

	int[] array = {4758, 5748, 4748, 400, 7598, 5757, 4640, 7460, 4634, 6437};

	System.out.println("smallest is: " + smallest(array));

	System.out.println("Largest is: " + largest(array));

	System.out.println("Sum is: " + sum(array));

	System.out.println("Number Of Evene is: " + even(array));

	System.out.println("Number of Odd is: "  + odd(array));

	System.out.println("Sum Of Odd Is: " + sumOfOdd(array)); 

	System.out.println("Sum Of Even Is " + sumOfEven(array));

       }

	public static int smallest(int[] array){

	int smallest= array[0];

	for(int i = 1; i < array.length; i++){

	if(array[i] < smallest){

	smallest = array[i];

         }

        }

	return smallest;

       }


	public static int largest(int[] array){

	int largest = array[0];

	for(int j = 1; j < array.length; j++){

	if(array[j] > largest){

	largest = array[j];

         }

        }

	return largest;

       }


	public static int sum(int[] array){

	int sum = 0;

	for(int total : array){

	sum += total;

	}

	return sum;

       }

	public static int even(int[] array){
	
	int even = 0;

	for(int numberOfEven : array){

	if(numberOfEven % 2 == 0){

	even++;

        }

       }
      return even;
      }

	public static int odd(int[] array){

	int odd = 0;

	for(int numberOfOdd : array){

	if(numberOfOdd % 2 != 0){

	odd++;

	}
      
       }

	return odd;
      }

	public static int sumOfOdd(int[] array){

	int sumOfOdd = 0;

	for(int oddSum : array){

	if(oddSum % 2 != 0){

	sumOfOdd += oddSum;

       }

      }

	return sumOfOdd;

     }

	public static int sumOfEven(int[] array){

	int sumOfEven = 0;

	for(int evenSum : array){

	if(evenSum % 2 == 0){

	sumOfEven += evenSum;
  
        }
    
       }

      return sumOfEven;

    }




}