package lendingManagementSystem;

import java.util.Date;

public class emi
{
    private double emiAmount;
    private Date emiDueDate;
    private String status;
    private double principalComponent;
    private double interestAmount;
    private double penaltyCharges;

    public double getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(double emiAmount) {
        this.emiAmount = emiAmount;
    }

    public Date getEmiDueDate() {
        return emiDueDate;
    }

    public void setEmiDueDate(Date emiDueDate) {
        this.emiDueDate = emiDueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrincipalComponent() {
        return principalComponent;
    }

    public void setPrincipalComponent(double principalComponent) {
        this.principalComponent = principalComponent;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public double getPenaltyCharges() {
        return penaltyCharges;
    }

    public void setPenaltyCharges(double penaltyCharges) {
        this.penaltyCharges = penaltyCharges;
    }






}
