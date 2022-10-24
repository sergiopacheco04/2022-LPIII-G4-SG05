/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Cesar
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MarcoCasillaVerificacion extends JFrame {

    private JTextField campoTexto; //  muestra el texto en tipos de letra cambiantes
    private JCheckBox negritaJCheckBox; // para seleccionar/deseleccionar negrita
    private JCheckBox cursivaJCheckBox; // para seleccionar/deseleccionar cursiva
    
    // El constructor de MarcoCasillaVerificacion agrega objetos JCheckBox a JFrame
    public MarcoCasillaVerificacion() {
        super("Ximena Mamani Salazar");
        setLayout(new FlowLayout());
        
        // establece JTextField y su tipo de letra
        campoTexto = new JTextField("Observe como cambia el estilo de tipo de letra", 20);
        campoTexto.setFont(new Font("Serif", Font.PLAIN, 14));
        add(campoTexto); // agrega campoTexto a JFrame
        negritaJCheckBox = new JCheckBox("Negrita");
        cursivaJCheckBox = new JCheckBox("Cursiva");
        add(negritaJCheckBox); // agrega casilla de verificación “negrita” a JFrame
        add(cursivaJCheckBox); // agrega casilla de verificación “cursiva” a JFrame

        // registra componentes de escucha para objetos JCheckBox
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckBox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
    }
// clase interna privada para el manejo de eventos ItemListener40private class ManejadorCheckBox implements ItemListener 

    private class ManejadorCheckBox implements ItemListener {

// responde a los eventos de casilla de verificación
        @Override
        public void itemStateChanged(ItemEvent evento) {
            Font tipoletra = null; // almacena el nuevo objeto Font
            //  determina cuáles objetos CheckBox están seleccionados y crea el objeto Font
            if (negritaJCheckBox.isSelected() && cursivaJCheckBox.isSelected()) {
                tipoletra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (negritaJCheckBox.isSelected()) {
                tipoletra = new Font("Serif", Font.BOLD, 14);
            } else if (cursivaJCheckBox.isSelected()) {
                tipoletra = new Font("Serif", Font.ITALIC, 14);
            } else {
                tipoletra = new Font("Serif", Font.PLAIN, 14);
            }
            campoTexto.setFont(tipoletra);
        }
    }
}

