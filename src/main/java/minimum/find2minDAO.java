package minimum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class find2minDAO {
	
	public String updateAndFetch(int min2,String a)
	{
		String his="";
        his=his+"<br>";
        String g1,g2;
       
        try{  
        	Class.forName("com.mysql.jdbc.Driver");  
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findmin","root","root");  
        	Statement stmt=con.createStatement();  
        	stmt.executeUpdate("insert into store values(\""+a+"\",\""+Integer.toString(min2)+"\")");  
        	ResultSet rs=stmt.executeQuery("select * from store");  
        	while(rs.next())  
        	{
        		g1=rs.getString(1);
        		g2=rs.getString(2);
        		his=his+g1+":"+g2+"<br>";
        		System.out.println(g1+"  "+g2);
        	}
        	con.close();  
        	
        	
        	}
        catch(Exception e)
        { 
        	System.out.println(e);
        }  
		return his;
	}

}
