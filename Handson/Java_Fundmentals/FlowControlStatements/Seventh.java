
public class Seventh {
public static void main(String[] args) {
	char a='A';
	char b='a';
	
	if(a>=65&&a<=90) {
		System.out.print(a+"->");
		String t=Character.toString(a);
		System.out.println(t.toLowerCase());
	}
	if(b>=97&&b<=122) {
	System.out.print(b+"->");
	String t=Character.toString(b);
	System.out.print(t.toUpperCase());
	}
	
} 
}
