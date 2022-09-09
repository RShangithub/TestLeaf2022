package week1.Assignment;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text= "We learn basics as part of java sessions in java week1";
		
		int count=0;
		String[] s=text.split("");
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<=s.length-1;j++)
				
			{
				if(s[i].equals(s[j]))
				{
			count=count+1;
				}
			
			 if(count>1)
			{
				s[j]="";
				
			}	
			 for (int k= 0;k<s.length;k++)
			 {
			 if(s[k] != "")
			
		System.out.print(s[k] + "");
	}

}
		}

	}

}
