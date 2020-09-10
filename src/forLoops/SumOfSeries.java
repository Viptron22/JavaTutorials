/**program to prin of 1/n series where n is input from user
 * 
 */
package forLoops;
import java.util.Scanner;

/**
 * @author vidhu
 *
 */
public class SumOfSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float n;
		float sum=0f;
		System.out.print("enter the denominator number of 1/n:-");
		n=sc.nextFloat();
		for(float i=1;i<=n;i++) {
			sum +=1/i;
		}System.out.println("the sum of series 1/n is : "+sum);
		sc.close();

	}

}
