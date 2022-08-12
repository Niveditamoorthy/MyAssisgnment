package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=count) {
				System.out.println("The Missing Element is:" +count);
				count++;
				break;
			}
				count++;
				
		}
	}

}
