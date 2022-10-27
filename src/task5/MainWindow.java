package task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;

public class MainWindow {
    public static int ACMilan = 0;
    public static int RealMadrid = 0;
    public static String LastScored = "N/A";


    static JFrame frame = new JFrame("DLL");


    private static ActionListener scored(int team, String scored) {
        team += 1;
        LastScored = scored;
        return null;
    }
    public static void main(String[] args) {

        // Preparing frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Panel
        Panel panel = new Panel();
        panel.setPreferredSize(new Dimension(400, 200));

        // Adding buttons
        JButton btn1 = new JButton("AC Milan");
        JButton btn2 = new JButton("Real Madrid");
        JLabel label1 = new JLabel("Results: " + ACMilan + " X " + RealMadrid);
        JLabel label2 = new JLabel("Last Scored: " + LastScored);
        Label label3 = new Label("Winner: " + "DRAW");
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ACMilan += 1;
                LastScored = "AC Milan";
                label1.setText("Results: " + ACMilan + " X " + RealMadrid);
                label2.setText("Last Scored " + LastScored);
                if (ACMilan < RealMadrid) { label3.setText("Winner: " + "Real Madrid"); }
                if (ACMilan == RealMadrid) { label3.setText("Winner: " + "DRAW"); }
                if (ACMilan > RealMadrid) { label3.setText("Winner: " + "AC Milan"); }

            }
        });

        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                RealMadrid += 1;
                LastScored = "Real Madrid";
                label1.setText("Results: " + ACMilan + " X " + RealMadrid);
                label2.setText("Last Scored" + LastScored);
                if (ACMilan < RealMadrid) { label3.setText("Winner: " + "Real Madrid"); }
                if (ACMilan == RealMadrid) { label3.setText("Winner: " + "DRAW"); }
                if (ACMilan > RealMadrid) { label3.setText("Winner: " + "AC Milan"); }

            }
        });



        panel.add(btn1);
        panel.add(btn2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        frame.getContentPane().add(panel);
        frame.pack();

    }


}
