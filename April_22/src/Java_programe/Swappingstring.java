package Java_programe;

public class Swappingstring {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		System.out.println("String before swapping:");
		System.out.println("a  "+a);
		System.out.println("b "+b);
		
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping nuber:");
		System.out.println("a  "+a);
		System.out.println("b  "+b);
				
	}

}
