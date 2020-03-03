package diary.farming.management.system;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * @author murungi
 */
public class DBConnect {
    
    
    public DBConnect(){
            }
     public Connection myConnect(){
      Connection connect = null;
    
    try {
                    Class.forName("com.mysql.jdbc.Driver");

                    connect = DriverManager.getConnection(""
                            + "jdbc:mysql://localhost/animal_farm_db"
                            + "?user=root&password=");
    
                    } catch (ClassNotFoundException | SQLException e) {
                         // TODO Auto-generated catch block
                         System.out.println("Cannot connect to animal farm db "+e.getMessage());
                }
            return connect;
                
     }
     
     public static void main(String []args){
         DBConnect test=new DBConnect();
         test.myConnect();
     }
     
     

     

}