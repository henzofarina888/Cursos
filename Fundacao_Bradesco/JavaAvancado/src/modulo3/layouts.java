package modulo3;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

public class layouts extends JFrame{

    public layouts(){

        super("MEU layout.");

        Container c = getContentPane();

        c.add(BorderLayout.NORTH, new JButton("Botão norte"));
        c.add(BorderLayout.SOUTH, new JButton("Botão Sul"));
        c.add(BorderLayout.WEST, new JButton("Botão LESTE"));
        c.add(BorderLayout.EAST, new JButton("Botão OESTE"));
        c.add(BorderLayout.CENTER, new JButton("Botão CENTRAL"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String[]args){
        new layouts();
    }



}