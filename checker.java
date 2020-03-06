package lendingManagementSystem;

public interface checker
{
    public void approveRejection(int loanApplicationID);
    public void getAllActiveLoans();
    public void getLoanDetails(int i);
    public void removeLoanAccount(int i);
}
