package bankingsystem;

import java.sql.*;

public class DBConnect {
    
    Connection con = null;
    Statement st = null;
    PreparedStatement ps = null;
    
    public Connection getConnection()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys?&useSSL=false", "root", "nishant1025");
        } catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Unable to connect : "+e);
        }
    return con;
    }
    
    public Statement getStatement()
    {
        try
        {
            st = getConnection().createStatement();
        } catch(Exception e)
        {
            System.out.println("Unable to connect : "+e);
        }
    return st;
    }
    
}
