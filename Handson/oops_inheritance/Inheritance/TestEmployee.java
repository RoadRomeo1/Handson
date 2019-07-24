
public class TestEmployee {
public static void main(String[] args) {
	
	Employee e=new Employee("himanshu vyas", 350000, 2019, 1234);
/*	e.setName("Himanshu vyas");
	e.setYearOfStart(2019);
	e.setAnnualSalary(350000);
    e.setNationalInsuranceNumber(1234);
*/    System.out.println("Name: "+e.getName());
    System.out.println("Salary: "+e.getAnnualSalary());
    System.out.println("Year of Starting: "+e.getYearOfStart());
    System.out.println("National Insurance Number: "+e.getNationalInsuranceNumber());
    
    
}
}
