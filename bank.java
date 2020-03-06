package lendingManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class bank implements maker,checker {
     ArrayList<Loan> loan = new ArrayList<>();
     static int number = 0;

     private HashMap<String, customer> hm = new HashMap<>();


    public boolean registerCustomer(customer c) {
        customer put = hm.put(c.getCustomerID(), c);
        return true;
    }




    @Override
    public void approveRejection(int loanApplicationID) {
        SecuredLoan sl = new SecuredLoan();

        for (int i = 0; i < loan.size(); i++) {
            if (loan.get(i).getLoanID() == i) {
                if (loan.get(i).getLoanType().equalsIgnoreCase("HOMELOAN")) {
                    HomeLoan hm = (HomeLoan) loan.get(i);
                    if (sl.get10() > 0.80) {
                        loan.get(i).setS(Loan.loanStatus.rejected);
                    } else {
                        try {
                            loan.get(i).setS(Loan.loanStatus.approved);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else if (loan.get(i).getLoanType().equalsIgnoreCase("VEHICLELOAN")) {
                    vehicleloan v = (vehicleloan) loan.get(i);
                    if (sl.get10() > 0.8) {
                        loan.get(i).setS(Loan.loanStatus.rejected);
                    } else {
                        try {
                            loan.get(i).setS(Loan.loanStatus.approved);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                    else if (loan.get(i).getLoanType().equalsIgnoreCase("PERSONALLOAN")) {
                    personalloan pl = (personalloan) loan.get(i);
                    if ((pl.getSalary() > 500000) && (pl.getWorkExperience() > 5)) {
                        loan.get(i).setS(Loan.loanStatus.approved);
                    } else {
                        loan.get(i).setS(Loan.loanStatus.rejected);
                    }
                }
                System.out.println(loan.get(number));
                System.out.println(loan.get(i).getS().toString());

            }

        }
    }




    @Override
    public void getLoanDetails(int id) {
        for (int i = 0; i < loan.size(); i++){
            if(loan.get(i).getLoanID() == id  ){
                System.out.println(loan.get(i).toString()+ ""+loan.get(i).getS());
            }
        }

    }

    @Override
    public void removeLoanAccount(int i) {

    }


    @Override
    public int applyLoan(int customerid, double loanAmount, double roi, String typeofLoan, int repaymentFrequency) {
        Loan lo = new Loan();
        lo.calc();
        return 0;
    }

    @Override
    public String trackLoanStatus(int id) {
        for (int i = 0 ; i < id; i++){
            if(loan.get(i).getLoanID() == id)
                return loan.get(i).getS().toString();
        }
        return "null";
    }

    @Override
    public void getAllActiveLoans() {

    }


    @Override
    public void getLoanIdDetails(int id) {
        for (int i = 0; i< loan.size(); i++ ){
            if (loan.get(i).getLoanID() == id){
                System.out.println(loan.get(i).toString()+ " "+loan.get(i).getS() );
            }
        }


    }
}


