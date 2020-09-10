package whileLoop;

import java.util.Scanner;

public class FindingNoOfDigits {

	public static void main(String[] args) {
		// TO find number of digits in a number using math function
		Scanner sc=new Scanner(System.in);
		int n=0,digit;
		System.out.println("enter the number:-");
		n=sc.nextInt();
		digit=(int)Math.log10(n)+1;  //formula to find number of digits
		System.out.println("the number of digits in the entered number are:-"+ digit);
		sc.close();

	}

}
