package forLoops;
import java.util.Scanner;
public class RaiseToPower {

	public static void main(String[] args) {
		// program to find x raise to the power y, x and y are to be taken input by user
		Scanner sc= new Scanner(System.in);
		int x,y;
		int result=1;
		System.out.print("enter the number x:-");
		x=sc.nextInt();
		System.out.print("enter the number y:-");
		y=sc.nextInt();
		for(int i=1;i<=y;i++) {
			result*=x;
		}System.out.println("x raise to power y is:- "+result);

	}

}
