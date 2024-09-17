/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vistas;

import com.colegio.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernandez Fernando
 */
public class FormularioMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioMaterias
     */
    public FormularioMaterias() {
        initComponents();
        setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formularioInscripcion1 = new com.vistas.FormularioInscripcion();
        jPanelSouth = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanelCenter = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombreMateria = new javax.swing.JLabel();
        jLabelAnio = new javax.swing.JLabel();
        jTextFieldAnio = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNombreMateria = new javax.swing.JTextField();

        formularioInscripcion1.setVisible(true);

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(120, 100));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonGuardar);

        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.setPreferredSize(new java.awt.Dimension(120, 100));
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonNuevo);

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setPreferredSize(new java.awt.Dimension(120, 100));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonSalir);

        getContentPane().add(jPanelSouth, java.awt.BorderLayout.PAGE_END);

        jPanelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodigo.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabelCodigo.setText("Codigo de materia: ");
        jPanelCenter.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabelNombreMateria.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabelNombreMateria.setText("Nombre de la materia:");
        jPanelCenter.add(jLabelNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabelAnio.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabelAnio.setText("Anio al que pertenece:");
        jPanelCenter.add(jLabelAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTextFieldAnio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldAnio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldAnio.setPreferredSize(new java.awt.Dimension(141, 65));
        jPanelCenter.add(jTextFieldAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 290, -1));

        jTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldCodigo.setPreferredSize(new java.awt.Dimension(141, 65));
        jPanelCenter.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 290, -1));

        jTextFieldNombreMateria.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldNombreMateria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldNombreMateria.setPreferredSize(new java.awt.Dimension(141, 65));
        jPanelCenter.add(jTextFieldNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 290, -1));

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        jTextFieldAnio.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldNombreMateria.setText("");
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        int idMateria = Integer.parseInt(jTextFieldCodigo.getText());
        String materiaNombre = jTextFieldNombreMateria.getText();
        int anio = Integer.parseInt(jTextFieldAnio.getText());
        
        Materia materia = new Materia(idMateria, materiaNombre, anio);
        VistaPrincipal.materiasSet.add(materia);
        JOptionPane.showMessageDialog(null, "Materia guardada exitosamente.");
        
        jTextFieldAnio.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldNombreMateria.setText("");
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.vistas.FormularioInscripcion formularioInscripcion1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNombreMateria;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelSouth;
    private javax.swing.JTextField jTextFieldAnio;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombreMateria;
    // End of variables declaration//GEN-END:variables
}
