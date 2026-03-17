package PracticePrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=1237689;
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum+=digit;
			num=num/10;
		}
		System.out.println("Sum of the given digit is:"+sum);
	}

}
