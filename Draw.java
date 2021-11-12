import java.awt.*;
import javax.swing.*;


public class Face2 extends JFrame {
    // ================================================================== main
    public static void main(String[] args) {
        Face2 window = new Face2();
        window.setVisible(true);
    }
    
    // ============================================================  
    Face2() {
        JPanel content = new JPanel();               
        content.setLayout(new BorderLayout());
        
        Draw drawing = new Draw();             
        content.add(drawing, BorderLayout.CENTER);   
        
        this.setContentPane(content);
        this.setTitle("Cartoon Character");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();                                 
        this.setLocationRelativeTo(null);            
    }
}

public class Draw extends JComponent {
    //======================================================  
    private static final int BORDER = 8;  // Border in pixels.
    
    //===================================================== constructor
    Draw() {
        this.setPreferredSize(new Dimension(300, 300));  // size
    }
    
    //================================================== paintComponent
    @Override public void paintComponent(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        
        //... Draw background.
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, w, h);
        
        //... Draw the head with open mouth and 8 pixel border
        g.setColor(Color.BLACK);
        g.fillArc(BORDER, BORDER, w - 2*BORDER, h - 2*BORDER, 30, 300);  
        
        //... Draw the eye
        g.setColor(Color.RED);
        int eyeSize = w / 7;
        g.fillOval(w / 2, h / 5, eyeSize, eyeSize);
    }
}


