package Tracker_Frame;
import javax.swing.JFrame;
public class DemoMause {
    public static void main(String[] args) {
        MaoseTraker mouseTrackerFrame = new MaoseTraker();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(800, 600);
        mouseTrackerFrame.setVisible(true);
    }
}
