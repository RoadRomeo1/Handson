import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifth extends Exception{
public static void main(String[] args) throws NumberFormatException,InputMismatchException, Fifth{
	int arr1[]=new int[3];
	int arr2[]=new int[3];
	int sum1=0,sum2=0,avg1=0,avr2=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter tne name of the first student");
	String name1=sc.nextLine();
    
	System.out.println("Enter marks for first student.");
	for(int i=0;i<arr1.length;i++) {
		int tmp=sc.nextInt();
		if(tmp>0&&(tmp>=0&&tmp<=100)) {
			arr1[i]=tmp;
		}
		else {
			throw new Fifth();
			}
	}
	
	System.out.println("Enter tne name of the second student");
	String name2=sc.nextLine();
	
	System.out.println("Enter marks for second student.");
	for(int i=0;i<arr1.length;i++) {
			int tmp=sc.nextInt();
			if(tmp>0&&(tmp>=0&&tmp<=100)) {
				arr2[i]=tmp;
			}
			else {
				throw new Fifth();
				}}
	
	for(int i=0;i<arr1.length;i++) {
		sum1=sum1+arr1[i];
		sum2=sum2+arr2[i];
	}
	
	System.out.println("Sum of the First studnet marks is "+sum1);
    System.out.println("Sum of the Second studnet marks is "+sum2);
	System.out.println("Average of the students marks is "+((sum1+sum2)/2));
	
}


public void myException() {
	System.out.println("My Exception is thrown...");
}

public String toString() {
	return "MyException object: Exception Occured...";
	
}

}