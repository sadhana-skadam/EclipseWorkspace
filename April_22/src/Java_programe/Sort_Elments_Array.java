package Java_programe;

public class Sort_Elments_Array {

	public static void main(String[] args) {
		int a[]= {4,3,5,7};
		int n=a.length;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}

}
