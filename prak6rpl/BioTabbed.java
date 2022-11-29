import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BioTabbed {
    JFrame frameKu;
    JPanel panelBiodata, panelList;
    JLabel labelNama, labelNIM, labelHobi;
    JTextField tfNama, tfNIM, tfHobi;
    JButton inputButton;
    Dimension d1, d2;
    JTable tabelBiodata;
    JTabbedPane tp;
    JScrollPane sp;

    BioTabbed(){
        //Frame
        frameKu = new JFrame("Biodata - I Made Novandy Asardi");
        frameKu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameKu.setSize(350,300);
        //frameKu.setLayout(new FlowLayout(FlowLayout.LEFT, 10,10));

        //Scrollbar
        sp = new JScrollPane(panelList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        //Panel
        panelBiodata = new JPanel();
        panelBiodata.setLayout(new FlowLayout(FlowLayout.LEFT, 10,10));
        panelList = new JPanel();
        panelList.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        panelList.add(sp);
        frameKu.add(panelBiodata);
        frameKu.add(panelList);

        //Contents
        d1 = new Dimension(300,25);
        //d2 = new Dimension(150,25);

        labelNama = new JLabel("Nama : ");
        tfNama = new JTextField();
        tfNama.setPreferredSize(d1);
        panelBiodata.add(labelNama);
        panelBiodata.add(tfNama);

        labelNIM = new JLabel("NIM : ");
        tfNIM = new JTextField();
        tfNIM.setPreferredSize(d1);
        panelBiodata.add(labelNIM);
        panelBiodata.add(tfNIM);

        labelHobi = new JLabel("Hobi : ");
        tfHobi = new JTextField();
        tfHobi.setPreferredSize(d1);
        panelBiodata.add(labelHobi);
        panelBiodata.add(tfHobi);

        inputButton = new JButton("Input Data");
        inputButton.setPreferredSize(d1);
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String [] atribut = {"Nama", "NIM", "Hobi"};
                String [][] data = {
                        {tfNama.getText(), tfNIM.getText(), tfHobi.getText()}
                };
                tabelBiodata = new JTable(data, atribut);

                JOptionPane.showMessageDialog(panelBiodata, "Data berhasil dimasukkan ke dalam tabel!");
            }
        });
        //panelList.add(tabelBiodata); //error disini
        panelBiodata.add(inputButton);


        //TabbedPane
        tp = new JTabbedPane(JTabbedPane.TOP);
        tp.addTab("Biodata", panelBiodata);
        tp.addTab("List", panelList);
        frameKu.add(tp);

        frameKu.setVisible(true);
    }

    public static void main (String [] args){
        new BioTabbed();
    }
}
