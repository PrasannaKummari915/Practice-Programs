package JavaPatterns;
import java.util.*;
public class MaximumValue {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int n=input.nextInt();   
        int max;
        System.out.println("Array elements are:");
        int arr[]=new int[n];
		   for(int i=0;i<n;i++) {
     	   arr[i]=input.nextInt();
     	   System.out.print(arr[i]+" ");
		   }
		   max=arr[0];
		   for(int i=0;i<arr.length;i++) {
                if(arr[i]>max) {
              	max=arr[i];
        } 
	}
		   System.out.println("The maximum array element is:"+max);
  }
}