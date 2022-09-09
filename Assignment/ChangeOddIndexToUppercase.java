package week1.Assignment;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String test="changeme";
			char[] a=test.toCharArray();
			String output=" ";
			
			for(int i=0;i<a.length;i++)
			{
				if(i%2!=0)
					
				{
					output=output+Character.toUpperCase(a[i]);
					
					
				}
					
				else  
				{
					
					output= output+a[i];
			}
		}
			
	System.out.println("The Output is :"+ output);
	}

}
