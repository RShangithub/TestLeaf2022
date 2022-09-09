package week1.day1;

public class fibonacci {
	
//	1. Print Fibonacci Series for first 11 numbers
//	0 1 1 2 3 5 8 13 21 35 56
//	Goal: To understand Arithmetic Operation and Loop
//	a) Create class called Fibonacci
//	b) Create main method using shortcut
//	c) write a logic to print fibonacci from 0 to 56

	public static void main(String[] args) {
		int firstnum=0;
		int secondnum=1;
		int sum = 0;
		
		for (int i=0; i<=11;i++)
		{	
			
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
			//System.out.println(secondnum);
			
		}
	}

}
