/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package event.events;

import java.awt.Color;

/**
 *
 * @author Yenyen.keot90
 */
public class mainBar extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public mainBar() {
        initComponents();
        setTitle("Party Planner");
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panel = new javax.swing.JPanel();
      
        label1 = new javax.swing.JLabel();
      
        label2 = new javax.swing.JLabel();
      
        menu = new javax.swing.JMenuBar();
      
        File = new javax.swing.JMenu();
      
        evnt = new javax.swing.JMenu();
      
        adult = new javax.swing.JMenu();
      
        adultBday = new javax.swing.JMenuItem();
      
        anniv = new javax.swing.JMenuItem();
      
        retirement = new javax.swing.JMenuItem();
      
        adultOther = new javax.swing.JMenuItem();
      
        child = new javax.swing.JMenu();
      
        childBday = new javax.swing.JMenuItem();
      
        childOther = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 200));

        panel.setBackground(Color.white);

        label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("We have lots of ideas for memorable events");
        label1.setPreferredSize(new java.awt.Dimension(370, 30));

        label2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setPreferredSize(new java.awt.Dimension(370, 30));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        menu.setBackground(Color.white);
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        File.setText("File");
        menu.add(File);

        evnt.setText("Event Types");

        adult.setText("Adult");

        adultBday.setText("Birthday!");
        adultBday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultBdayActionPerformed(evt);
            }
        });
        adult.add(adultBday);

        anniv.setText("Anniversary!");
        anniv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annivActionPerformed(evt);
            }
        });
        adult.add(anniv);

        retirement.setText("Retirement!");
        retirement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirementActionPerformed(evt);
            }
        });
        adult.add(retirement);

        adultOther.setText("Others!");
        adultOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultOtherActionPerformed(evt);
            }
        });
        adult.add(adultOther);

        evnt.add(adult);

        child.setText("Child");

        childBday.setText("Birthday!");
        childBday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childBdayActionPerformed(evt);
            }
        });
        child.add(childBday);

        childOther.setText("Other!");
        childOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childOtherActionPerformed(evt);
            }
        });
        child.add(childOther);

        evnt.add(child);

        menu.add(evnt);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void adultBdayActionPerformed(java.awt.event.ActionEvent evt) {                                          
       label1.setText("Celebrate another year!");
       
       label2.setText("We have lots of ideas for memorable events");       
    }                                         

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {                                  
    }                                 

    private void annivActionPerformed(java.awt.event.ActionEvent evt) {                                      
      label1.setText("Look forward to golden days!");
      label2.setText("We have lots of ideas for memorable events");       
    }                                     

    private void retirementActionPerformed(java.awt.event.ActionEvent evt) {                                           
      label1.setText("Cheers to hardwork!");
      label2.setText("We have lots of ideas for memorable events"); 
    }                                          

    private void adultOtherActionPerformed(java.awt.event.ActionEvent evt) {                                           
      label1.setText("We have lots of ideas for memorable events");
      label2.setText(""); 
    }                                          

    private void childBdayActionPerformed(java.awt.event.ActionEvent evt) {                                          
      label2.setText("We have lots of ideas for memorable events");
      label1.setText("throw the best birthday party!");
    }                                         

    private void childOtherActionPerformed(java.awt.event.ActionEvent evt) {                                           
        label1.setText("We have lots of ideas for memorable events");
        label2.setText("");
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu File;
    private javax.swing.JMenu adult;
    private javax.swing.JMenuItem adultBday;
    private javax.swing.JMenuItem adultOther;
    private javax.swing.JMenuItem anniv;
    private javax.swing.JMenu child;
    private javax.swing.JMenuItem childBday;
    private javax.swing.JMenuItem childOther;
    private javax.swing.JMenu evnt;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem retirement;
    // End of variables declaration                   
}
