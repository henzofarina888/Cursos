package projetoJavaGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventos extends JFrame implements ActionListener{
    
    public eventos() {
        
        super("meus eventos");
        
        JButton botao = new JButton("clique");
        botao.addActionListener(this);
        
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        
    }
    
    public static void main(String[]args) {
        new eventos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Você clicou!!!");
    }
}
