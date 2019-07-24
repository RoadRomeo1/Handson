package junit.first;

public class Demo2 {

	public boolean palindromeCheck(String str){
	   StringBuilder strb=new StringBuilder(str.toLowerCase());
	   boolean status=false;
	   strb=strb.reverse();
       String str2=strb.toString();  	   
	   
       if(str2.equals(str.toLowerCase())) {
		   status=true;
	   }else {
		   status=false;
	   }
	   
	   return status;
     }
	
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		System.out.println(d.palindromeCheck("madam"));
	}
}
