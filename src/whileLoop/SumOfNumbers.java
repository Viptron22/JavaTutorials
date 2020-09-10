package whileLoop;

import java.util.Scanner;



public class SumOfNumbers {

	public static void main(String[] args) {
		// to print sum of digits of a number
		Scanner sc=new Scanner(System.in);
		int n=0,sum=0;
		System.out.println("enter the number :-");
		n=sc.nextInt();
		int temp=n;              //storing the number in other variable so 'n' will not be tampered
		while(temp>0) {
			int lastDigit=temp%10;     //to get the last number of the digit
					temp/=10;          //to eliminate the last number
			sum +=lastDigit;		
		}
		System.out.println("the sum of the digits of:- "+n+" is "+ sum);
		sc.close();

	}

}
