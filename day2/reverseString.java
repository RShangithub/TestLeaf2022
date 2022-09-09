package week1.day2;

public class reverseString {

	public static void main(String[] args) {
	String Input = "HelloWorld";
	
	//split string to array of chars
	char[] resultchar= Input.toCharArray();
	
	for(int i=resultchar.length-1;i>=0;i--)
	{
		System.out.println(resultchar[i]);
		
	}
	
}
}
