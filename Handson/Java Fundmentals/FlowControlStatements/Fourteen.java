import java.util.Scanner;

public class Fourteen {
public static void main(String[] args) {

	System.out.println("Please enter some integer.");
	int m=0,flag=0;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	m=n/2;
	
	if(n==1||n==0) {
		System.out.println(n+" is not prime number");
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
