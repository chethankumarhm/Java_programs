package java_programs;

public class remove_duplicate_character_in_a_String {
public static void main(String[] args) {
	String s="cchheetthhaann";
	char c[]=s.toCharArray();
	String result="";
	for(int i=0;i<c.length;i++) {
		if(result.indexOf(c[i])==-1) {
			result=result+c[i];
		}
	}
	System.out.print(result);
}
}
