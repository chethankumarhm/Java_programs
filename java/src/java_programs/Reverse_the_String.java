package java_programs;

public class Reverse_the_String {
public static void main(String[] args) {
	String s = "Chethan";
	char c[]=s.toCharArray();
	String result="";
	for(int i=c.length-1;i>=0;i--) {
		result=result+c[i];
	}
	System.out.println(result);
}
}
