package CoreJavaProgram;

public class TriangleFiboSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=a+b,i,j;
        for(i=1;i<=5;i++) {
       	 for(j=1;j<=i;j++) {
       		 System.out.print(c+" ");
       		 c=a+b;
       		 a=b;
       		 b=c;
       	 }
       	 System.out.println();
        }
	}
}
