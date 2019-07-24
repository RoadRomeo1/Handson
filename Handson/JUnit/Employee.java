package junit.first;

import java.util.ArrayList;

public class Employee {
public static void main(String[] args) {
	Employee e=new Employee();
	String a="a";
	String b="b";
	String c="c";
	String name="a";
	
	ArrayList employees=new ArrayList();
	employees.add(a);
	employees.add(b);
	employees.add(c);
	
	
   System.out.println(e.findName(employees, name));
}

public String findName(ArrayList employees,String name) {
   String res="";
   if(employees.contains(name)) {
	   res="Found";
   }
   else {
	   res="Not Found.";
   }
   return res;
}
}
