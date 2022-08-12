package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343, temp,rev,rm;
		temp=num; {
			for(rev=0; num>0; num/=10)  
		{
				rm=num%10;
				rev=(rev*10)+rm;
		}
			if(rev==temp) {
				System.out.println("The given number is Palindrome");
			}
			else {
				System.out.println("The given number is not Palindrome");
			}
		}

	}

}
