import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;


public class Biodata extends JFrame implements ActionListener {
    JPanel biodataPanel;
    JTextField tfNama; //tf = textfield
    JTextArea tArea; //t = text
    JRadioButton lakiLakiRadioButton;
    JRadioButton perempuanRadioButton;
    JCheckBox pythonCheckBox;
    JCheckBox javaCheckBox;
    JButton printButton;
    JComboBox comboHobi;
    JLabel l1, l2, l3, l4, l5, hasilPrint; //l = label
    ButtonGroup gender;

    Biodata() {
        JFrame frame = new JFrame("Biodata (I Made Novandy Asardi - 064002100030)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800,500);
        frame.setLayout(null);
        frame.setVisible(true);
        String hobi[]={"(Pilih)", "Coding", "Memasak", "Membaca", "Menonton", "Belajar"};

        l1 = new JLabel("Nama: "); l1.setBounds(20,50,150,20);
        l2 = new JLabel("Hobi: "); l2.setBounds(20,100,150,20);
        l3 = new JLabel("Alamat: "); l3.setBounds(20,150,150,20);
        l4 = new JLabel("Jenis Kelamin: "); l4.setBounds(20,270,150,20);
        l5 = new JLabel("Skill apa yang kamu miliki?"); l5.setBounds(20,330,300,20);
        frame.add(l1); frame.add(l2); frame.add(l3); frame.add(l4); frame.add(l5);

        tfNama = new JTextField(""); tfNama.setBounds(60,50,150,20);
        comboHobi = new JComboBox(hobi);/*mengambil dari var array hobi*/comboHobi.setBounds(60,100,150,20);
        tArea = new JTextArea(""); tArea.setBounds(80,150,200,100);
        frame.add(tfNama); frame.add(comboHobi); frame.add(tArea);

        lakiLakiRadioButton = new JRadioButton("Laki-laki"); lakiLakiRadioButton.setBounds(20,300,82,20);
        lakiLakiRadioButton.setActionCommand("Laki-laki");
        perempuanRadioButton = new JRadioButton("Perempuan"); perempuanRadioButton.setBounds(100,300,150,20);
        perempuanRadioButton.setActionCommand("Perempuan");
        frame.add(lakiLakiRadioButton); frame.add(perempuanRadioButton);

        pythonCheckBox = new JCheckBox("Python"); pythonCheckBox.setBounds(20,350,100,20);
        javaCheckBox = new JCheckBox("Java"); javaCheckBox.setBounds(120,350,150,20);
        frame.add(pythonCheckBox); frame.add(javaCheckBox);

        printButton = new JButton("Print"); printButton.setBounds(60,380,150,20);
        hasilPrint = new JLabel(""); hasilPrint.setBounds(20,390,500,300);
        frame.add(printButton); frame.add(hasilPrint);

        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama, hobi, alamat, jk, output;
                nama = tfNama.getText();
                hobi = comboHobi.getSelectedItem().toString();
                alamat = tArea.getText();
                gender = new ButtonGroup(); //agar radio button berfungsi
                gender.add(lakiLakiRadioButton);
                gender.add(perempuanRadioButton);
                jk = getSelectedButtonText(gender);
                output = "Nama saya " + nama + " dan hobi saya adalah " + hobi +
                        ". \nSaya tinggal di " + alamat
                        + ". Saya " + jk + ".";
                hasilPrint.setText(String.valueOf(output));
            }
        });   
    }
    public void actionPerformed(ActionEvent e) {
        String s1 = tfNama.getText();
        String s2 = tArea.getText();
    }
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    public static void main(String[] args){
        new Biodata();
    }
}