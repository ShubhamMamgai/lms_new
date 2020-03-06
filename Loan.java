package lendingManagementSystem;


import java.time.LocalDate;
import java.util.Scanner;
import java.lang.*;



public class Loan {


    enum loanStatus {approved,pending,rejected}
    loanStatus s;

    public loanStatus getS() {
        return s;
    }

    public void setS(loanStatus s) {
        this.s = s;
    }

    public static int loanID = 1;
    public static int CustomerID = 1;
    private String loanType;
    private double loanAmount;
    private int tenure;
    private double roi;
    private double emiPerMonth;
    private LocalDate loanDisbursalDate;
    private double maxEligibleLoanAmount;
    private int repaymentFrequency;

    private double installment;
    private double noOfPayment;
    private double installmentNo;
    private double openingBalance;
    private double interestComponent;
    private double principalcomponent = 0.0;

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
        loanID++;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
        CustomerID++;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getEmiPerMonth() {
        return emiPerMonth;
    }

    public void setEmiPerMonth(double emiPerMonth) {
        this.emiPerMonth = emiPerMonth;
    }

    public LocalDate getLoanDisbursalDate() {
        return loanDisbursalDate;
    }

    public void setLoanDisbursalDate(LocalDate loanDisbursalDate) {
        this.loanDisbursalDate = loanDisbursalDate;
    }

    public double getMaxEligibleLoanAmount() {
        return maxEligibleLoanAmount;
    }

    public void setMaxEligibleLoanAmount(double maxEligibleLoanAmount) {
        this.maxEligibleLoanAmount = maxEligibleLoanAmount;
    }

    public int getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(int repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    public double getInstallment() {
        return installment;
    }

    public void setInstallment(double installment) {
        this.installment = installment;
    }

    public double getNoOfPayment() {
        return noOfPayment;
    }

    public void setNoOfPayment(double noOfPayment) {
        this.noOfPayment = noOfPayment;
    }

    public double getInstallmentNo() {
        return installmentNo;
    }

    public void setInstallmentNo(double installmentNo) {
        this.installmentNo = installmentNo;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public double getInterestComponent() {
        return interestComponent;
    }

    public void setInterestComponent(double interestComponent) {
        this.interestComponent = interestComponent;
    }

    public double getPrincipalcomponent() {
        return principalcomponent;
    }

    public void setPrincipalcomponent(double principalcomponent) {
        this.principalcomponent = principalcomponent;
    }

    public void RepaymentPlan() {
        double finalroi = roi * 0.01;
        double roiandnoofpayment = finalroi / noOfPayment;
        double n = tenure * noOfPayment;
        double power = Math.pow((1 + roiandnoofpayment), n);
        installment = openingBalance * (finalroi / noOfPayment) / (1 - 1 / power);

        System.out.println("Total Installment Amount" + installment);

        for (int i = 1; i <= n; i++) {
            openingBalance = openingBalance - principalcomponent;
            interestComponent = openingBalance * (finalroi / 12);
            principalcomponent = installment - interestComponent;
            System.out.println("Installment No:" + "  " + i + "  " + "Opening Balance:" + "  " + openingBalance + "  " + "Principal Component:" + "  " + principalcomponent + "  " + "InterestComponent:" + "  " + interestComponent + "  " + "Installment:" + "  " + installment);
        }
    }
    //EmiSchedule
    public double calemi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Loan Amount on which EMI will be calculated  :  ");
        double ei = sc.nextDouble();
        System.out.println("Enter The Rate Of Interest : ");
        double ri = sc.nextDouble();
        System.out.println("Enter The Number of Installments IN MONTHS :");
        double ni = sc.nextDouble();
        double emi1 = (ei * (ri/1200) *( Math.pow((1 + (ri/1200)), ni)));
        double emi2 = (Math.pow((1 +(ri/1200)), ni) - 1);
        double emi3 = (emi1 / emi2);
        return emi3;
    }

    public double latepenalty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Outstanding Amount : ");
        double oi = sc.nextDouble();
        System.out.println("Enter the Monthly Percentage : ");
        double mp = sc.nextDouble();
        System.out.println("Enter The Number Of Days : ");
        double nd = sc.nextDouble();

        double pen = ((oi * (mp/1200) * 12) * (nd/365));
        return pen;

    }

    public double income()

    {
        Scanner input = new Scanner(System.in);
        System.out.println("Income Details..");
        double income1 = input.nextDouble();
        return income1;

    }

    public double Dbr_Percentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("***Now Calculating Your DBR*** ");
        System.out.println("Enter Your Expenses : ");
        double a = sc.nextDouble();

        System.out.println("Enter Your Monthly Income : ");
        double b = sc.nextDouble();

        double Debt_to_Burden = a/b;
        return Debt_to_Burden;

    }


    public double calemi2() {
        double a = income();
        double emi1m = (a - (0.2 * a) * 0.5);
        System.out.println("The value of EMI is: " + emi1m);
        return emi1m;
    }

    //Main Method

    public void calc() {
        Scanner sc = new Scanner(System.in);

        Loan r = new Loan();

        System.out.println("Enter Loan Amount:");
        r.setOpeningBalance(sc.nextDouble());
        System.out.println("Enter Rate Of Interest");
        r.setRoi(sc.nextDouble());
        System.out.println("Enter No. of Payment in year:");
        r.setNoOfPayment(sc.nextDouble());
        System.out.println("Enter Tenure of Loan:");
        r.setTenure(sc.nextInt());
        r.RepaymentPlan();
        System.out.println("EMI is : " +r.calemi());  //WILL CALCULATE EMI HERE
        System.out.println("Your Late Penalty Fees is :" + r.latepenalty());
        System.out.println("tenure period in YEARS :");
        double t = sc.nextDouble();
        System.out.println(" your roi :");
        double R = sc.nextDouble();
        R = R / 1200;
        t = t * 12;
        double mla = (r.calemi2() * (Math.pow((1 + R), t) - 1)) / (R * Math.pow((1 + R), t));
        System.out.println("your maximum loan amount " + mla);

        System.out.println("Your Debt To Burden Ratio is : "+Dbr_Percentage());


    }

}