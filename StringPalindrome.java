package JavaPatterns;
public class StringPalindrome {
      static String revStr(String str) {
    	  if(str.isEmpty()||str.length()==1) {
    		  return str;
    	  }
    	  else{
    		  return revStr(str.substring(1))+str.charAt(0);
    	  }
      }
	public static void main(String[] args) {
		String s="Prasanna";
		String r=revStr(s);
		System.out.println("Reverse of a String is:"+r);
		//if(s.equals(r)) {
			//System.out.println("Sting is Palindrome");
		//}
		//else {
			//System.out.println("Sting is not Palindrome");
		//}
	}
}
