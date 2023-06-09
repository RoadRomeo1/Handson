package Handson.Method_Reference;

import java.util.List;

public class Emp {
    
    private String name;
    private double salary;
    private List<String> speciality;

    

    public Emp() {
    }

    public Emp(String name, double salary, List<String> speciality) {
        this.name = name;
        this.salary = salary;
        this.speciality = speciality;
    }

    public Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(List<String> speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Emp [name=" + name + ", salary=" + salary + ", speciality=" + speciality + "]";
    }   
}
