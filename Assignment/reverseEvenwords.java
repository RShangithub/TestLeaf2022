package week1.Assignment;

public class reverseEvenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= " we are learning selenium java";
		String[] s= test.split("");
	for(int i=0;i<s.length;i++) {
		if(i%2!=0)
		{
      char[] first_word=s[i].toCharArray();
			for(int j=first_word.length-1;j>=0;j--)
			{
				System.out.print(first_word[j]);
        
		}
		}
		else
		{
		System.out.print(s[i]);
			
		}
	}
	}

}
