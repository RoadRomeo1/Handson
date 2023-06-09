import java.util.Scanner;

public class Fifth {
public static void main(String[] args) {
	char var;

	System.out.println("Enter one Character and then press Enter Key.");
	Scanner sc=new Scanner(System.in);
	var=sc.next().charAt(0);
	
	if((var>=65&&var<=90)||(var>=97&&var<=122)) {
		System.out.println("Alphabet.");
	}
	
	else if (var>=48 && var<=57) {
		System.out.println("Digit.");
	}
	
	else {
		System.out.println("Special Character.");
	}
	
}
}
