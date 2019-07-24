package main_package;
import test_package.Foundation;


public class main_class {
public static void main(String[] args) {
	Foundation f=new Foundation();
    System.out.println("public variable: "+f.var4);
    System.out.println("Private variable is not allowed.");
    System.out.println("Protected Variable is nt allowed: ");
    System.out.println("Default Varialbe i not allowed: ");

}
}
