package MarcoTeclas;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MarcoTeclas extends JFrame implements KeyListener {
    private String linea1 =""; 
    private String linea2 = ""; 
    private String linea3 = ""; 
    private JTextArea areaTexto; 

    public MarcoTeclas() {
        super("Puss a tecla");

        areaTexto = new JTextArea(10, 15); 
        areaTexto.setText("Oprima cualquier tecla en el teclado...");
        areaTexto.setEnabled(false);
        areaTexto.setDisabledTextColor(Color.blue);
        add(areaTexto); 

    }

   @Override
    public void keyPressed(KeyEvent evento) {
        linea1 = String.format("Tecla oprimida: %s", KeyEvent.getKeyText(evento.getKeyCode())); // muestra la tecla oprimida
        establecerLineas2y3(evento);}

    @Override
    public void keyReleased(KeyEvent evento) {
        linea1 = String.format("Tecla liberada: %s", KeyEvent.getKeyText(evento.getKeyCode())); // muestra la tecla liberada
        establecerLineas2y3(evento);
    }

    @Override
    public void keyTyped(KeyEvent evento) {
        linea1 = String.format("Tecla oprimida: %s", evento.getKeyChar());
        establecerLineas2y3(evento);
    }


    private void establecerLineas2y3(KeyEvent evento) {
        linea2 = String.format("Esta tecla %s es una tecla de accion", (evento.isActionKey() ? "" : "no "));

        String temp = KeyEvent.getKeyModifiersText(evento.getModifiers());

        linea3 = String.format("Teclas modificadoras oprimidas: %s", (temp.equals("") ? "ninguna" : temp));

        areaTexto.setText(String.format("%s\n%s\n%s\n", linea1, linea2, linea3));
    }
}