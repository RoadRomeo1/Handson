import java.util.Scanner;

public class Sixteen {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter length.");
	int len=sc.nextInt();
	
	for(int i=0;i<len;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
            System.out.print(" ");
		}
		System.out.println("");
	}
	
}
}
