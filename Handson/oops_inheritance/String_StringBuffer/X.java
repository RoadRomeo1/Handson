import java.util.Scanner;

public class X {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter any string.");
	String str1=sc.nextLine();
	
	if(str1.charAt(0)=='x'&&str1.charAt(str1.length()-1)=='x') {
		char arr[]=str1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!='x') {
				System.out.print(arr[i]);
			}
		}
	}
	else {
		System.out.println(str1);
	}
	
}
}
