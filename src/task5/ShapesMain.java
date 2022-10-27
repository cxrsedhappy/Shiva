package task5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapesMain {
    static JFrame frame = new JFrame("DLL");


    public static void main(String[] args) {
        Random random = new Random();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g){
                for (int i = 0; i < 20; i++) {
                    g.setColor(new Color(
                            random.ints(1, 255).findFirst().getAsInt(),
                            random.ints(1, 255).findFirst().getAsInt(),
                            random.ints(1, 255).findFirst().getAsInt()
                    ));
                    if (i % 2 == 0) {
                        g.drawOval(i * 25 + 105, i * 25 + 100, 10, 20);
                    } else {
                        g.drawRect(i * 25 + 100, i * 25 + 100, 20, 20);
                    }
                }
            }
        };
        panel.setPreferredSize(new Dimension(1920, 1080));
        frame.getContentPane().add(panel);
        frame.pack();


    }
}
