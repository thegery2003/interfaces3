package draw;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class panelDraw extends JPanel {
    private final ArrayList<Point> point = new ArrayList<>();
    public panelDraw() {
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent evento) {
                        point.add(evento.getPoint());
                        repaint();
                    }
                }
        );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // borra el área de dibujo

        // dibuja todos los puntos
        for (Point punto : point) {
            g.fillOval(punto.x, punto.y, 4, 4);
        }
    }
}
