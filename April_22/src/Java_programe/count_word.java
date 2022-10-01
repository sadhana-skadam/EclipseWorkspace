package Java_programe;

public class count_word {

	public static void main(String[] args) {
		String s="sadhana kadam";
		String a[]=s.split("s+");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println(a.length);
	}

}
