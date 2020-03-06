package lendingManagementSystem;

import java.util.Scanner;

public class personalloan extends Loan {
    public double salary;

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String qualification;
    public int workExperience;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }



    public void Personal() {
        Scanner sc = new Scanner(System.in);
        personalloan p = new personalloan();

        System.out.println("Enter The Salary : ");
        p.setSalary(sc.nextInt());

        System.out.println("Enter The Qualification : ");
        p.setQualification(sc.next());

        System.out.println("Enter The Work Experience : ");
        p.setWorkExperience(sc.nextInt());


    }
}
