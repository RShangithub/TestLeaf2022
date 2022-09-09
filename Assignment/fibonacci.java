package week1.Assignment;

public class fibonacci {
public static void main(String[] args) {
	
	int fnum=0;
	int snum=1;
	int sum;
	for (int i=1;i<=11;i++) {
		 sum=fnum+snum;
		 fnum=snum;
		 snum=sum;
		 System.out.println(sum);
		 
	}
}
}
