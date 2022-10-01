package Java_programe;

public class min_max_value {

	public static void main(String[] args) {
		/*int a[]= {20,40,59,66,57};
		int max=a[0];      //20
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max valu in array"+max);*/
		
		int a[]= {10,20,30,40,59};
		int min=a[0];//10
		for (int i=1;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println("min valie in array"+min);

	}
		

}
