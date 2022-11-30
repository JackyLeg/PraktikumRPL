import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

public class MainPraktikum10 {
    static Koneksi koneksi;

    MainPraktikum10(){
        koneksi = new Koneksi();
    }

    public static void main(String [] args) throws SQLException{
        MainPraktikum10 mainApp = new MainPraktikum10();

        koneksi.openConnection();

        MainFrame mainFrame = new MainFrame(koneksi.getStatement());
        mainFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}

            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    koneksi.closeConnection();
                }
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    koneksi.closeConnection();
                }
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void windowIconified(WindowEvent e) {}

            @Override
            public void windowDeiconified(WindowEvent e) {}

            @Override
            public void windowActivated(WindowEvent e) {}

            @Override
            public void windowDeactivated(WindowEvent e) {}
        });
    }
}