
public class Seventh {
public static void main(String[] args) {
	int arr[]=new int[] {12,12,34,34,67,89};
    int t=0;
    int count=0,in=0;
    
    for(int i=0;i<arr.length;i++) {
    	t=arr[i];
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[j]==t) {
    			arr[j]=0;
    		}
    				
    	}
    }
		System.out.println("Duplicate element removed.");
		  
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]!=0) {
    	System.out.print(arr[i]+" ");
    	}
    }
	
}
}
