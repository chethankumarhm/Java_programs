package java_programs;

public class Add_the_numbers_in_string {
public static void main(String[] args) {
	String s="ELF39";
	char c[]=s.toCharArray();
	int sum=0;
	for(int i=0;i<c.length;i++) {
		if(c[i]>='0' && c[i]<='9') {
			sum=sum+Integer.parseInt(c[i]+"");
		}
	}
	System.out.println(sum);
}
}
