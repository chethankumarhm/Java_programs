package java_programs;

import java.util.Scanner;

public class rivision {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	System.out.println("enter the begining index");
	Integer a=sc.nextInt();
	System.out.println("enter the ending index");
	Integer b=sc.nextInt();
	String s1=s.substring(a, b);
	System.out.println(s1);
}
}
