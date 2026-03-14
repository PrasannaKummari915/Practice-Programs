package PracticePrograms;
import java.util.*;
public class GCDAndLCM {
	
	public static int gcd(int a, int b) {
		if(b==0) return 0;
		while(b!=0) {
     	   int temp=b;        //46 58 b=46 =temp=46
     	   b=a%b;             // b=58%46= b=8
     	   a=temp;        	  // a=48
        }                     //b=48%8 b==0a==8
		return a;
	}
	
	public static int lcm(int a, int b) {
		if(b==0) return 0;                   
	    int result= (a*b)/gcd(a,b);

		return result;
	}

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           System.out.println("a:"+a);
           int b=sc.nextInt();
           System.out.println("b:"+b); 
           
		System.out.println("GCD is:"+gcd(a,b));
		System.out.println("LCM is:"+lcm(a,b));
	}
	}




/* gcd:
	10 2           
	2)10(5
      10
     -----
       0

       
       48 3
   48)56(1
	  48
	 ----
       8)48(6
         48
        -----
          0
          
*/
