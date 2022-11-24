import javax.swing.*;
import java.awt.*;

public class Belajar {
    JFrame BelajarFrame;
    JLabel labelA, labelB, labelC, labelD;
    JTextField tfA, tfB, tfC;
    JButton buttonD;
    GridBagConstraints gbc;

    Belajar() {
        BelajarFrame = new JFrame("Determinan (I Made Novandy Asardi)");
        BelajarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BelajarFrame.setSize(350,300);
        BelajarFrame.setLayout(new GridBagLayout());

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        labelA = new JLabel("A = ");
        BelajarFrame.add(labelA, gbc);

        labelB = new JLabel("B = ");
        BelajarFrame.add(labelB, gbc);

        labelC = new JLabel("C = ");
        BelajarFrame.add(labelC, gbc);

        labelD = new JLabel("D = ");
        BelajarFrame.add(labelD, gbc);


        BelajarFrame.setVisible(true);

    }
    public static void main (String [] args) {
        new Belajar();
    }
}
