package lendingManagementSystem;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class main1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        bank b = new bank();
        customer c = new customer();
        Loan l = new Loan();
        jdbc j = new jdbc();
        int i, s, mainid;
        int h,foo;
        String t;


        do {

            String date = new SimpleDateFormat("MMddmmssSS").format(new Date());
            String id1 = date;


            System.out.println(" ***************Welcome To our Lending Management System***************");
            System.out.println("Press ' 1 ' If You Are a Maker or Press ' 2 ' If You are Checker :   ");


            i = sc.nextInt();
            if (i == 1) {


                System.out.println("WELCOME");


                System.out.println("You chosed maker:");
                System.out.println("You Have The Following Options : ");
                System.out.println("1. Apply Loan");
                System.out.println("2. Track Loan Status");
                System.out.println("3. Get All Active Loans");
                System.out.println("4. Get Loan ID details");

                int z = sc.nextInt();
                switch (z) {
                    case 1:

                        System.out.println("***Applying For Loan***");
                        System.out.println("If You Are An NEW Customer Press '1' to register else if You are Registered Customer Press '2' to apply loan ");
                        int w = sc.nextInt();
                        if (w == 1) {


                            System.out.println("Your Customer ID Is : " + id1 + " Please Remember it for future use");
                            sc.nextLine();
                            c.setCustomerID(id1);

                            System.out.println("Enter The Customer Name: ");
                            c.setCustomerName(sc.nextLine());

                            System.out.println("Enter The Date Of Birth in YYYY-MM-DD format : ");
                            String date1 = sc.nextLine();
                            c.setDateOfBirth(date1);

                            System.out.println("Customer Contact Details :");
                            c.setContactNumber(sc.nextLine());

                            System.out.println("Customer Email Address : ");
                            c.setEmailAddress(sc.nextLine());

                            System.out.println("Customer Monthly Income : ");
                            c.setMonthlyIncome(sc.nextDouble());

                            sc.nextLine();
                            System.out.println("Customer Profession : ");
                            c.setProfession(sc.nextLine());

                            System.out.println("Customer Monthly Expenses : ");
                            c.setTotalMonthlyExpenses(sc.nextDouble());

                            sc.nextLine();
                            System.out.println("Customer Designation : ");
                            c.setDesignation(sc.nextLine());

                            System.out.println("Customer Company Name : ");
                            c.setCompanyName(sc.nextLine());
                            b.registerCustomer(c);
                            j.database(c);
                            System.out.println("********Congrats, You Have Successfully Registered As a Customer For Shubham Lending Management System********");
                        } else {
                            String x;                                                               //For Finding Customer Details
                            System.out.println("Enter Your Customer ID To Further  ");

                            x=sc.next();
                            trackid ti=new trackid();
                            ti.customerTracking(x);




                            System.out.println("Enter The Type Of Loan : HOME = 1 , AUTO = 2 , PERSONAL = 3 ");
                            s = sc.nextInt();
                            if (s == 1) {
                                System.out.println("You have selected for home loan");
                                HomeLoan hl = new HomeLoan();
                                Loan lo = new Loan();
                                hl.Home();
                                lo.calc();
                                System.out.println("*You Have Successfully Applied For Home Loan* Please Wait For Some To Know Your Status*");
                            } else if (s == 2) {
                                System.out.println("you have selected for auto loan");
                                vehicleloan vl = new vehicleloan();
                                vl.Vehicle();
                                Loan lo = new Loan();
                                lo.calc();
                                System.out.println("*You Have Successfully Applied For Auto Loan* Please Wait For Some To Know Your Status*");
                            } else if (s == 3) {
                                System.out.println("you have selected for personal loan");
                                personalloan pl = new personalloan();
                                pl.Personal();
                                Loan lo = new Loan();
                                lo.calc();
                                System.out.println("*You Have Successfully Applied For Personal Loan* Please Wait For Some To Know Your Status*");
                            }
                        }
                        break;

                    case 2:
                        System.out.println(" ***** You Have Entered For Tracking Of Loan Status ***** ");
                        System.out.println("Enter The Loan ID Which You Want to track : ");
                        String ab = sc.next();
                        if(ab.equals(id1) )
                            System.out.println();



                        break;
                    case 3:
                    System.out.println("You have Entered For Getting All Active Loans ");
                    break;

                    case 4:
                        System.out.println("You have entered for Getting Loan ID Details");
                        break;
                }
            } else if (i == 2) {
                System.out.println("****You Are Entering For Role Of Checker****");
                System.out.println("You Can Perform The Following Actions : 1. ApproveLoan 2.   ");


            } else {
                System.out.println("Wrong choice entered");
            }
            System.out.println("****Enter 3 to continue using the Lending Management System ELSE press any other key****");
            h = sc.nextInt();
            System.out.println("Again Select From The Top Selections: 1 or 2 ?");
        }



        while (h == 3);
        System.out.println("Press '3' To Go Back To Main Menu");
/*
        Scanner sc=new Scanner(System.in);
        String x;
        System.out.println("Enter Your Customer ID on which You Want To Find : ");

        x=sc.next();
        trackid ti=new trackid();
        ti.customerTracking(x);*/
    }
}








