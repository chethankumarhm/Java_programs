package java_programs;

public class Insert_number_into_specific_place {
public static void main(String[] args) {
 int arr[]= {1,2,3,5};
 int n=arr.length;
 int index=3;
 
 int newarr[]=new int[n+1];
 int j=0;
 for(int i=0;i<newarr.length;i++) {
	 if(i==index) {
		 newarr[i]=4;
	 }
	 else {
		 newarr[i]=arr[j];
		 j++;
	 }
 }
 for(int i=0;i<newarr.length;i++) {
	 System.out.print(newarr[i]+" ");
 }
}
}
