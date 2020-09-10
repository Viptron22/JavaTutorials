package forLoops;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// To check whether the entered number by user is prime number or not
		Scanner sc=new Scanner(System.in);
		float num;
		boolean IsPrime=true;
		System.out.println("enter the number");
		num=sc.nextFloat();
//		for(int i=2;i<num;i++) { this loops runs for 2->num
		for(int i=2;i*i<=num;i++) {  //i<factor<under root of the number,this logic uses less time   
			if(num%i==0) IsPrime=false;
		}if(num<2)IsPrime=false;
		System.out.println("the number is prime number?:-"+IsPrime);
		sc.close();
		

	}

}
