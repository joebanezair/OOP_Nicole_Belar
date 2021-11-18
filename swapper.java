/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files.oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author JOEBANEZAIR
 */
public class swapper extends JFrame implements ActionListener{
    
    FlowLayout layout = new FlowLayout();
    Container con = getContentPane();
    JButton checker, swapper;
    JTextField jch, jsw; JLabel value;
    public String sc, sw;
    public swapper(){
        
        con.setLayout(layout);
        //buttons
        value = new JLabel("value");
        checker = new JButton("checker"); checker.addActionListener(this);
        checker.setPreferredSize(new Dimension(100,20));
        
        swapper = new JButton("swapper"); swapper.addActionListener(this);
        swapper.setPreferredSize(new Dimension(100,20));
        //textField
        jch = new JTextField("");
        jch.setPreferredSize(new Dimension(150,20));
        
        jsw = new JTextField("");
        jsw.setPreferredSize(new Dimension(150,20));
        
        con.add(new JLabel("Checker and Swapper"));
        con.add(jch);
        con.add(checker);
        con.add(jsw);
        con.add(swapper);
        con.add(value);
                  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Checker and Swapper");
        setSize(300,200);
        
        //checker.addActionListener((ActionEvent e) -> {});
    }
    public static void main(String[] args) {
        swapper swap = new swapper();
        swap.setLocationRelativeTo(null);
        swap.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sc = jch.getText(); 
        sw = jsw.getText();
        if(e.getSource() == checker){
           if (sc.equals(sw)) {
                value.setText("same");
           }else{
                value.setText("not the same");
           }
        }
        if(e.getSource() == swapper){
          jch.setText(sw);
          jsw.setText(sc);
          value.setText("swapped");
        }
    }
}
