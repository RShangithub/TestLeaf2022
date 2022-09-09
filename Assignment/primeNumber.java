package week1.Assignment;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastNumber=51;
		for (int i=1;i<=lastNumber;i++) {
			prime(i);
		}

	}
	
	public static void prime(int num) {
		boolean flag=false;
		int h=num/2;
		for (int i=2;i<=h;i++) {
			if(num%i==0) {
				flag=true;	
				break;
			}

		}
		if(flag==false) {
			System.out.println("Number("+num+") is a prime number");
		}
	}

}
