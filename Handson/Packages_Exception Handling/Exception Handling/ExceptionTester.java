import java.util.Scanner;

public class ExceptionTester {
public static void main(String[] args) {
	System.out.println("Enter any number...");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	if(!(num<=18&&num>=60)) {
		try {
			throw new No_Exception();
		} catch (No_Exception e) {
		}
		System.out.println("Program exited properly...");
	}
}
}
