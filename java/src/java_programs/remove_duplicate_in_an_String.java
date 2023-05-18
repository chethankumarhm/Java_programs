package java_programs;

public class remove_duplicate_in_an_String {
public static void main(String[] args) {
	String s="Chethan Chethan Kumar Kumar HM HM";
	String s1[]=s.split(" ");
	String result="";
	for(int i=0;i<s1.length;i++) {
		if(!result.contains(s1[i])) {
			result=result+s1[i]+" ";
		}
	}
	System.out.print(result);
}
}
