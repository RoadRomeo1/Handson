import java.util.Arrays;
import java.util.Scanner;

public class Fourth {
public static void main(String[] args) {
	
	System.out.println("Enter two alphabets seperated with space.");
	Scanner sc=new Scanner(System.in);
	
	String str=sc.nextLine();
	
	char arr[]=str.toCharArray();
	
	Arrays.sort(arr);
	
	
	System.out.println("Sorted Alphabets is: ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		System.out.print(" ");
	}
	
	
}
}
