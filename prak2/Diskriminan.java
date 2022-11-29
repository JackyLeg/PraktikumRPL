import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Determinan {
    JFrame DetFrame;
    JLabel labelA, labelB, labelC, labelD;
    JTextField tfA, tfB, tfC;
    JButton buttonD;
    Dimension dim;

    Determinan() {
        DetFrame = new JFrame("Diskriminan (I Made Novandy Asardi)");
        DetFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DetFrame.setSize(300,300);
        DetFrame.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));

        dim = new Dimension(200,50);

        labelA = new JLabel("A = ");
        tfA = new JTextField();
        tfA.setPreferredSize(dim);
        DetFrame.add(labelA);
        DetFrame.add(tfA);
        

        labelB = new JLabel("B = ");
        tfB = new JTextField();
        tfB.setPreferredSize(dim);
        DetFrame.add(labelB);
        DetFrame.add(tfB);

        labelC = new JLabel("C = ");
        tfC = new JTextField();
        tfC.setPreferredSize(dim);
        DetFrame.add(labelC);
        DetFrame.add(tfC);

        labelD = new JLabel("D? ");
        buttonD = new JButton("Hitung");
        buttonD.setPreferredSize(dim);
        DetFrame.add(buttonD);
        DetFrame.add(labelD);

        buttonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c, d;
                a = Integer.parseInt(tfA.getText());
                b = Integer.parseInt(tfB.getText());
                c = Integer.parseInt(tfC.getText());
                d = (b * b) - (4 * a * c);
                labelD.setText(String.valueOf(d));
            }
        });

        DetFrame.setResizable(false);
        DetFrame.setVisible(true);

    }
    public static void main (String [] args) {
        new Determinan();
    }
}
