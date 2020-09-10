package nestedForLoops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		/* TO print pattern wher pattern size "n" is input by user
		 *
		 * *
		 * * *
		 * * * *
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}

	}

}
