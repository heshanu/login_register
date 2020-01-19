import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connection {
    public static Connection getConnection() throws SQLException{
        Connection con=null;
      try {
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginyoutube?useSSL=false","root","root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,"error");
        }
        return con;
    }
}   
