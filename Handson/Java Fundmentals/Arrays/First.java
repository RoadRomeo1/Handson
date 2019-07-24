
public class First {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,5};
	int sum=0,average=0;
	
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	
	System.out.println("Sum of array is: "+sum);
	System.out.println("Average of array is: "+sum/arr.length);
	
}
}
