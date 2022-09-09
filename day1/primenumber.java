package week1.day1;

public class primenumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int num=13;
		boolean bprime=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			System.out.println("Not a prime");
			bprime=false;
			break;
		} 
		if(bprime==true)
		{
			System.out.println("Prime number");
		}
	}
}
