package java_programs;

public class Character_uppercase {
public static void main(String[] args) {
	String s="Chethan";
	char c[]=s.toCharArray();
	String result = "";
	for(int i=0;i<c.length;i++) {
		if(c[i]>='a' && c[i]<='z') { 
			result=result + Character.toUpperCase(c[i]);
		}
		else {
			result=result+c[i];
		}
	}
	System.out.println(result);
}
}
