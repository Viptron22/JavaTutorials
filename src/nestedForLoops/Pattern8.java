package nestedForLoops;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		/* TO print pattern of star where maximum no.of star in a line"n" is input by user
		 * 
		 * *
		 * * *
		 * * * *
		 * * *
		 * *
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ROWS=2*n-1;
		int j;
		for(int i=1;i<=ROWS;i++) {
			
				
			   if(i>n) {
				    
				for(j=n-1;j>=1;j--) { 
					System.out.print("*  ");
				
			   }
			   }
				else {

					for(j=1;j<=i;j++) {
					System.out.print("*  ");
					
			}
				}
				
			System.out.println();
		}sc.close();
	}
		

	

}
