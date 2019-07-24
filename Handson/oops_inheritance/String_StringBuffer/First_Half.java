import java.util.Scanner;

public class First_Half {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter any one string.");
	String str=sc.nextLine();
	int len=str.length();
	
	if(len%2==0) {
		int in=len/2;
		char arr[]=str.toCharArray();
		for(int i=0;i<in;i++) {
			System.out.print(arr[i]);
		}
	}
	else if(len%2==1) {
		System.out.println("null");
	}
}
}
