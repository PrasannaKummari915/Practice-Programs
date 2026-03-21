package JavaPatterns;

import java.util.Scanner;
public class MinimumValue {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int n=input.nextInt();   
        int min;
        System.out.println("Array elements are:");
        int arr[]=new int[n];
		   for(int i=0;i<n;i++) {
     	   arr[i]=input.nextInt();
     	   System.out.print(arr[i]+" ");
		   }
		   min=arr[0];
		   for(int i=0;i<arr.length;i++) {
                if(arr[i]<min) {
              	min=arr[i];
        } 
	}
		   System.out.println("The minimum array element is:"+min);
  }
}