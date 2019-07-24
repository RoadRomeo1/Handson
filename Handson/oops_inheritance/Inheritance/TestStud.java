
public class TestStud {
public static void main(String[] args) {
	SchoolPerson scp=new SchoolPerson();
	Teacher t=new Teacher();
	Student s=new Student();
	CollegeStudent cs=new CollegeStudent();
    
	cs.setName("Himanshu vyas");
	cs.setDateOfBirth("03/10/1999");
	cs.setStud_id(101);
	cs.setCollege_name("LNCTS");
	cs.setCurrentYear(4);
	t.setName("Mahima Pandey");
	t.setDateOfBirth("02/10/1990");
	t.setSalary(20000);
    t.setSubject("Physics"); 
    
    System.out.println("Student Name: "+cs.getName()); 
    System.out.println("Student DOB: "+cs.getDateOfBirth()); 
    System.out.println("Student Id: "+cs.getStud_id()); 
    System.out.println("Student College Name: "+cs.getCollege_name()); 
    System.out.println("Student Current Year: "+cs.getCurrentYear()); 
    System.out.println("Teacher Name: "+t.getName()); 
    System.out.println("Teacher Salary: "+t.getSalary()); 
    System.out.println("Teacher's Subject: "+t.getSubject()); 
    System.out.println("Teacher's Date of Birth: "+t.getDateOfBirth()); 
    
}
}
