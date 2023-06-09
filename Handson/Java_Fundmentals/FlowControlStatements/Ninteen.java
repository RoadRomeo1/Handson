
public class Ninteen {
public static void main(String[] args) {
	int count=0;
    int arr[]=new int[5];
	int in=0;
	
	for(int i=1;count!=5;i++) {
		if((i%2==0)&&(i%3==0)&&(i%5==0)) {
			arr[in]=i;
			in++;
			count++;
		}
	}
	
	System.out.println("Value is: ");
	for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	}
}
}
