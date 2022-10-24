package com.mycompany.lab9;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Marco extends JFrame implements ActionListener
{
    private final JButton[] botones;
    private static final String[] nombres ={"uno", "dos", "tres", "cuatro", "cinco", "seis"};
    private boolean alternar =true;
    private Container contenedor;
    private GridLayout cuadricula1;
    private GridLayout cuadricula2;
    
    public Marco()
    {
        super("jes");
        cuadricula1=new GridLayout(2,3,5,5);
        cuadricula2=new GridLayout(3,2);
        contenedor=getContentPane();
        setLayout(cuadricula1);
        botones=new JButton[nombres.length];
        
        for(int cuenta=0;cuenta<nombres.length; cuenta++)
        {
            botones[cuenta]=new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
            add(botones[cuenta]);
        }
    }
    public void actionPerformed(ActionEvent evento){}
}