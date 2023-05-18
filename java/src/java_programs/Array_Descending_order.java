package java_programs;

import java.util.Scanner;

public class Array_Descending_order {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	System.out.println("Enter the values");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
	}
}
}
