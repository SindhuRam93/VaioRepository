package selenium.learning;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputSequence,inputSequence1;
		String reverseSequence="",reverseSequence1="";
		int length,i,j;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the input sequence");
		inputSequence=scan.next();
		
		length= inputSequence.length();
		System.out.println("Length of the input Sequence is: "+length);
		for(i=length-1;i>=0;i--) {
			
			reverseSequence= reverseSequence+inputSequence.charAt(i);
			}
		
		
		System.out.println("Reverse Sequence is "+reverseSequence);
		
		//2ND METHOD
		System.out.println("Enter the input sequence2");
		inputSequence1=scan.next();
		
		StringBuffer reverse= new StringBuffer(inputSequence1).reverse();
		System.out.println(reverse);
		
	}

}
