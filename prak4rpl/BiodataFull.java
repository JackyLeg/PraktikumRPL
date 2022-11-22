import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataFull {
    private JFrame BiodataFrame;
    private JLabel labelNama, labelHobi, labelAlamat, labelJK, labelKetSkill, labelSkill;
    private JTextField tfNama;
    private JComboBox comboHobi;
    private JTextArea taAlamat;
    private JRadioButton rbMale, rbFemale;
    private ButtonGroup jk;
    private JCheckBox cbPython, cbJava;
    private JButton printButton;

    public static void main(String[] args) {
        new BiodataFull();
    }
    BiodataFull() {
        //frame
        BiodataFrame = new JFrame("Biodata (I Made Novandy Asardi)");
        BiodataFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BiodataFrame.setSize(400, 350);
        BiodataFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        //nama
        labelNama = new JLabel("Nama :");
        tfNama = new JTextField();
        tfNama.setPreferredSize(new Dimension(300, 25));
        BiodataFrame.add(labelNama);
        BiodataFrame.add(tfNama);

        //hobi
        labelHobi = new JLabel("Hobi :");
        String[] hobi = {"(Pilih)", "Berpuisi", "Bernyanyi", "Bermain Game", "Ngoding", "Olahraga"};
        comboHobi = new JComboBox(hobi);
        comboHobi.setPreferredSize(new Dimension(300, 25));
        BiodataFrame.add(labelHobi);
        BiodataFrame.add(comboHobi);

        //alamat
        labelAlamat = new JLabel("Alamat :");
        taAlamat = new JTextArea();
        taAlamat.setPreferredSize(new Dimension(300, 70));
        BiodataFrame.add(labelAlamat);
        BiodataFrame.add(taAlamat);

        //jenis kelamin
        labelJK = new JLabel("Jenis Kelamin :");
        rbMale = new JRadioButton("Laki-laki");
        rbMale.setActionCommand(rbMale.getText());
        rbFemale = new JRadioButton("Perempuan");
        rbFemale.setActionCommand(rbFemale.getText());
        jk = new ButtonGroup();
        jk.add(rbMale);
        jk.add(rbFemale);
        BiodataFrame.add(labelJK);
        BiodataFrame.add(rbMale);
        BiodataFrame.add(rbFemale);

        //skill
        labelKetSkill = new JLabel("Skill apa yang kamu miliki?");
        cbPython = new JCheckBox("Python");
        cbJava = new JCheckBox("Java");
        BiodataFrame.add(labelKetSkill);
        BiodataFrame.add(cbPython);
        BiodataFrame.add(cbJava);
        labelSkill = new JLabel();

        //print
        printButton = new JButton("Print");
        printButton.setPreferredSize(new Dimension(200, 25));
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbPython.isSelected() && cbJava.isSelected()) {
                    labelSkill.setText("Skill yang saya miliki adalah Python dan Java");
                } else if (cbPython.isSelected()) {
                    labelSkill.setText("Skill yang saya miliki adalah Python");
                } else if (cbJava.isSelected()) {
                    labelSkill.setText("Skill yang saya miliki adalah Java");
                } else {
                    labelSkill.setText("Saya belum memiliki skill.");
                }
                JOptionPane.showMessageDialog(BiodataFrame,
                        "BIODATA" +
                                "\nNama saya " + tfNama.getText() +
                                "\nHobi saya adalah " + comboHobi.getSelectedItem() +
                                "\nSaya tinggal di " + taAlamat.getText() +
                                "\nJenis Kelamin saya adalah " + jk.getSelection().getActionCommand() +
                                "\n" + labelSkill.getText());
            }
        });
        BiodataFrame.add(printButton);

        tfNama.setFocusable(true);
        BiodataFrame.setVisible(true);
    }
}
