package basicjava;

import java.util.Scanner;

public class Multilicationtale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input the number

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int intNum=scan.nextInt();
		int oututNumber =0;
		
		//ouputing the mutilplication talble using for loop
		
		
		for(int i =0;i<=10;i++)
		{
			oututNumber = i*intNum;
			System.out.println( i+"*" +intNum+"="+oututNumber);
		}
	}

}
