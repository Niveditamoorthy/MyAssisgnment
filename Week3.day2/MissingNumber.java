package Week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] data= {1,2,3,4,5,6,7,8,10};
		
		Set<Integer> newset = new TreeSet<Integer>();

		for(int i=0;i<data.length;i++) 
		{
			newset.add(data[i]);
		}
		
		System.out.println("Numbers are: " + newset);
		
		for(int i=0;i<data.length-1;i++)
		{
			
				if(data[i]+1!=data[i+1]) 
				{
					System.out.println("Missing number is: " + (data[i]+1));
					
				}
			}
	
	}
	
}
