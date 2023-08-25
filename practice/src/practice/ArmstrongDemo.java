package practice;

public class ArmstrongDemo {
public static void main(String[] args) {
	int n=153,rem,sum=0,temp;
	temp=n;
	while(n>0) {
		rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
	}
	if(temp==sum) {
		System.out.println("Arm");
	}else {
		System.out.println("Not Arm");
	}
}
}
