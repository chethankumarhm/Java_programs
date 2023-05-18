package java_programs;

public class prime_number {
public static void main(String[] args) {
	for(int a=10;a<=20;a++) {
		int num=a;
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(num+" it is prime");
		}
	}
}
}
