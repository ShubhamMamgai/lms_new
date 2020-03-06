package lendingManagementSystem;

public interface maker
{
    public int applyLoan(int customerid, double loanAmount, double roi, String typeofLoan, int repaymentFrequency);
    public String trackLoanStatus(int id);
    public void getAllActiveLoans();
    public void getLoanIdDetails(int i);
}
