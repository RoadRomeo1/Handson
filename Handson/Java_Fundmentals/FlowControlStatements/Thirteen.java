
public class Thirteen {
public static void main(String[] args) {
	
	String primeNumbers="";
	
	for(int i=10;i<=99;i++) {
		int counter=0;
		for(int num=i;num>=1;num--) {
	        if(i%num==0) {
	        	counter=counter+1;
	        }
		}
		if(counter==2) {
			primeNumbers=primeNumbers + i + " ";
		}
	}
	
	System.out.println("Prime numbers from 10 to 99 are: ");
	System.out.println(primeNumbers);

	}
}

