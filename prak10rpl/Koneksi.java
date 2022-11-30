import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {
    Connection conn;
    private Statement statement;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Connection openConnection() throws SQLException{

        try{
            System.out.println("Establishing Connection");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prakrpl10?useUnicode=true&use" +
                    "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            setStatement(conn.createStatement());
            System.out.println("Koneksi berhasil");

            return conn;
        }
        catch(SQLException se){
            System.out.println("Open Connection > Perintah SQL salah");
        }
        catch(Exception ex){
            System.out.println("Open Connection > Driver tidak terhubung");
        }

        return null;
    }

    public void closeConnection() throws SQLException{
        try{
            System.out.println("Closing Connection");
            conn.close();
        }
        catch(SQLException se){
            System.out.println("Close Connection > Perintah SQL salah");
        }
        catch(Exception ex){
            System.out.println("Close Connection > Driver tidak terhubung");
        }
    }
}
