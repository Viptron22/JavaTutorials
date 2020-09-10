package forLoops;
import java.util.Scanner;


public class FactorialOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int fact;
		
		System.out.println("enter a number which you want to get factorial of");
		n=sc.nextInt();
		fact=n;
		for(int i=n-1;i>=1;i--) {
			
			
			fact=fact*i;
		
			
			
			
			
		}
			
		
		
		System.out.println("factorial of entered number is "+ fact);
		sc.close();
		

	}

}
