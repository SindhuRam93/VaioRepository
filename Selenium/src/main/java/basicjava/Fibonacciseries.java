package basicjava;



public class Fibonacciseries {

	public static void main(String[] args) {
		
		
		//initalizing variables

		int firstNumber=0, nextNumber=1, outputNumber;

//print first 2 numbers
	
		System.out.println(firstNumber);
		System.out.println(nextNumber);
		
		for(int i=0; i<=10;i++){
			
			outputNumber = nextNumber + firstNumber;
			if (outputNumber<100)
			{
			System.out.println(outputNumber);
			firstNumber= nextNumber;
			nextNumber= outputNumber;
			}
			else
				break;
		}
	
		
	}	
	
	

}
