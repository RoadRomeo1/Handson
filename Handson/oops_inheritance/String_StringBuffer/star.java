import java.util.Scanner;

public class star {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter any string.");
	String str=sc.nextLine();
	char arr[]=str.toCharArray();
    int count=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]=='*') {
			count++;
		}
	}
	
	if(count>0) {
		System.out.print(arr[0]);
		System.out.print(arr[arr.length-1]);
	}
		
	
	
}
}
     