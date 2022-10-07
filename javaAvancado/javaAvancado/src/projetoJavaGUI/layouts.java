package projetoJavaGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class layouts extends JFrame {
    
    public layouts() {
    
    super ("meu Layout");
    
    Container c= getContentPane();
    
    c.add(BorderLayout.NORTH, new JButton("Botão norte"));
    c.add(BorderLayout.WEST, new JButton ("Botão leste"));
    c.add(BorderLayout.CENTER, new JButton("Botão central"));
    c.add(BorderLayout.EAST, new JButton("Botão leste"));
    c.add(BorderLayout.SOUTH, new JButton("Botão sul"));
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,300);
    setVisible(true);
    
    }
    
    public static void main(String[]args) {
        
        new layouts();
    }
}
