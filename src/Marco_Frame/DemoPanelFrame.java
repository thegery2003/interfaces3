package Marco_Frame;
import javax.swing.JFrame;
public class DemoPanelFrame {
    public static void main(String[] args)
    {
        PanelFrame framePane = new PanelFrame();
        framePane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePane.setSize(450, 200);
        framePane.setVisible(true);
    }
}