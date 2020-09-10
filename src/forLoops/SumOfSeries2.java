package forLoops;

import java.util.Scanner;

public class SumOfSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float n;
		float sum=0f;
		System.out.print("enter the denominator number of 1/n:-");
		n=sc.nextFloat();
		for(float i=1;i<=n;i++) {
			if(i%2==0) {sum -=(1/i);
			
			}else {
			 sum +=(1/i);
			}
		}System.out.println("the sum of series 1/n is : "+ sum);
		sc.close();


	}

}
