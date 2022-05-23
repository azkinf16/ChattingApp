package chatting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection conn;
    Statement stm;
    
    public void init(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatting", "root", "");
            stm = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed ! "+e.getMessage());
        }
    }
}
