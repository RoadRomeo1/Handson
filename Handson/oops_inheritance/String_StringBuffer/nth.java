import java.util.Scanner;

public class nth {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string.");
	String str=sc.nextLine();
    char strarr[]=str.toCharArray();
	char arr[]=new char[2];
	
	arr[0]=strarr[0];
	arr[1]=strarr[1];
	
	
	for(int i=0;i<str.length();i++) {
		System.out.print(arr[0]);
		System.out.print(arr[1]);
	}
}
}
