import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter "+n+" Elements");
	int index;
	try {	
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("enter index of the array element you want to access.");
	index=sc.nextInt();

		System.out.println("The array element at index "+index+"= "+arr[index]);
	}catch (ArrayIndexOutOfBoundsException e) {

		System.out.println(e.getClass());
	}catch (InputMismatchException e) {
	System.out.println(e.getClass());
	}

}
}
