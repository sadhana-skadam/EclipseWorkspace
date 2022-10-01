package Java_programe;

public class Reverse_each_word {

	public static void main(String[] args) {
		String sr="welcome to java";
		String[] words=sr.split(" ");
		String reverseString="";
		for(String w:words)//welcome
		{
			String reversewords="";
					for(int i=w.length()-1;i>=0;i--) //welcome
					{
						reversewords=reversewords+w.charAt(i);
					}
					reverseString=reverseString+reversewords+"";//emoclew
		}   
		System.out.println(reverseString);
			
	}

}
