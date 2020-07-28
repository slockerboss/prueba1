package com.lulu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first_form extends JFrame{

    private JButton btn_hello;
    private JPanel main_panel;
    private JPanel JP_helloworld;
    private JLabel lb_hello;


    public first_form() {

       btn_hello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null,"hello world!");
            }
        });
    }
    public static void main(String[] args) {
        JFrame jf_main = new JFrame("Hello world App");
        jf_main.setContentPane(new first_form().main_panel);
        jf_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf_main.setSize(500,500);
        jf_main.setLocation(400,150);
        jf_main.setVisible(true);
    }
}
