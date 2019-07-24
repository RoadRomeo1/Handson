import java.util.Scanner;

public class UserRegistration {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your name and country...");
	String name=sc.nextLine();
	String country=sc.nextLine();
	registerUser(name, country);
	}

public static void registerUser(String name,String country){
	if(!(country.toLowerCase().equals("india"))) {
		try {
			throw new InvalidCountryException();
		} catch (InvalidCountryException e) {
		}
	}
	else {
		System.out.println("User Successfully registered...");
	}
}

}
