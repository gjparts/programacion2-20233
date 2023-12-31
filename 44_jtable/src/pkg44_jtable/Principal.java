/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg44_jtable;

/**
 *
 * @author Gerardo Portillo
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; //importar el modelo
public class Principal extends javax.swing.JFrame {
    //crear una variable global (atributo) para manejar el modelo
    //desde diferentes metodos (funciones)
    DefaultTableModel modelo;

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("20012002049 Gerardo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Borrar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //instanciar objeto para el modelo
        modelo = new DefaultTableModel(){
            //hacemos polimorfismo al evento isCellEditable
            //para evitar que una celda se pueda editar
            @Override
            public boolean isCellEditable(int row, int column){
                //retornamos falso para evitar que la celda se pueda editar
                return false;
            }
        };
        //agregar columnas al modelo
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Propietario");
        modelo.addColumn("Especie");
        //asignar el modelo al JTable
        tabla.setModel(modelo);
        
        //poner datos de prueba
        //cada renglon será un arreglo de String
        String renglon[] = {"M0001","Firualis","3","Filomeno Colinas","Perro"};
        modelo.addRow(renglon);
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //crear una instancia de Detalle
        Detalle d = new Detalle(this,true);
        d.setVisible(true); //mandar a dibujar
        //el siguiente codigo se ejecuta cuando se cierra/oculta
        //el JDialog de Detalle
        //si el rootPane no es null entonces es porque se hizo click
        //en el boton Aceptar
        if( d.getRootPane() != null ){
            //agregar el registro al JTable
            String renglon[] = {
                d.txtCodigo.getText(),
                d.txtNombre.getText(),
                d.txtEdad.getText(),
                d.txtPropietario.getText(),
                d.txtEspecie.getText()
            };
            modelo.addRow(renglon);
            //destruir el Detalle
            d.dispose();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //si no se ha seleccionado una fila no continua
        if( tabla.getSelectedRow() == -1 ) return;
        //crear un form de Detalle y llenarlo con lo que esta en el renglon
        Detalle d = new Detalle(this,true);
        d.txtCodigo.setText( tabla.getValueAt( tabla.getSelectedRow(), 0).toString() );
        d.txtNombre.setText( tabla.getValueAt( tabla.getSelectedRow(), 1).toString() );
        d.txtEdad.setText( tabla.getValueAt( tabla.getSelectedRow(), 2).toString() );
        d.txtPropietario.setText( tabla.getValueAt( tabla.getSelectedRow(), 3).toString() );
        d.txtEspecie.setText( tabla.getValueAt( tabla.getSelectedRow(), 4).toString() );
        d.setVisible(true);
        if( d.getRootPane() != null ){
            //hizo click en Aceptar
            //actualizar la fila seleccionada
            tabla.setValueAt(d.txtCodigo.getText(),tabla.getSelectedRow(), 0);
            tabla.setValueAt(d.txtNombre.getText(),tabla.getSelectedRow(), 1);
            tabla.setValueAt(d.txtEdad.getText(),tabla.getSelectedRow(), 2);
            tabla.setValueAt(d.txtPropietario.getText(),tabla.getSelectedRow(), 3);
            tabla.setValueAt(d.txtEspecie.getText(),tabla.getSelectedRow(), 4);
            //termino de actualizar, destruimos el Detalle
            d.dispose();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //verificar si ha seleccionado fila
        if( tabla.getSelectedRow() == -1 ) return;
        
        //preguntar al usuario antes de eliminar
        int boton = JOptionPane.showConfirmDialog(this, "Desea eliminar el item?");
        if( boton == 0 ){
            //borrar la fila
            modelo.removeRow( tabla.getSelectedRow() );
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //preguntar al usuario antes de limpiar
        int boton = JOptionPane.showConfirmDialog(this, "Desea limpiar todo?");
        if( boton == 0 ){
            boton = JOptionPane.showConfirmDialog(this, "Esta seguro?");
            if( boton == 0 ){
                boton = JOptionPane.showConfirmDialog(this, "Realmente seguro, 100%?");
                if( boton == 0 ){
                    modelo.getDataVector().removeAllElements();
                    //refrescar la GUI de la tabla
                    tabla.updateUI();
                }
            }
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
