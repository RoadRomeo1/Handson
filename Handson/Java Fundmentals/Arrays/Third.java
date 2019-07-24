import java.util.Scanner;

public class Third {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter the element you are searching for.");
	int element=sc.nextInt();
    int arr[]=new int[] {1,4,34,56,7};
	int i,label=0;
    
    for(i=0;i<arr.length;i++) {
    	if(arr[i]==element) {
    		System.out.println(i);
    		label++;
    		break;
    	}
    }
    if(label==0) {
    	System.out.println("-1");
    }
    
}
}
