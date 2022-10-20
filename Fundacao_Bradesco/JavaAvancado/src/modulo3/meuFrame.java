package modulo3;

import javax.swing.JFrame;
import javax.swing.JButton;

public class meuFrame extends JFrame{

    public meuFrame(){

        super("MEU FRAME");
        JButton botao= new JButton("clique...");


        getContentPane().add(botao);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String[]args){
        new meuFrame();
    }



}
