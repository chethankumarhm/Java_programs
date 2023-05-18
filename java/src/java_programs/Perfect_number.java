package java_programs;

import java.util.Scanner;

public class Perfect_number {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the values");
int num=sc.nextInt();
int sum=0;
for(int i=1;i<num;i++) {
	if(num%i==0) {
		sum=sum+i;
	}
}
if(num==sum) {
	System.out.println("it is perfect no :- "+num);
}
else {
	System.out.println("it is non-perfect no :-"+num);
}
}
}
