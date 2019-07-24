
public class Twelve {
public static void main(String[] args) {
	int m=0,flag=0;
	int n=0;
	m=n/2;
	
	if(n==1||n==0) {
		System.out.println("Not Prime Number");
	}
	else {
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n+" is not prime number");
			    flag++;
			    break;
			}
		}
		if(flag==0) {
			System.out.println(n+" is prime number");
		}
	}
} 
}
