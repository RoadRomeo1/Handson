package junit.first;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {


	@Test
	public void testFindName() {
		Employee e=new Employee();
		String a="a";
		String b="b";
		String c="c";
		String name="a";
		System.out.println("Inside testFindName method...");
		ArrayList employees=new ArrayList();
		employees.add(a);
		employees.add(b);
		employees.add(c);
		
		assertEquals("Found",e.findName(employees, name));
	}

}
