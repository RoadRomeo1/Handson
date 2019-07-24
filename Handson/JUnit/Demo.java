package junit.first;

public class Demo {
public static void main(String[] args) {
	String str1="a";
	String str2="b";
	Demo demo=new Demo();
	System.out.println(demo.stringConcat(str1, str2));
}

public String stringConcat(String str1,String str2) {
	
	String res=str1+str2;
	return res;
}
}
