package Week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {
		String text="Nivedita";
		char[] ch =text.toCharArray();
		Set<Character>newset=new HashSet<Character>();
		for(Character data :ch) {
			newset.add(data);
		}
		System.out.println(ch);
		
		List<Character>list=new ArrayList<Character>(newset);
		for(int i=0;i<list.size();i++)
		{ 
			int count=0;
			for(int j=0; j<ch.length;j++)
			{
				if(list.get(i)==ch[j])
				{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(list.get(i));
		}
		}

	}

}
