package selenium.learning;

import java.util.Scanner;

public class StringRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputSequence;
		char char1;
		char char2;
		int count =0,temp=0,i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input sequence");
		inputSequence=scan.nextLine();
		
		int length= inputSequence.length();
		
		for(i=0;i<=length;i++) {
			 
			char1 = inputSequence.charAt(i);
			for(j=i+1;j<=length;j++) {
				
				char2=inputSequence.charAt(j); 
				
				if(char1 == char2) {
					count++;
				}
				
			}
			
		System.out.println(count);	
		}
		
		
	}

}
