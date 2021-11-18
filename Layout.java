// Border Layout
// Flow Layout
// Grid Layout
// Card Layout




// Border Layout
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
public class Border extends JFrame {
     Border(){setTitle("Border Layout");} 
  public static void main(String[] args) {
    Border bs = new Border();
    bs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container pane = bs.getContentPane();
    pane.setLayout(new BorderLayout());
    JLabel label = new JLabel("North", JLabel.CENTER);
    label.setFont(new Font("SansSerif", Font.BOLD, 20));
    label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    pane.add(label, BorderLayout.NORTH);
    label = new JLabel("South", JLabel.CENTER);
    label.setFont(new Font("SansSerif", Font.BOLD, 20));
    label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    pane.add(label, BorderLayout.SOUTH);
    label = new JLabel("East", JLabel.CENTER);
    label.setFont(new Font("SansSerif", Font.BOLD, 20));
    label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    pane.add(label, BorderLayout.EAST);
    label = new JLabel("West", JLabel.CENTER);
    label.setFont(new Font("SansSerif", Font.BOLD, 20));
    label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    pane.add(label, BorderLayout.WEST);
    label = new JLabel("Center", JLabel.CENTER);
    label.setFont(new Font("SansSerif", Font.BOLD, 20));
    label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    pane.add(label, BorderLayout.CENTER);
    bs.setSize(400, 400);
    bs.setVisible(true);
  }}
// Border Layout

// Flow Layout
import java.awt.*;    
import javax.swing.*;    
    
public class flowLayout extends JFrame{   
   
// main method  
public static void main(String argvs[]){    
    JFrame frameObj = new JFrame("FlowLayout Example");
    frameObj.setLayout(new FlowLayout());    
        
    // creating the buttons  
    JButton b1 = new JButton("1");    
    JButton b2 = new JButton("2");    
    JButton b3 = new JButton("3");    
    JButton b4 = new JButton("4");    
    JButton b5 = new JButton("5");  
    JButton b6 = new JButton("6");    
    JButton b7 = new JButton("7");    
    JButton b8 = new JButton("8");    
    JButton b9 = new JButton("9");    
    JButton b10 = new JButton("10");    
         
    // adding the buttons to frame        
    frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);      
    frameObj.add(b5); frameObj.add(b6);  frameObj.add(b7);  frameObj.add(b8);    
    frameObj.add(b9);  frameObj.add(b10);
    
    frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frameObj.setSize(300, 300);    
    frameObj.setVisible(true);       
}}    
// Flow Layout

// Grid Layout
import java.awt.*;    
import javax.swing.*;    
public class gridLayout{    
JFrame frameObj;    
// constructor  
gridLayout(){

frameObj = new JFrame("GridLayout");
frameObj.setLayout(new GridLayout(3,3, 5,5));    

// creating 9 buttons  
JButton btn1 = new JButton("1");    
JButton btn2 = new JButton("2");    
JButton btn3 = new JButton("3");    
JButton btn4 = new JButton("4");    
JButton btn5 = new JButton("5");    
JButton btn6 = new JButton("6");    
   
// are adding to the frame. The row count remains one.  
frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);  
frameObj.add(btn4); frameObj.add(btn5); frameObj.add(btn6);  
   
  
// setting the grid layout using the parameterless constructor    
frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frameObj.setSize(400, 400);    
frameObj.setVisible(true);}  
  
// main method  
public static void main(String argvs[]){    
  
  new gridLayout();    

}}
// Grid Layout

// Card Layout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cardLayout extends JFrame implements ActionListener{
  private CardLayout cards = new CardLayout();
  private JButton b1 = new JButton("ace of hearts");
  private JButton b2 = new JButton("three of spades");
  private JButton b3 = new JButton("queen of clubs");
  private Container con = getContentPane();
  
  cardLayout(){
    setTitle("Card Layout");
    setLocationRelativeTo(null);
    con.setLayout(cards);
    con.add("ace", b1);
    b1.addActionListener(this);
    con.add("three", b2);
    b2.addActionListener(this);
    con.add("queen", b3);
    b3.addActionListener(this);
    setSize(250,100);
  }
  public void actionPerformed(ActionEvent e){
    cards.next(getContentPane());
  }
  public static void main(String[] args) {
    cardLayout card = new cardLayout();
    card.setVisible(true);
  }

}
// Card Layout
