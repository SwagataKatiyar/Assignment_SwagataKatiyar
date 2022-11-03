import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentJdbcPreparedStatement {

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
     	   PreparedStatement st =   con.prepareStatement("Select * from Student");
     	       	   
     
     	   ResultSet rs = st.executeQuery();
           
     	       	  
                    while(rs.next())
             {
        
                 int id = rs.getInt(1);
                 
                 String name = rs.getString(2);
      
                 
                 System.out.println("The student Id is "+id+" and the name is "+name);
             }
             
                                    
                              
             
     	   con.close();
        
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        
      }
  }
}