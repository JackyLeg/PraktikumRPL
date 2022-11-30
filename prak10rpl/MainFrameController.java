import com.usakti.customer.CustomerView;
import com.usakti.jenisbarang.JenisBarangView;
import com.usakti.satuan.SatuanView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

public class MainFrameController {
    private Statement statement;

    public MainFrameController(Statement statement) {
        setStatement(statement);
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void setController(Object obj, String objectName, JPanel panel){
        if(objectName.equals("btnCustomer")) {
            JButton btn = (JButton) obj;
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CustomerView customerView = new CustomerView(getStatement(), panel);
                }
            });
        }
        else if(objectName.equals("btnJenisBarang")) {
            JButton btn = (JButton) obj;
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JenisBarangView jenisBarangView = new JenisBarangView(getStatement(), panel);
                }
            });
        }
        else if(objectName.equals("btnSatuan")) {
            JButton btn = (JButton) obj;
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SatuanView satuanView = new SatuanView(getStatement(), panel);
                }
            });
        }
        else {}
    }
}
