package interfaces;

public class Interfaces extends javax.swing.JFrame {

    public Interfaces() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_insertCar = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_UpDate = new javax.swing.JButton();
        btn_deleteCar = new javax.swing.JButton();
        btn_Lista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_insertCar.setBackground(new java.awt.Color(114, 184, 243));
        btn_insertCar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_insertCar.setForeground(new java.awt.Color(255, 255, 255));
        btn_insertCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_note_add.png"))); // NOI18N
        btn_insertCar.setText("Insertar Vehículo");
        btn_insertCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertCarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insertCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 150, 40));

        btn_exit.setBackground(new java.awt.Color(114, 184, 243));
        btn_exit.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_exit_to_app.png"))); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 90, -1));

        btn_UpDate.setBackground(new java.awt.Color(114, 184, 243));
        btn_UpDate.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_UpDate.setForeground(new java.awt.Color(255, 255, 255));
        btn_UpDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_update.png"))); // NOI18N
        btn_UpDate.setText("   Actualizar");
        btn_UpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpDateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_UpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 150, 40));

        btn_deleteCar.setBackground(new java.awt.Color(114, 184, 243));
        btn_deleteCar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_deleteCar.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_delete_forever.png"))); // NOI18N
        btn_deleteCar.setText("Eliminar Vehículo");
        btn_deleteCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteCarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_deleteCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 150, 40));

        btn_Lista.setBackground(new java.awt.Color(114, 184, 243));
        btn_Lista.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_Lista.setForeground(new java.awt.Color(255, 255, 255));
        btn_Lista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_view_list.png"))); // NOI18N
        btn_Lista.setText("Lista  Vehículos ");
        btn_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 150, 40));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Almacen De Vehículos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        label_background.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        label_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(label_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 726, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_insertCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertCarActionPerformed
        // TODO add your handling code here:
        Interfaces_InsertCar interCar = new Interfaces_InsertCar();
        interCar.setVisible(true);
        interCar.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_insertCarActionPerformed

    private void btn_UpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpDateActionPerformed
        // TODO add your handling code here:
        Interface_UpDate interUp = new Interface_UpDate();
        interUp.setVisible(true);
        interUp.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_UpDateActionPerformed

    private void btn_deleteCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCarActionPerformed
        // TODO add your handling code here:
        Interface_DeleteCar interDelete = new Interface_DeleteCar();
        interDelete.setVisible(true);
        interDelete.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_deleteCarActionPerformed

    private void btn_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaActionPerformed
        // TODO add your handling code here:
        Interface_ListCar interList = new Interface_ListCar();
        interList.setVisible(true);
        interList.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ListaActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Lista;
    private javax.swing.JButton btn_UpDate;
    private javax.swing.JButton btn_deleteCar;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_insertCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_background;
    // End of variables declaration//GEN-END:variables
}
