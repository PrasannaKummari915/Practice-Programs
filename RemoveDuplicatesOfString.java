package PracticePrograms;
import java.util.*;
public class RemoveDuplicatesOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String result="";
		for(char ch:str.toCharArray()) {
			if(result.indexOf(ch)==-1) {
			result+=ch;
		}
		}
		System.out.println(result);
	}

}               p r a s a n n a
                0 1 2 3 4 5 6 7
                
