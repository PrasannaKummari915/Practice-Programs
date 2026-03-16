package PracticePrograms;
import java.util.*;
public class LinearSearch {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int[] arr=new int[n];
    	 for(int i=0;i<n;i++) {
    		 arr[i]=sc.nextInt();
    	 }
    	 System.out.println("Linear Search Key is:");
         int key=sc.nextInt();
         boolean res=false;
         for(int i=0;i<n;i++) {
        	 if(key==arr[i]) {
        		 res=true;
        		 break;
        	 }
        	
         }
        System.out.println(res?"Key Found":"Key Not Found");
}
}
