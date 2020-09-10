package nestedForLoops;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TO print a traingle where the traingle lenght "n"is input by user

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j;
		System.out.println("              *");
		for(int i=n;i>=1;i--) {
			for(j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=n-i+1;j++) {
				
				System.out.print(" * *");
				
				
				
			}System.out.println();
			}

	}

}
