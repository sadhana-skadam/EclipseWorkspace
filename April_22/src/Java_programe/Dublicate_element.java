package Java_programe;

public class Dublicate_element {

	public static void main(String[] args) {
		String arr[]= {"java","python","c++","c++"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println("duplicate element founmd="+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("duplicate Element not found");
		}
		

	}

}
