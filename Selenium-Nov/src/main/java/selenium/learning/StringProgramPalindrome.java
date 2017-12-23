package selenium.learning;

import java.util.Scanner;

public class StringProgramPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String inputSequence;
	String reverseSequence="";
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
	
	if(inputSequence.equalsIgnoreCase(reverseSequence)) {
		System.out.println("Entered sequence is a palindrome");
	}
	
	else {
		System.out.println("Entered sequence is not a palindrome");
	}
	
	
	}

	

}
