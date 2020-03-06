package lendingManagementSystem;
import java.sql.*;
class jdbc {

    public void database(customer c) {

            try {

                System.out.println("Hello There!!!!");

                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection com = DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl", "sh", "sh");
                PreparedStatement stmt = com.prepareStatement("insert into CustomerDetails1998 values(?,?,?,?,?,?,?,?,?,?)");
                //obj.customermain();
                //System.out.println(obj);
                stmt.setString(1, c.getCustomerID());
                stmt.setString(2, c.getCustomerName());
                stmt.setString(3, c.getDateOfBirth());
                stmt.setString(4, c.getContactNumber());
                stmt.setString(5, c.getEmailAddress());
                stmt.setDouble(6, c.getMonthlyIncome());
                stmt.setString(7, c.getProfession());
                stmt.setDouble(8, c.getTotalMonthlyExpenses());
                stmt.setString(9, c.getDesignation());
                stmt.setString(10, c.getCompanyName());
                System.out.println("**");
                stmt.executeQuery();
                com.commit();
                com.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }





