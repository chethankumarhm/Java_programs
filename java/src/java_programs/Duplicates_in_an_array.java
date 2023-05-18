package java_programs;

public class Duplicates_in_an_array {
	public static void main(String[] args) {
 int arr[]= {1,1,2,2,3,3,4,4};
 int k=0;
 for(int i=0;i<arr.length-1;i++) {
	 if(arr[i] != arr[i+1]) {
		 arr[k]=arr[i];
		 k++;
	 }
 }
 arr[k]=arr[arr.length-1];
 for(int i=0;i<=k;i++) {
	 System.out.print(arr[i]+" ");
 }
}
}

