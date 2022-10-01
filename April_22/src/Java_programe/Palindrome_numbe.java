package Java_programe;

public class Palindrome_numbe {

	public static void main(String[] args) {
		int num=1264321;
		int orinum=num;
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(orinum==rev) 
		{
			System.out.println(rev+  "palindrome number");
		}
		else
		{
			System.out.println(rev+"not palindrome num");
		}
			

	}

}
