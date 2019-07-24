import java.util.InputMismatchException;
import java.util.Scanner;

public class First {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number.");
		int num=sc.nextInt();
		
	}catch (InputMismatchException e) {
	System.out.println("Entered input is not a valid format for an integer.");
	}
}
}
