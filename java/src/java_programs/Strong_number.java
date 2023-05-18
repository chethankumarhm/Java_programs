package java_programs;

public class Strong_number {
public static void main(String[] args) {
	int num=145;
	int tempno=num;
	int sum=0;
	while(num!=0) {
		int product=1;
		int rem=num%10;
		for(int i=rem;i>=1;i--) {
			product=product*i;
		}
		sum=sum+product;
		num=num/10;
	}
	if(sum==tempno) {
		System.out.println(tempno+" it is strong no");
	}
	else {
		System.out.println(sum);
		System.out.println(tempno+" it is not a strong no");
	}
}
}
