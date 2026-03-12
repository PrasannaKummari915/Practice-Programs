package PracticePrograms;
import java.util.Scanner;
public class CopySetBits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int l = sc.nextInt();
	        int r = sc.nextInt();
	        for (int i = l; i <= r; i++) {
	            int mask = 1 << (i - 1);
	            if ((y & mask) != 0) {
	                x = x | mask;
	            }
	        }
	        System.out.println(x);
	    }
	}