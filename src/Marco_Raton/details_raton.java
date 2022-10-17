package Marco_Raton;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
// para ver si hace el commit
public class details_raton extends JFrame {
        private String detalles;
        private final JLabel barraEstado;

    public details_raton() {
            super("Clic y Botones del raton");

            barraEstado = new JLabel("Haga clic en el raton");
            add(barraEstado, BorderLayout.SOUTH);
            addMouseListener(new ManejadorClicRaton());}

        private class ManejadorClicRaton extends MouseAdapter {

            @Override
            public void mouseClicked(MouseEvent evento) {
                int xPos = evento.getX();//get mouse position x
                int yPos = evento.getY();//get mouse position y

                detalles = String.format("Se hizo clic %d vez(veces)",
                        evento.getClickCount());

                if (evento.isMetaDown())
                    detalles += "con el boton derecho del raton";
                else if (evento.isAltDown())
                    detalles += " con el boton central del raton";
                else
                    detalles += "con el boton izquierdo del raton";

                barraEstado.setText(detalles);

            }
        }
    }
