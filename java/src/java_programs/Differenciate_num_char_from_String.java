package java_programs;

public class Differenciate_num_char_from_String {
public static void main(String[] args) {
	String s="EL3F9";
	char c[]=s.toCharArray();
	String Characters="";
	String numbers="";
	for(int i=0;i<c.length;i++) {
		if(c[i]>='0' && c[i]<='9') {
			Characters=Characters+c[i]; 
		}
		else {
			numbers=numbers+c[i];
		}
	}
	System.out.println(Characters);
	System.out.println(numbers);
}
}
