package java_programs;

import java.util.ArrayList;

public class Array_To_Arraylist {
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	
	ArrayList list=new ArrayList();
	for(Integer a:arr) {
		list.add(a);
	}
	System.out.println(list);
}
}
