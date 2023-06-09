import java.util.Scanner;

public class Seventeen {
public static void main(String[] args) {
	int n,reverse=0;
	int copy=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter interger");
	n=sc.nextInt();
	copy=n;
	
	while(n!=0) {
		reverse=reverse*10;
		reverse=reverse+n%10;
	    n=n/10;
	}
	System.out.println("Reverse of the "+copy+" is: "+reverse);
	
}
}
