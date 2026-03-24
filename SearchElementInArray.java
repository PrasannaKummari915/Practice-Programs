package JavaPatterns;

public class SearchElementInArray {
      static int search(int arr[],int elem) {
    	  for(int i=0;i<arr.length;i++) {
    		  if(arr[i]==elem) {
    			  return elem;
    		  }
    	  }
    	  return -1;
      }
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,88,99,56};
		int elem=4;
	    int pos=search(arr,elem);
	    if(pos==-1)
		    System.out.println("The element is not found");
	    else
		    System.out.println("The element is found");

	}
	}
