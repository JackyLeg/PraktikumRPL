import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessingBiodata {
    JFrame FPFrame;
    JLabel labelNama, labelNIM, labelHobi;
    JTextField tfNama, tfNIM, tfHobi;
    JButton inputButton, deleteButton;
    Dimension d1, d2;

    FileProcessingBiodata(){
        FPFrame = new JFrame("File Processing");
        FPFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FPFrame.setSize(350, 300);
        FPFrame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        d1 = new Dimension(300,25);
        d2 = new Dimension(150,25);

        labelNama = new JLabel("Nama : ");
        tfNama = new JTextField();
        tfNama.setPreferredSize(d1);
        FPFrame.add(labelNama);
        FPFrame.add(tfNama);

        labelNIM = new JLabel("NIM : ");
        tfNIM = new JTextField();
        tfNIM.setPreferredSize(d1);
        FPFrame.add(labelNIM);
        FPFrame.add(tfNIM);

        labelHobi = new JLabel("Hobi : ");
        tfHobi = new JTextField();
        tfHobi.setPreferredSize(d1);
        FPFrame.add(labelHobi);
        FPFrame.add(tfHobi);

        inputButton = new JButton("Input Data");
        inputButton.setPreferredSize(d2);
        FPFrame.add(inputButton);
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    FileWriter wFile = new FileWriter("Biodata.txt");
                    wFile.write("Nama: " + tfNama.getText() +
                            "\nNIM: " + tfNIM.getText() +
                            "\nHobi: " + tfHobi.getText());
                    wFile.close();
                    JOptionPane.showMessageDialog(FPFrame, "Data berhasil diinput!");
                } catch (IOException e) {
                    System.out.println("Terjadi Kesalahan");
                    e.printStackTrace();
                }
            }
        });
        deleteButton = new JButton("Delete File");
        deleteButton.setPreferredSize(d2);
        FPFrame.add(deleteButton);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opsi = JOptionPane.showConfirmDialog(FPFrame,"Apakah kamu yakin?");
                if (opsi == JOptionPane.YES_OPTION) {
                    File dFile = new File("Biodata.txt");
                    if (dFile.delete()) {
                        JOptionPane.showMessageDialog(FPFrame,"File " + dFile.getName() + " berhasil dihapus!", "Sukses!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(FPFrame,"Gagal menghapus file!", "Gagal", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        FPFrame.setVisible(true);
    }
    public static void main (String [] args){
        new FileProcessingBiodata();
    }
}
