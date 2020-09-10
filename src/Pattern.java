import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		/* to print '*' in pattern        *
		                                  **
		                                  ***
		                                  **** 
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print(" "+'*');
				
			}System.out.println("\t");
		}
		

	}

}
