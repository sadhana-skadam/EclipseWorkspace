package Java_programe;

import java.util.Arrays;

public class Sortig_array {

	public static void main(String[] args) {
	int a[]= {2,3,4,8,1};
	int n=a.length;
	for(int i=0;i<a.length;i++) 
	{
		for(int j=0;j<a.length;j++) 
		{
			if( a[j] >a[j+1]) 
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		
		}
	}
	System.out.println(Arrays.toString(a));
			

}
}
