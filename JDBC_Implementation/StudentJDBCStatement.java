import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentJDBCStatement {

		   static Connection connection= null;
	       static String databaseName= "";
	       static String username= "root";
	       static String Password= "Password@swagata";
	       static String url= "jdbc:mysql://localhost:3306/Studentdb";
	       
	       public static void main(String[] args) {

	    	   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
	    	   } catch(ClassNotFoundException e)
	           {
	               e.printStackTrace();
	           } 
	    	   
	    	   try(Connection con = DriverManager.getConnection(url,username,Password);)
	           {
	    		   Statement st = con.createStatement();
	               
	              
	               ResultSet rs = st.executeQuery("Select StudentId,Name from Student");
	   
	               while(rs.next())
	               {

	                   int id = rs.getInt(1);
	                   
	                   String name = rs.getString(2);
	         	                   
	                   System.out.println("The Student Id is "+id+" and the name is "+name);
	               }
	               
	               rs.close();
	               st.close();

	           
	           }
	           catch(SQLException e)
	           {
	               e.printStackTrace();
	           
	           }
	    	  


	}

}
