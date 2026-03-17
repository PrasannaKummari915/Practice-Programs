package PracticePrograms;
import java.util.*;
import java.math.BigInteger;

	public class DivisibleBy7 {
		
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read the large number as a string
	        String numStr = sc.next();

	        // Convert to BigInteger to handle very large values
	        BigInteger num = new BigInteger(numStr);

	        // Check divisibility by 7
	        if (num.mod(BigInteger.valueOf(7)).equals(BigInteger.ZERO)) {
	            System.out.println(1);
	        } else {
	            System.out.println(0);
	        }
	    }
	}

