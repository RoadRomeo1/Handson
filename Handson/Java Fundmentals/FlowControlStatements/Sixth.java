
public class Sixth {
public static void main(String[] args) {
	
	System.out.println("Please enter Gender and age seperated bt space.");

	String gender=args[0];
    String ageStr=args[1];
	
	
	
	int age=Integer.parseInt(ageStr);
	
	if((gender.equals("Female"))&&(age>=1&&age<=58)) {
		System.out.println("Interest is 8.2%");
	}
	else if((gender.equals("Female"))&&(age>=59&&age<=100)) {
		System.out.println("Interest is 9.2%");
	}
	else if((gender.equals("Male"))&&(age>=1&&age<=58)) {
		System.out.println("Interest is 8.4%");
			}
	else if((gender.equals("Male"))&&(age>=59&&age<=100)) {
		System.out.println("Interes	t is 10.5%");
		}
	
}
}
