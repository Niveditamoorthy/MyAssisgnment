package Week3.day2;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> newset = new TreeSet<Integer>();
		
		for(int i=0;i<data.length;i++)
		{
			newset.add(data[i]);
		}
		
		ArrayList<Integer> list=new ArrayList<Integer>(newset);
		int second=list.get(list.size()-2);
		System.out.println("Second largest number:" +second);
		
		
	}

}
