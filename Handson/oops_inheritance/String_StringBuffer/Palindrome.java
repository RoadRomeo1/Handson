import java.util.Scanner;

public class Palindrome {
    
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any String");
       String str1=sc.nextLine();
       str1=str1.toLowerCase();
       StringBuffer strb1=new StringBuffer(str1);
       strb1=strb1.reverse();
       String str2=strb1.toString();
		
       if(str1.equals(str2)) {
    	   System.out.println("Palindrome.");
       }
       else {
    	   System.out.println("Not Palindrome.");
       }
       
	} 
	
}
