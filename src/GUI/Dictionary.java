/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The GUI package contains the Jframe configuration
 */
package GUI;

import Interfaces.TADConjuntable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import Logic.Conjunt;
import Logic.DictionaryLogic;
import java.awt.*;
import javax.swing.*;
/**
 * The class dictionary mix the logic part of dictionary and the graphical
 * interface, the result is a program able to search words in a dictionary set
 * and classify the found words and the not found words
 * 
 * @author Daniel Jimenez
 * @version 1.0
 * @since February 19
 */
public class Dictionary extends javax.swing.JFrame {

    /**
     * Creates new form Dictionary
     */
    public Dictionary() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Resources/02.jpg")).getImage());
        setTitle("Java Programming Dictionary");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("\t\t\tWelcome to the Java Programming Dictionary");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText(dic1.Parts2[0]+"  "+dic1.Parts2[1]+"  "+dic1.Parts2[2]+"  "+dic1.Parts2[3]+"  "+"\n"+dic1.Parts2[4]+"  "+dic1.Parts2[5]+"  "+dic1.Parts2[6]+"  "+dic1.Parts2[7]+"  "+"\n"+dic1.Parts2[8]+"  "+dic1.Parts2[9]+"  "+dic1.Parts2[10]+"  "+dic1.Parts2[11]+"  "+"\n"+dic1.Parts2[12]+"  "+dic1.Parts2[13]+"  "+dic1.Parts2[14]+"  "+dic1.Parts2[15]+"  "+"\n"+dic1.Parts2[16]+"  "+dic1.Parts2[17]+"  "+dic1.Parts2[18]+"  "+dic1.Parts2[19]);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel2.setText("Word Bank");

        jLabel3.setText("Found words");

        jLabel4.setText("Not found words");

        jTextField1.setText("Here, introduce a phrase separated by spaces");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFocusable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFocusable(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/01.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Here is the method that going to classify the words in found words and not
     * found words when the user already introduced the phrase, and clicked on Check
     * 
     * @param evt Receives a click event on the button Check  
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dic1.setMessage(jTextField1.getText());
        String Parts[]=dic1.getMessage().split(" ");
        
        Conjunt tester=new Conjunt(); //Set where the words will introduce in it
        for (int i = 0; i < Parts.length; i++) {
            tester.add(Parts[i]);
        }
        dic1.setMessageConjuct(tester);
        
        
        Conjunt tester2= new Conjunt();//Set where the dictionary will introduce in it
        for (int i = 0; i < dic1.Parts2.length; i++) {
            tester2.add(dic1.Parts2[i]);
        }
        dic1.setConjunctDictionary(tester2);
        
        //Uncommit if you want to see how it´s making the sets, this will appears
        //on the console
        /**
        System.out.println("Printing the dictionary");
        
        for (int i = 0; i < dic1.getConjunctDictionary().getData().length; i++) {
            System.out.println(dic1.getConjunctDictionary().getData()[i]);
        }
        System.out.println("Dictionary printed succesfull");
        System.out.println("");
        System.out.println("Printing the message");
        for (int i = 0; i < dic1.getMessageConjuct().getData().length; i++) {
            System.out.println(dic1.getMessageConjuct().getData()[i]);
        }
        System.out.println("Message printed succesfull");
        System.out.println("");
        System.out.println("");
        System.out.println("Printing intersection");
        **/ 
        
        
        Conjunt intersection=new Conjunt();
        String inter="";
        for (int i = 0; i < intersection.getData().length; i++) {
            if (dic1.getConjunctDictionary().contains(dic1.getMessageConjuct().getData()[i])) {
                intersection.add(dic1.getMessageConjuct().getData()[i]);
                inter+=dic1.getMessageConjuct().getData()[i]+" ";
            }
        }
        
        /**
        for (int i = 0; i <intersection.getData().length; i++) {
            System.out.println(intersection.getData()[i]);
        }
        
        
            System.out.println("Intersection printed sucessfull");
            System.out.println("");
            System.out.println("");
            System.out.println("Printing difference");
        **/
        
        Conjunt difference=new Conjunt();
        String differ="";
        for (int i = 0; i <difference.getData().length; i++) {
            if (!dic1.getConjunctDictionary().contains(dic1.getMessageConjuct().getData()[i]) &&
                    dic1.getMessageConjuct().getData()[i]!=null) {
                    difference.add(dic1.getMessageConjuct().getData()[i]);
                    differ+=dic1.getMessageConjuct().getData()[i]+"  ";
            }
        }
        
        /**
        for (int i = 0; i <difference.getData().length; i++) {
            System.out.println(difference.getData()[i]);
        }
        
            System.out.println("Difference printed sucessfull");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            **/
            
            jTextField2.setText(inter);
            jTextField3.setText(differ);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    
   
    
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
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dictionary().setVisible(true);
            }
        });
        
       
    }
    
   private static DictionaryLogic dic1=new DictionaryLogic();//Object of dictioonary kind

   
   
   
   
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables


}
