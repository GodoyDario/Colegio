package vistas;

/**
 *
 * @author Xethias
 */
public class Sistema extends javax.swing.JFrame {

    public Sistema() {
        initComponents();
        this.setTitle("Escritorio");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        dplEscritorio = new javax.swing.JDesktopPane();
        Jmenu = new javax.swing.JMenuBar();
        jMenu_Alumno = new javax.swing.JMenu();
        menuitemAlumno = new javax.swing.JMenuItem();
        jMenu_Materias = new javax.swing.JMenu();
        menuitemMaterias = new javax.swing.JMenuItem();
        menuitemRegistro = new javax.swing.JMenu();
        menuitemregis = new javax.swing.JMenuItem();
        jMenu_Salir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dplEscritorioLayout = new javax.swing.GroupLayout(dplEscritorio);
        dplEscritorio.setLayout(dplEscritorioLayout);
        dplEscritorioLayout.setHorizontalGroup(
            dplEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dplEscritorioLayout.setVerticalGroup(
            dplEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu_Alumno.setText("Alumno");

        menuitemAlumno.setText("Agregar Alumno");
        menuitemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemAlumnoActionPerformed(evt);
            }
        });
        jMenu_Alumno.add(menuitemAlumno);

        Jmenu.add(jMenu_Alumno);

        jMenu_Materias.setText("Materias");

        menuitemMaterias.setText("Agregar Materia");
        menuitemMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemMateriasActionPerformed(evt);
            }
        });
        jMenu_Materias.add(menuitemMaterias);

        Jmenu.add(jMenu_Materias);

        menuitemRegistro.setText("Registro");

        menuitemregis.setText("Registrarse");
        menuitemregis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemregisActionPerformed(evt);
            }
        });
        menuitemRegistro.add(menuitemregis);

        Jmenu.add(menuitemRegistro);

        jMenu_Salir.setText("Salir");
        Jmenu.add(jMenu_Salir);

        setJMenuBar(Jmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dplEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dplEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemAlumnoActionPerformed
        Alumno alumno = new Alumno();
        dplEscritorio.add(alumno);
        alumno.setVisible(true);
    }//GEN-LAST:event_menuitemAlumnoActionPerformed

    private void menuitemMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemMateriasActionPerformed
        Materia materia = new Materia();
        dplEscritorio.add(materia);
        materia.setVisible(true);
    }//GEN-LAST:event_menuitemMateriasActionPerformed

    private void menuitemregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemregisActionPerformed
        Registro registro = new Registro();
        dplEscritorio.add(registro);
        registro.setVisible(true);
    }//GEN-LAST:event_menuitemregisActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Jmenu;
    private javax.swing.JDesktopPane dplEscritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenu_Alumno;
    private javax.swing.JMenu jMenu_Materias;
    private javax.swing.JMenu jMenu_Salir;
    private javax.swing.JMenuItem menuitemAlumno;
    private javax.swing.JMenuItem menuitemMaterias;
    private javax.swing.JMenu menuitemRegistro;
    private javax.swing.JMenuItem menuitemregis;
    // End of variables declaration//GEN-END:variables

    
}
