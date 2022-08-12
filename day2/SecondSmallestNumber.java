package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		
		int[] n= {23,45,67,32,89,22};
		
		Arrays.sort(n);
		System.out.println(n[1] +" is the second smallest number");

	}

}
