package JavaPatterns;

public class RotateArray {
	static void rotateArr(int arr[],int n) {
		int last;
		last=arr[arr.length-1];
		for(int j=arr.length-1;j>0;j++) {
			arr[j]=arr[j-1];
		}
		last=arr[0];
	}
	static void printArray(int arr[],int n) {
		int i;
		for(i=0;i<arr.length;i++) {
			int result=rotateArr(arr,n);
			System.out.println("rotated Array:"+result);
		}
	}
	public static void main(String[] args) {
		 

	}

}
