package JavaPatterns;
import java.util.Scanner;
public class DoubleFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int df =1,i,m;
		System.out.println("Enter any double factorial to find double fact value:");
		m=sc.nextInt();
		for(i=m;i>0;i-=2) {
			df*=i;
			System.out.println("Double Factorial:"+df);
		}
    }
}