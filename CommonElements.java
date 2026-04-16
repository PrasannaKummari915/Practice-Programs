package CoreJavaProgram;
public class CommonElements {
	public static void commonEle(int[] arr1,int[] arr2) {
    	int n1=arr1.length;
    	int n2=arr2.length;
    	for(int i=0;i<n1;i++) {
    		for(int j=0;j<n2;j++) {
    			if(arr1[i]==arr2[j]) {
    				System.out.println("The common elements are:"+arr1[i]);
    			}
    		}
    	}
	}
	public static void main(String[] args) {
		int arr1[]= {1,4,5,6,7,8};
		int arr2[]= {1,5,0,2,3,10};
		commonEle(arr1,arr2);
	}

}
