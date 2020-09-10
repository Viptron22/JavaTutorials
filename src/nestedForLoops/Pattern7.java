package nestedForLoops;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		/* TO print pattern of numbers in increasing count where pattern lenght "n" is input by user
		 1
     2        3
  4  	 5       6
7    8       9      10  
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int j;
		for(int i=n;i>=1;i--) {
			for(j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			
			for(j=1;j<=n-i+1;j++) {
				if(num>10) {
				System.out.print(num++ +"  ");
				}
				else System.out.print(num++ +"   ");
			}System.out.println();
		}sc.close();

	}

}
