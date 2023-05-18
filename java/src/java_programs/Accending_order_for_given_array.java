package java_programs;

public class Accending_order_for_given_array {
public static void main(String[] args) {
	int arr[] = {20,60,40,10,30,70,50};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("largest = "+arr[arr.length-1]);
	System.out.println("smallest = "+arr[0]);
}
}
