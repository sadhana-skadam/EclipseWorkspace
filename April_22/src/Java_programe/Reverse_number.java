package Java_programe;

public class Reverse_number {

	public static void main(String[] args) {
		int num=3456;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			System.out.println(+rev);
			
		}
	}

}
