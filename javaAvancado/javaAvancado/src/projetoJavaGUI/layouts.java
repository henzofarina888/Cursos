package projetoJavaGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class layouts extends JFrame {
    
    public layouts() {
    
    super ("meu Layout");
    
    Container c= getContentPane();
    
    c.add(BorderLayout.NORTH, new JButton("Bot�o norte"));
    c.add(BorderLayout.WEST, new JButton ("Bot�o leste"));
    c.add(BorderLayout.CENTER, new JButton("Bot�o central"));
    c.add(BorderLayout.EAST, new JButton("Bot�o leste"));
    c.add(BorderLayout.SOUTH, new JButton("Bot�o sul"));
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,300);
    setVisible(true);
    
    }
    
    public static void main(String[]args) {
        
        new layouts();
    }
}
