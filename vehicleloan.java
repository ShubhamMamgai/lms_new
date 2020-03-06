package lendingManagementSystem;

import java.util.Scanner;

public class vehicleloan extends Loan
{
    public String vehicleCategory;
    public String vehicleModelCategory;
    public String manufacturer;
    public int yearOfManufacturer;
    public double assestValue;

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehicleModelCategory() {
        return vehicleModelCategory;
    }

    public void setVehicleModelCategory(String vehicleModelCategory) {
        this.vehicleModelCategory = vehicleModelCategory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public double getAssestValue() {
        return assestValue;
    }

    public void setAssestValue(double assestValue) {
        this.assestValue = assestValue;
    }

    public void Vehicle(){
        Scanner sc = new Scanner(System.in);
        vehicleloan v = new vehicleloan();
        System.out.println("Enter The Vehicle Category :");
        v.setVehicleCategory(sc.next());
        v.getVehicleCategory();

        System.out.println("Enter The Vehcile Model Category : ");
        v.setVehicleModelCategory(sc.next());
        v.getVehicleModelCategory();

        System.out.println("Enter The Manufacturer : ");
        v.setManufacturer(sc.next());
        v.getManufacturer();

        System.out.println("Enter The Year Of Manufacturer :");
        v.setYearOfManufacturer(sc.nextInt());
        v.getYearOfManufacturer();

        System.out.println("Enter The Assest Value :");
        v.setAssestValue(sc.nextDouble());
        v.getAssestValue();


    }


}
