import java.util.Scanner;

public class Ninth {
public static void main(String[] args) {
	int arr[][]=new int[2][2];

	System.out.println("Please Enter numbers.");
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
        String str=args[i];
        arr[i][j]=Integer.parseInt(str);
		}
	}
	
	for(int i=1;i>=0;i--) {
		for(int j=1;j>=0;j--) {
          System.out.print(arr[i][j]+" "); 
		}
		System.out.println(" ");
	}	
}
}
