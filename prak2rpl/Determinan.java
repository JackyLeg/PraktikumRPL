import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Diskriminan {
    JFrame DisFrame;
    JLabel labelA, labelB, labelC, labelD;
    JTextField tfA, tfB, tfC;
    JButton buttonD;
    Dimension dim;

    Diskriminan() {
        DisFrame = new JFrame("Diskriminan (I Made Novandy Asardi)");
        DisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DisFrame.setSize(300,300);
        DisFrame.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));

        dim = new Dimension(200,50);

        labelA = new JLabel("A = ");
        tfA = new JTextField();
        tfA.setPreferredSize(dim);
        DisFrame.add(labelA);
        DisFrame.add(tfA);
        

        labelB = new JLabel("B = ");
        tfB = new JTextField();
        tfB.setPreferredSize(dim);
        DisFrame.add(labelB);
        DisFrame.add(tfB);

        labelC = new JLabel("C = ");
        tfC = new JTextField();
        tfC.setPreferredSize(dim);
        DisFrame.add(labelC);
        DisFrame.add(tfC);

        labelD = new JLabel("D? ");
        buttonD = new JButton("Hitung");
        buttonD.setPreferredSize(dim);
        DisFrame.add(buttonD);
        DisFrame.add(labelD);

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

        DisFrame.setResizable(false);
        DisFrame.setVisible(true);

    }
    public static void main (String [] args) {
        new Diskriminan();
    }
}
