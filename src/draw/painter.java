package draw;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class painter {
    public static void main(String[] args) {
        // crea objeto JFrame
        JFrame app = new JFrame("simp program to paint ");

        panelDraw panel = new panelDraw();
        app.add(panel, BorderLayout.CENTER);

        // crea una etiqueta y la coloca en la región SOUTH de BorderLayout
        app.add(new JLabel("mouse over to paint"), BorderLayout.SOUTH);

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(700, 500);
        app.setVisible(true);
    }
}
