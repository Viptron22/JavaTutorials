package whileLoop;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TO check whether the entered number is palindrome or not
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("enter the number:-");
		n=sc.nextInt();
		int temp=n;
		int reverseNum=0;
		while(temp>0) {
			int lastDigit=temp%10;             //for taking last digit of number
			reverseNum=reverseNum*10+lastDigit; //formula for reversing number
			temp/=10;  //reinitialization and eliminates last digit from number
		}
		if(reverseNum==n) {
			System.out.println("the entered number is palindrome");
		}
		else System.out.println("the entered number is not palindrome");
		sc.close();

	}

}
