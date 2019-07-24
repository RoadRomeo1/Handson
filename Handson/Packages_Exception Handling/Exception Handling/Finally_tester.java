import java.util.Scanner;

public class Finally_tester {
public static void main(String[] args) {
	int n1,n2;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter any two numbers...");
    n1=sc.nextInt();
    n2=sc.nextInt();	
   
    try {
    	System.out.println("The quotient is "+(n1/n2));
    }catch (ArithmeticException e) {
	System.out.println("DivideByZeroException is caught.");
    }
    finally {
		System.out.println("Inside Finally block.");
	}
}
}
