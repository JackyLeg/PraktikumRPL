package prakRPL;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connect extends Biodata {
    public static void getKoneksi(String nama, String nim, String hobi) {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prak7made_rpl", "root", "");
            System.out.println("Successfully connected");

            Statement myStmt = myConn.createStatement();
            myStmt.executeUpdate("INSERT INTO biodata (nama, nim, hobi) VALUES ('" + nama + "','" + nim + "','" + hobi + "')");

            JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan ke tabel biodata!");
            myConn.close();
        } catch (SQLException e) {
            return;
        }
    }
    public static void hapusData(String hobi) {
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prak7made_rpl", "root", "");
            System.out.println("Successfully connected");

            Statement stmtKu = myConn.createStatement();
            stmtKu.executeUpdate("DELETE FROM biodata WHERE hobi = '" + hobi + "';");

            JOptionPane.showMessageDialog(null, "Data dengan hobi " + hobi + " telah dihapus dari tabel biodata!");
            myConn.close();
        } catch (SQLException e) {
            return;
        }
    }
}