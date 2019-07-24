import java.util.Scanner;

public class Middle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter any String.");
	String str=sc.nextLine();
	char arr1[]=str.toCharArray();
	char first=arr1[0];
	char last=arr1[arr1.length-1];
	char arr2[]=new char[arr1.length];
			
    for(int i=0;i<arr1.length;i++) {
		if(arr1[i]!=first&&arr1[i]!=last) {
			arr2[i]=arr1[i];
		}
	}
    
    for(int i=0;i<arr2.length;i++) {
    	System.out.print(arr2[i]);
    }
    
}

}
