
public class Fifteen {
public static void main(String[] args) {
	int num=5679;
     int tmp=0;
	
	for(int i=0;num!=0;i++) {
		tmp=tmp+num%10;
		num=num/10;
	}
	
	System.out.println(tmp);
	
}
}
