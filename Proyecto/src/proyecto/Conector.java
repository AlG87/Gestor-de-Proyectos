package proyecto;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conector {
    
    public static String URL = "jdbc:mysql://localhost:3306/proyectoGestor?serverTimezone=UTC";
    public static String USER = "root";
    public static String PWRD = "AlejoDev87";
    
    public Conector(){}
    
    public static Connection getConection(){
            
        Connection con =null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(URL,USER,PWRD);
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        return con;
        
    }
    
    public static void main(String[]args){
      try{ 
        Connection c;
        c = getConection();
        
            
          PreparedStatement ps;
          ResultSet rs;
          ps = c.prepareStatement("Select * from usuario");
          

          rs = ps.executeQuery();
          if(rs.next()){
              JOptionPane.showMessageDialog(null, rs.getString("nombre"));
          }else{
          
              JOptionPane.showMessageDialog(null, "No existen datos");
          }
          c.close();
      }catch(HeadlessException | SQLException i){
      
          System.out.println(i);
      }
    }
    
}
