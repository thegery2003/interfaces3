package MarButon;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarButon extends JFrame{
        private final JButton botonJButtonSimple;
        private final JButton botonJButtonElegante;

        //MarcoBoton agrega objetos JButton A JFrame
    public MarButon(){
            super("Pruba de Botones");
            setLayout(new FlowLayout());

            botonJButtonSimple = new JButton("Boton Simple");
            add(botonJButtonSimple);


            Icon insecto1= new ImageIcon(getClass().getResource("1.gif"));
            Icon insecto2= new ImageIcon(getClass().getResource("2.gif"));
            botonJButtonElegante = new JButton("Boton elegante", insecto1);//Establece la imagen

            botonJButtonElegante.setRolloverIcon(insecto2);//Establece la imagen de sustitucion
            add(botonJButtonElegante);//agrega botonJButtonElegante a JFrame

            // crea nuevo ManejadorBoton para manejar los eventos de botón
            ManejadorBoton manejador = new ManejadorBoton();
            botonJButtonElegante.addActionListener(manejador);
            botonJButtonSimple.addActionListener(manejador);
        }
        // clase interna para manejar eventos de botón
        private class  ManejadorBoton implements  ActionListener{
            // maneja evento de botón
            @Override
            public void actionPerformed(ActionEvent evento){
                JOptionPane.showMessageDialog(MarButon.this,String.format("Usted oprimio" +
                        ": %s", evento.getActionCommand()));
            }
        }
    }// fin de la clase MarcoBoton