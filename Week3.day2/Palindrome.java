package Week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String s="Madam";
		String rev="";
		
		char[] temp=s.toCharArray();
		for(int i=temp.length-1;i>=0;i--) {
			rev=rev+temp[i];
		}
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		

	}

}
