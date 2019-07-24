
public class MathOperation {
public static void main(String[] args) throws ArithmeticException,NumberFormatException,Exception{
	int arr[]=new int[] {1,2,3,4,5};
	int sum=0,avg=0;
	
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	
	System.out.println("Sum is: "+sum);
	System.out.println("Average is: "+(sum/arr.length));
	
}
}
