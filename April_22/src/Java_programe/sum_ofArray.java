package Java_programe;

public class sum_ofArray {

	public static void main(String[] args) {
			int a[]= {4,7,8,9};
			int sum=0;
			/*for(int i=0;i<a.length;i++) 
			{
				sum=sum+a[i];
			}
			System.out.println(+sum);*/
			for(int value:a)
			{
				sum=sum+value;
			}
			System.out.println(+sum);

	}

}
