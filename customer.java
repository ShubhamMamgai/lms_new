package lendingManagementSystem;

import java.util.Scanner;

public class customer {
   // private static int ApplicationId = 0;
    private String  customerID;
    private String customerName;
    private String dateOfBirth;
    private String contactNumber;
    private String emailAddress;
    private Double monthlyIncome;
    private String profession;
    private Double totalMonthlyExpenses;
    private String designation;
    private String companyName;
/*

public customer() {
    this.customerID = ApplicationId+1;
}*/




public String getDateOfBirth() {
    return dateOfBirth;
}

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Double getTotalMonthlyExpenses() {
        return totalMonthlyExpenses;
    }

    public void setTotalMonthlyExpenses(Double totalMonthlyExpenses) {
        this.totalMonthlyExpenses = totalMonthlyExpenses;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double DBR(double expenses, double mi) {
        return (expenses / mi) * 100;
    }

    public double MLA(double income) {
        return (income - 0.2 * income) * 0.5;
    }

    public void customermain() {
        customer C = new customer();
        bank b = new bank();

        Scanner sc = new Scanner(System.in);

        System.out.println("***************Welcome To Shubham Lending Management System***************");
        System.out.println("Press ' 1 ' If You Are a Maker or Press ' 2 ' If You are Checker :   ");

        int i;
        int h;
        do {
            i = sc.nextInt();
            switch (i) {
                case 1:


                 /*   System.out.println("Customer ID : ");
                    setCustomerID(sc.nextInt());*/


                    System.out.println("Enter The Customer Name: ");
                    setCustomerName(sc.next());

                    sc.nextLine();
                    System.out.println("Enter The Date Of Birth in YYYY-MM-DD format : ");
                    String date = sc.nextLine();
                    setDateOfBirth(date);
                    //LocalDate ld = LocalDate.parse(date);
                    // System.out.println(ld);

                    System.out.println("Customer Contact Details :");
                    setContactNumber(sc.next());

                    //C.setEmailAddress("shubhammamgai.12@gmail.com");
                    System.out.println("Customer Email Address : ");
                    setEmailAddress(sc.next());

                    System.out.println("Customer Monthly Income : ");
                    setMonthlyIncome(sc.nextDouble());

                    System.out.println("Customer Profession : ");
                    setProfession(sc.next());

                    System.out.println("Customer Monthly Expenses : ");
                    setTotalMonthlyExpenses(sc.nextDouble());

                    System.out.println("Customer Designation : ");
                    setDesignation(sc.next());

                    System.out.println("Customer Company Name : ");
                    setCompanyName(sc.next());
                    b.registerCustomer(C);
                    System.out.println("********Congrats, You Have Successfully Registered As a Customer For Shubham Lending Management System********");


                case 2:
                    Loan lo = new Loan();
                    lo.calc();
                    break;
                default:
                    System.out.println("You Have Entered Wrong Details Please Select From The Above Correct Options");
            }


            System.out.println("****Enter 3 to continue using the Lending Management System ELSE press any other key****");
            h = sc.nextInt();
            System.out.println("Again Select From The Top Selections: 1 or 2 ?");
        } while (h == 3);
    }

 @Override
    public String toString() {
        return "customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", profession='" + profession + '\'' +
                ", totalMonthlyExpenses=" + totalMonthlyExpenses +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public void dbr () {
            customer w = new customer();
            double d = w.DBR(w.getTotalMonthlyExpenses(), w.getMonthlyIncome());
            System.out.println("DBR IS : " + d);
            double emi = w.MLA(w.getMonthlyIncome());
            System.out.println("EMI is" + emi);
        }


}


