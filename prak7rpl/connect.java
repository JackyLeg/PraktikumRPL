package prak7rpl;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connect extends Biodata {
    public static void getKoneksi(String txt1, String txt2, String txt3) {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prak7made_rpl", "root", "");
            System.out.println("Successfully connected");

            Statement myStmt = myConn.createStatement();
            myStmt.executeUpdate("INSERT INTO biodata (nama, nim, hobi) VALUES ('" + txt1 + "','" + txt2 + "','" + txt3 + "')");

            JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan ke tabel prak7rpl.Biodata!");
            myConn.close();
        } catch (SQLException e) {
            return;
        }
    }
}
