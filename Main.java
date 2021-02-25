package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class GUI extends JFrame{
    int l1,l2,l3;
    JTextField
            dane  = new JTextField(20);

    JButton
            guzik1 = new JButton("obliczenie 1") ,
            guzik2 = new JButton("obliczenie 2") ,
            guzik3 = new JButton("obliczenie 2") ;

    GUI(Liczba liczba1, Liczba liczba2, Liczba liczba3){
        TrzyLiczby trzyliczby = new TrzyLiczby();
         l1 = liczba1.getWartosc();
         l2 = liczba2.getWartosc();
         l3 = liczba3.getWartosc();
        setTitle("GUI");
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,2,10,10)) ;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true) ;

        cp.add(dane);
        cp.add(guzik1);
        cp.add(guzik2);
        cp.add(guzik3);

        guzik1.addActionListener(new Guzik1());
        guzik2.addActionListener(new Guzik2());
        guzik3.addActionListener(new Guzik3());
    }
    class Guzik1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = String.valueOf(l1);
            dane.setText(s);
        }
    }
    class Guzik2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = String.valueOf(l2);
            dane.setText(s);
        }
    }
    class Guzik3 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = String.valueOf(l3);
            dane.setText(s);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Liczba liczba1 = new Liczba();
        liczba1.losuj();
        Liczba liczba2 = new Liczba();
        liczba2.losuj();
        Liczba liczba3 = new Liczba();
        liczba3.losuj();
	    JFrame gui = new GUI(liczba1, liczba2, liczba3);
	    gui.setSize(200,200);


    }
}
