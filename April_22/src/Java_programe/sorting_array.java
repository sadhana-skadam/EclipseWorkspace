package Java_programe;

import java.util.Arrays;
import java.util.Collections;

public class sorting_array {

	

	public static void main(String[] args) {
		/*int a[]= {20,67,80,78,10};
		System.out.println("before sorting array"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After sorting array"+Arrays.toString(a));*/
		
		//Method second
		/*int a[]= {20,67,80,78,10};
		System.out.println("before sorting array"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting array"+Arrays.toString(a));*/
		
		//revesre array in descending order
		Integer a1[]= {20,30,45,79};
		System.out.println("After sorting array"+Arrays.toString(a1));

		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println("After sorting array"+Arrays.toString(a1));

		

	}

}
