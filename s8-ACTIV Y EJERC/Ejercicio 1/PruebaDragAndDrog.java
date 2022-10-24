/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFi
 */
package lab08;

/**
 *
 * @author Cesar
 */

import javax.swing.JFrame;

public class PruebaDragAndDrog {

    public static void main(String[] args) {
        
        // TODO code application logic here
        JFrame drag = new JFrame("PruebaDragAndDrog");
        drag.add(new DragAndDrop());
        drag.setSize(700, 700);
        drag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drag.setVisible(true);        



    }

}
