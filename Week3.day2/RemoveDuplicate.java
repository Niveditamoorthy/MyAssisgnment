package Week3.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
        int count = 0;
        
        String words[]  = text.split(" ");
        for(int i=0;i<words.length;i++)
        {
		for(int j=i+1;j<words.length;j++)
		{
       if((words[i].equalsIgnoreCase(words[j])))
     	   {
     	  count=count+1; 

     	  words[j]="";
     	   }
        }
        }
        if(count>1)
     for(int k=0;k<words.length;k++)
     		 
     {
		 System.out.print(words[k]+ " ");
     	  }
      

	}

}
