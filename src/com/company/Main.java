package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JButton Shuffle, Head, Pick, Hand;
    private JEditorPane Resp;
    private JLabel msn;
    private Deck d;

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setSize(300, 300);
        frame.createGUI();
        frame.setVisible(true);
        frame.createDeck();
    }

    private void createDeck(){
        d = new Deck();
    }
    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        Shuffle = new JButton("Shuffle");
        window.add(Shuffle);
        Shuffle.addActionListener(this);
        Head = new JButton("Head");
        window.add(Head);
        Head.addActionListener(this);
        Pick = new JButton("Pick");
        window.add(Pick);
        Pick.addActionListener(this);
        Hand = new JButton("Hand");
        window.add(Hand);
        Hand.addActionListener(this);
        msn = new JLabel("Resultado: ");
        window.add(msn);
        Resp = new JEditorPane();
        //Resp.setContentType("text/html"); :D
        Resp.setSize(new Dimension(250,100));
        //Resp.setBounds(new Rectangle(25, 15, 250, 100));
        window.add(Resp);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Resp.setText("");

        if(event.getSource() == Shuffle){
            Resp.setText(d.Suffle());
        }
        if(event.getSource() == Head){
            Resp.setText(d.Head());
        }
        if(event.getSource() == Pick){
            Resp.setText(d.Pick());
        }
        if(event.getSource() == Hand){
            Resp.setText(d.Hand());
        }
    }
}
