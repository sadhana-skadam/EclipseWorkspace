package Java_programe;

public class Reverse_number2 {

	public static void main(String[] args) {
		String str="ABCGD";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			System.out.println(rev);
		}
		
}
}
