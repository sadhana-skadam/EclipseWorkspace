package Java_programe;

public class missing_element {

	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		int sum1=0;
		for(int i=0;i<a.length;i++) 
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of element in array"+sum1);
		int sum2=0;
		for(int i=1;i<=5;i++) 
		{
			sum2=sum2+i;
		}
		System.out.println(+sum2);
		System.out.println(+(sum2-sum1));
	}

}
