package nestedForLoops;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		/* to print pattern of star in this format
		 * 
		 *  *
		 *  *  *
		 *  *  *  *
		 *  *  *
		 *  *
		 *  
		 */
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rows=2*n-1;
int j;
for(int i=1;i<=rows;i++) {
	if(i<=n) {
	for(j=1;j<=i;j++) {
		System.out.print("*  ");
	}
}else {
		for(j=1;j<=rows-i+1;j++) {
			System.out.print("*  ");
		}
	}System.out.println();
}
	}
}
