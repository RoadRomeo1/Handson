package junit.first;

public class Calculator {
public int addition(int x,int y) {
	return x+y;
}
public int substraction(int x,int y) {
	return x-y;
}

public static void main(String[] args) {
	Calculator c=new Calculator();
	System.out.println(c.addition(2, 3));
	System.out.println(c.substraction(100, 80));			
}

}
