/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

/**
 *
 * @author Cesar
 */
import java.awt.Label;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DragAndDrop extends JPanel implements MouseMotionListener {

    Label LbPosicion = new Label("(x, y)");

    public DragAndDrop() {
        add(LbPosicion);
        addMouseMotionListener(this);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            LbPosicion.setText("(" + e.getX() + "," + e.getY() + ")");
            LbPosicion.setLocation(e.getPoint());
            LbPosicion.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e
    ) {

    }

}
