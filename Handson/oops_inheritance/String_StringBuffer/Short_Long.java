import java.util.Scanner;

public class Short_Long {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter any two string.");
	String str1=sc.nextLine();
	String str2=sc.nextLine();
    int len1=str1.length();
	int len2=str2.length();
	
	if(len1>len2) {
		System.out.println(str2+str1+str2);
	}
	else if(len2>len1) {
		System.out.println(str1+str2+str1);
		}
	
}
}
