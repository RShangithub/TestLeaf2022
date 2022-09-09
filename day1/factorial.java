package week1.day1;

public class factorial {
	
//	Classroom Assignment 4: Find Factorial of a given number
//	Goal: To understand the for loop and logic writing
//	a) Create a class by name: Factorial
//	b) Create a main method using shortcut
//	c) Declare a class variable of type of int with a value as input
//	d) Write a logic to print the factorial of the given input
//	Hint: use for loop from 1 --> n and multiply with previous multiplied value
	
	
	public static void main(String[] args) {
		int output=1;
		int i;
		
		for(i=1;i<=5;i++)
		{
			output = output*i;
		}
		System.out.println(output);
	}

}
