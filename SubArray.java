package JavaPatterns;
import java.util.ArrayList;
public class SubArray {
	    static void subArray(ArrayList<Integer> arr) {
	        int n = arr.size();
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                for (int k = i; k <= j; k++) {
	                    System.out.print(arr.get(k) + " ");
	                }
	                System.out.println();
	            }
	        }
	    }
	    public static void main(String[] args) {
	        ArrayList<Integer> arr = new ArrayList<>();
	        arr.add(10);
	        arr.add(20);
	        arr.add(30);
	        arr.add(40);
	        System.out.println("All Non-empty Subarrays:");
	        subArray(arr);
	    }
	}