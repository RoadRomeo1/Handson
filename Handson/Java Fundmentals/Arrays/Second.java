
public class Second {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,5};
	int max=arr[0];
	int min=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	
	System.out.println("Maximum number is: "+max);
	System.out.println("Minimum number is: "+min);
	
}

}
