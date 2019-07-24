import java.util.Scanner;

public class Concate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any two string.");
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	char arr1[]=str1.toCharArray();
	char arr2[]=str2.toCharArray();
	
	if(str1.charAt(str1.length()-1)==str2.charAt(0)) {
	
		for(int i=0;i<arr1.length-1;i++) {
		System.out.print(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]);
		}
	}
	else {
		System.out.println(str1+" "+str2);
	}
	
	
	
}
}
