package projetoJavaGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class meuFrame extends JFrame{
    public meuFrame() {
        
        super("Meu frame");
        
        JButton botao = new JButton("clique");
        
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        
        }
        public static void main(String[]args) {
            new meuFrame();
        }
        
}
