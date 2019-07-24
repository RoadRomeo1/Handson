import java.util.Scanner;

public class number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String...");
	String str=sc.nextLine();
	int count=sc.nextInt();
	char arr[]=str.toCharArray();
	char arr1[]=new char[count];
	
	for(int i=arr.length;i>=count;i--) {
		arr1[i]=arr[i];
	}
	
	for(int i=count;i>=count;i--) {
		for(int k=arr1.length-1;k>0;k--) {
			System.out.print(arr1[k]);
			}
		}
	
}
}
