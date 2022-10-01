package Java_programe;

public class prime_number {

	public static void main(String[] args) {
		int num=3;
		int count=0;
		if(num>1) 
		{
			for(int i=1; i<num;i++) {
				if(num%1==0)
					count++;
			}
			if(count==2) {
				System.out.println("prime number");
			}
			System.out.println("not prime number");
		}
			
		}
	}


