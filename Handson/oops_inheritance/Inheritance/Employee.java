
public class Employee extends Person{
   private double AnnualSalary;
   private int YearOfStart;
   private int NationalInsuranceNumber;
   
   public double getAnnualSalary() {
	return AnnualSalary;
  }

public void setAnnualSalary(double annualSalary) {
	AnnualSalary = annualSalary;
   }
   public int getYearOfStart() {
	return YearOfStart;
   }
   public void setYearOfStart(int yearOfStart) {
	YearOfStart = yearOfStart;
   }
   public int getNationalInsuranceNumber() {
	return NationalInsuranceNumber;
   }
   public void setNationalInsuranceNumber(int nationalInsuranceNumber) {
	NationalInsuranceNumber = nationalInsuranceNumber;
   }
   
   public Employee() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Employee(String name, double annualSalary, int yearOfStart, int nationalInsuranceNumber) {
	super(name);
	AnnualSalary = annualSalary;
	YearOfStart = yearOfStart;
	NationalInsuranceNumber = nationalInsuranceNumber;
	}
   
   
}
