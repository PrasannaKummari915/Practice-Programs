package JavaPatterns;
import java.util.*;
public class SumOfStringPlacesValue {
	static int sumOfString(String s) {
		char ch='a';
		int sum=0;
		for(int i=0;i<=s.length();i++) {
		    	if(i==(char)((ch++)-96)){
		    		sum+=sum;
		    	}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s;
		s=input.nextLine();
		System.out.println("Given String is:"+s);
		int sum=sumOfString(s);
		System.out.println("Sum of String is:"+sum);
	}
}