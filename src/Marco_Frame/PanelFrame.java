package Marco_Frame;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame {
    private final JPanel buttonPanel;
    private final JButton[] buttons;

    public PanelFrame() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, buttons.length));

        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonPanel.add(buttons[count]); // Adds the button
        }
        add(buttonPanel, BorderLayout.SOUTH);
    }
}