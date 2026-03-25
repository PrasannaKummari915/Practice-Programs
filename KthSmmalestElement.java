package JavaPatterns;

public class KthSmmalestElement {
    static void sort(int arr[]) {
    	int n=arr.length;
    	for(int i=0;i<n-1;i++) {
    		for(int j=0;j<n-1-i;j++) {
    			if(arr[j]>arr[j+1]) {
    				swap(arr,i,j+1);
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		int arr[]= {2,43,14,5,9,7};
		int k=3;
		

	}

}
