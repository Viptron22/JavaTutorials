package forLoops;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// program to print fibonacci series till the entered number
		Scanner sc=new Scanner(System.in);
		 int a =0,b=1,num;
		 int c;
		 System.out.println("enter the number till you want to print the series");
		 num=sc.nextInt();
		 System.out.print(a+" ");
		 System.out.print(b+" ");
		 for( int i=1;i<=num-2;i++) {
			 c=a+b;
			 System.out.print(c+" ");
			 a=b;
			 b=c;
			 
			 
			 
			 
		 }sc.close();

	}

}
