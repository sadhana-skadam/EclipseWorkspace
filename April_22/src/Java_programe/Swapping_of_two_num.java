package Java_programe;

public class Swapping_of_two_num {

	public static void main(String[] args) {
		String a="Hello";
		String b="world";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(""+a+"  "+b);
	}

}
