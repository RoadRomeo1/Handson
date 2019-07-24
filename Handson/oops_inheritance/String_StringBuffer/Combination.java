import java.util.Scanner;

public class Combination {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter two strigs.");
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	char arr1[]=str1.toCharArray();
	char arr2[]=str2.toCharArray();
	int len=arr1.length+arr2.length;
	
	for(int i=0;i<len-2;i++) {
		if(arr1.length>i&&arr2.length>i)
		System.out.print(arr1[i]);
		System.out.print(arr2[i]);
	}
	
	
}
}
