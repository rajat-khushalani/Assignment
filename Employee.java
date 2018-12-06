package model;

import java.util.ArrayList;
import java.util.Objects;

public class Employee {
    private static int count = 0;
    private int emp_id;

    public void setEmp_id(int emp_id) {
        //emp_id++;
        this.emp_id = emp_id;
    }

    private String Name;
    private int Age;
    private String Designation;
    public ArrayList<EmploymentHistory> empHistory;
    public ArrayList<EducationalDetails> eduDetails;

    public Employee(String Name, int Age, String Designation, ArrayList<EmploymentHistory> empHistory, ArrayList<EducationalDetails> eduDetails) {
        this.Name = Name;
        this.Age = Age;
        this.Designation = Designation;
        this.empHistory=empHistory;
        this.eduDetails=eduDetails;
        setEmp_id(++count);
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public long getAge() {
        return Age;
    }
    public void  setAge(int Age) {
        this.Age = Age;
    }
    public String getdesignation() {
        return Designation;
    }
    public void  setdesignation(String Designation) {
        this.Designation = Designation;
    }

    public ArrayList<EmploymentHistory> getEmpHistory() {
        return empHistory;
    }

    public void setEmpHistory(ArrayList<EmploymentHistory> empHistory) {
        this.empHistory = empHistory;
    }

    public ArrayList<EducationalDetails> getEduDetails() {
        return eduDetails;
    }

    public void setEduDetails(ArrayList<EducationalDetails> eduDetails) {
        this.eduDetails = eduDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return emp_id == employee.emp_id &&
                Age == employee.Age &&
                Objects.equals(Name, employee.Name) &&
                Objects.equals(Designation, employee.Designation) &&
                Objects.equals(empHistory, employee.empHistory) &&
                Objects.equals(eduDetails, employee.eduDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_id, Name, Age, Designation, empHistory, eduDetails);
    }

    @Override
    public String toString() {
        return "model.Employee{" +
                "emp_id=" + emp_id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Designation='" + Designation + '\'' +
                ", empHistory=" + empHistory +
                ", eduDetails=" + eduDetails +
                '}';
    }




}


