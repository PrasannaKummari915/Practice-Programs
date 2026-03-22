package JavaPatterns;
import java.util.*;
public class SumOfArray {
	public static void main(String[] args) {
	           Scanner input=new Scanner(System.in);
	           System.out.print("Enter the length of array :");
	           int n=input.nextInt();     
	           int sum=0;
	           System.out.println("Array elements are:");
	           int arr[]=new int[n];
			   for(int i=0;i<n;i++) {
	        	   arr[i]=input.nextInt();
	        	   System.out.println(arr[i]);
	        	           sum=sum+arr[i];
	           }
	           System.out.print("The sum of array elements:"+sum);
	}
}
