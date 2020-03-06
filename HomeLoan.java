package lendingManagementSystem;

import java.util.Scanner;

public class HomeLoan extends Loan {

    public String builderName;
    public double propertySize;
    public double propertyValue;


    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public double getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(double propertySize) {
        this.propertySize = propertySize;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }


    public void Home() {


        Scanner sc = new Scanner(System.in);
        HomeLoan H = new HomeLoan();


        System.out.println("Enter The Property Size: ");
        H.setPropertySize(sc.nextDouble());
        H.getPropertySize();


        System.out.println("Enter The Builder Name: ");
        H.setBuilderName(sc.next());
        H.getBuilderName();


        System.out.println("Enter The Property Value : ");
        H.setPropertyValue(sc.nextDouble());
        H.getPropertyValue();
    }
}


