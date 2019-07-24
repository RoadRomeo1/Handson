import java.util.Scanner;

public class Eigth {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("print the number of elements.");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int sum[]=new int[arr.length];
	int res=0;
	
	System.out.println("Please enter "+n+" digits.");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==6) {
			for(int j=i;arr[j]!=7;j++) {
				sum[i]=arr[j];
			}
		}
	}
	
	for(int i=0;i<arr.length;i++) {
	for(int j=0;j<sum.length;j++){
		if(arr[i]!=sum[j]) {
			res=res+arr[i];
		}
	}
	}
	
	for(int i=0;i<sum.length;i++) {
		System.out.println(sum[i]);
	}
	System.out.println("Result: "+res);
	
}
}
