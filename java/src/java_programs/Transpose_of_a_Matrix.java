package java_programs;

import java.util.Scanner;

public class Transpose_of_a_Matrix {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int size = sc.nextInt();
	int size1 = sc.nextInt();
	
	int arr[][]=new int[size][size1];
	int arr1[][]=new int[size][size1];
	System.out.println("enter the values");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
		arr[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr1[i][j]=arr[j][i]);
			}
		System.out.println();
		}
	}
}



