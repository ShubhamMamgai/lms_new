package lendingManagementSystem;

import java.sql.*;

public class trackid
{
    public void customerTracking(String cusId) throws ClassNotFoundException, SQLException {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection com = DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl", "sh", "sh");
        PreparedStatement stmt = com.prepareStatement("select * from customerdetails1998 where customerid=?");
        stmt.setString(1,cusId);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            System.out.println("***************************************************");
            System.out.println("The Customer ID is : "+rs.getString(1));
            System.out.println("The Customer Name is :"+rs.getString(2));
            System.out.println("The Customer Date Of Birth is: "+rs.getString(3));
            System.out.println("The Customer Contact Number is : "+rs.getString(4));
            System.out.println("The Customer EMAIL Address is :"+rs.getString(5));
            System.out.println("The Customer Monthly Income is :"+rs.getString(6));
            System.out.println("The Customer Profession is :"+rs.getString(7));
            System.out.println("The Customer Total Monthly Expenses is: "+rs.getString(8));
            System.out.println("The Customer Designation is: "+rs.getString(9));
            System.out.println("The Customer Comapny is :" +rs.getString(10));
        }
        com.commit();
        com.close();



    }
}
