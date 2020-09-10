package forLoops;
import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		// program to print sum of n numbers,input of n is by user
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("enter the number:-");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		
		}
		
System.out.println("the sum of n number is "+ sum);
sc.close();
	}

}
