package week1.Assignment;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="TestLeaf";
		
		String rev="";
		
		int n=str.length();
		
		for(int i=n-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println(" Reverse of the given string is : "  + rev);
	
		if(str.equalsIgnoreCase(rev))
			
		System.out.println("The String is a palindrome");
		
		else {
			System.out.println("The String is not a palindrome");
		
		}
	}

}
