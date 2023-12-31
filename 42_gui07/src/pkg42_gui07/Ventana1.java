/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg42_gui07;

import java.awt.Color;

/**
 *
 * @author Gerardo Portillo
 */
import javax.swing.JOptionPane;
public class Ventana1 extends javax.swing.JFrame {

    //metodo para cambiar el color de fondo
    //de acuerdo al RadioButton seleccionado
    public void cambioColor(){
        try {
            //el color de fondo dependera del actionCommand
            //del elemento seleccionado en el buttonGroup
            if( color.getSelection().getActionCommand().equals("red") )
                this.getContentPane().setBackground(Color.red);
            
            if( color.getSelection().getActionCommand().equals("blue") )
                this.getContentPane().setBackground(Color.blue);
            
            if( color.getSelection().getActionCommand().equals("green") )
                this.getContentPane().setBackground(Color.green);
        } catch (Exception e) {
            //si algo sale mal regresa el color a default
            this.getContentPane().setBackground(null);
        }
    }
    
    /**
     * Creates new form Ventana1
     */
    public Ventana1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        color = new javax.swing.ButtonGroup();
        genero = new javax.swing.ButtonGroup();
        rojo = new javax.swing.JRadioButton();
        verde = new javax.swing.JRadioButton();
        azul = new javax.swing.JRadioButton();
        masculino = new javax.swing.JRadioButton();
        femenino = new javax.swing.JRadioButton();
        botonPrueba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerardo 200710510115");

        color.add(rojo);
        rojo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rojo.setText("Rojo");
        rojo.setToolTipText("");
        rojo.setActionCommand("red");
        rojo.setOpaque(false);
        rojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rojoStateChanged(evt);
            }
        });

        color.add(verde);
        verde.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        verde.setText("Verde");
        verde.setActionCommand("green");
        verde.setOpaque(false);
        verde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                verdeStateChanged(evt);
            }
        });

        color.add(azul);
        azul.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        azul.setText("Azul");
        azul.setActionCommand("blue");
        azul.setOpaque(false);
        azul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                azulStateChanged(evt);
            }
        });

        genero.add(masculino);
        masculino.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        masculino.setText("Masculino");

        genero.add(femenino);
        femenino.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        femenino.setText("Femenino");

        botonPrueba.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonPrueba.setText("Prueba");
        botonPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPruebaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rojo)
                        .addGap(18, 18, 18)
                        .addComponent(verde)
                        .addGap(18, 18, 18)
                        .addComponent(azul))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(masculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(femenino))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(botonPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rojo)
                    .addComponent(verde)
                    .addComponent(azul))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masculino)
                    .addComponent(femenino))
                .addGap(30, 30, 30)
                .addComponent(botonPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rojoStateChanged
        cambioColor();
    }//GEN-LAST:event_rojoStateChanged

    private void verdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_verdeStateChanged
        cambioColor();
    }//GEN-LAST:event_verdeStateChanged

    private void azulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_azulStateChanged
        cambioColor();
    }//GEN-LAST:event_azulStateChanged

    private void botonPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPruebaActionPerformed
        if( masculino.isSelected() == false && femenino.isSelected() == false ){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un genero");
            return; //no sigue
        }
            
        if( masculino.isSelected() == true )
            JOptionPane.showMessageDialog(this, "Ha seleccionado Masculino");
        
        if( femenino.isSelected() == true )
            JOptionPane.showMessageDialog(this, "Ha seleccionado Femenino");
    }//GEN-LAST:event_botonPruebaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton azul;
    private javax.swing.JButton botonPrueba;
    private javax.swing.ButtonGroup color;
    private javax.swing.JRadioButton femenino;
    private javax.swing.ButtonGroup genero;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JRadioButton rojo;
    private javax.swing.JRadioButton verde;
    // End of variables declaration//GEN-END:variables
}
