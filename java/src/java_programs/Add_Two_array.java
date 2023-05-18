package java_programs;

import java.util.Scanner;

public class Add_Two_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//fetching a[] size
	System.out.println("enter the size");
	int size=sc.nextInt();
	int a[]=new int[size];
	
	//fetching a[] values
	System.out.println("enter the values");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	//Direct b[] values
	int b[]= {1,2,3,4,5};
	int c[]=new int[b.length];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			c[i]=a[i]+b[i];
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(c[i]+" ");
	}
}
}
