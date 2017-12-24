package selenium.learning;

import java.util.Scanner;

public class StringClassPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputSequence;
		int j=0,count=0, position=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input sequence");
		inputSequence=scan.nextLine();
		
		int length= inputSequence.length();
		int [] pos =new  int[10];
		char [] sequence = inputSequence.toCharArray();
		 
		for (int i = 0; i < sequence.length; i++) {
			
			if(sequence[i]=='A') {
				count++;
				pos[j]=i;
				j++;
			}
			
		}
		
		
		System.out.println("total Count of A is: "+count);
	
		int num=count/2;
		
		if(num==0) {
			System.out.println("Position of middle A is :"+num);
		}
		else {
			
			System.out.println("Position of middle A is :");
			System.out.print(num+1);
		}
		
		}
		
			
		}
		
	
		
		
	


