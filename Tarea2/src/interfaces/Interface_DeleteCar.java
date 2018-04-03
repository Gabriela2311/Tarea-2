package interfaces;

import file.CarFile;
import java.io.File;
import java.io.IOException;

public class Interface_DeleteCar extends javax.swing.JFrame {

    Interfaces in_prin = new Interfaces();
    
    public Interface_DeleteCar() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titleDelete = new javax.swing.JLabel();
        lb_serie = new javax.swing.JLabel();
        btn_exitDelete = new javax.swing.JButton();
        btn_backDelete = new javax.swing.JButton();
        lb_message = new javax.swing.JLabel();
        btn_Delete = new javax.swing.JButton();
        txf_deleteSerie = new javax.swing.JTextField();
        lb_backgroundDelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titleDelete.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_titleDelete.setForeground(new java.awt.Color(255, 255, 255));
        lb_titleDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_delete_sweep_3x.png"))); // NOI18N
        lb_titleDelete.setText("Eliminar Información del Vehículo");
        getContentPane().add(lb_titleDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        lb_serie.setBackground(new java.awt.Color(255, 255, 255));
        lb_serie.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        lb_serie.setForeground(new java.awt.Color(255, 255, 255));
        lb_serie.setText("Serie : ");
        getContentPane().add(lb_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 40));

        btn_exitDelete.setBackground(new java.awt.Color(114, 184, 243));
        btn_exitDelete.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_exitDelete.setForeground(new java.awt.Color(255, 255, 255));
        btn_exitDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_exit_to_app.png"))); // NOI18N
        btn_exitDelete.setText("Salir");
        btn_exitDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exitDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, -1));

        btn_backDelete.setBackground(new java.awt.Color(114, 184, 243));
        btn_backDelete.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_backDelete.setForeground(new java.awt.Color(255, 255, 255));
        btn_backDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_keyboard_return.png"))); // NOI18N
        btn_backDelete.setText("Volver");
        btn_backDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_backDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 100, -1));

        lb_message.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_message.setForeground(new java.awt.Color(255, 255, 255));
        lb_message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_error_outline.png"))); // NOI18N
        lb_message.setText("Al borrar, no se recuperan los datos.");
        getContentPane().add(lb_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 610, 40));

        btn_Delete.setBackground(new java.awt.Color(114, 184, 243));
        btn_Delete.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_delete_forever.png"))); // NOI18N
        btn_Delete.setText("Borrar");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 100, 30));

        txf_deleteSerie.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        getContentPane().add(txf_deleteSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 260, 30));

        lb_backgroundDelete.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        lb_backgroundDelete.setForeground(new java.awt.Color(255, 255, 255));
        lb_backgroundDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(lb_backgroundDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitDeleteActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitDeleteActionPerformed

    private void btn_backDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backDeleteActionPerformed
        // TODO add your handling code here:
        in_prin.setVisible(true);
        in_prin.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backDeleteActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        File file = new File("./car.dat");
        
        try {
            try {
                
                int serie = Integer.parseInt(txf_deleteSerie.getText());
                CarFile new_carFile = new CarFile(file);
                if (new_carFile.DeleteCar(serie)==true) {
                    lb_message.setText("El vehiculo con la serie: " + (String.format("%05d", serie)) + " se ha borrado.");
                }else{
                    if (serie==0) {
                        lb_message.setText("Ningun registro termina con la serie: " + (String.format("%05d", serie)) + ".");
                    }else{
                        lb_message.setText("No se encontro ningun registro con la serie: " + (String.format("%05d", serie)) + ".");
                    }//Fin del else 2
                }//Fin del else 1
 
            }//Fin del try 2
            catch(IOException ioe){
                System.err.println("Error File");
            }//Fin del catch

        }//Fin del try 1
        catch(NumberFormatException nfe){
            System.err.println("Error en llenar");
            lb_message.setText("Error al ingresar los datos.");

        }//Fin del catch
    }//GEN-LAST:event_btn_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_DeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_DeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_DeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_DeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_DeleteCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_backDelete;
    private javax.swing.JButton btn_exitDelete;
    private javax.swing.JLabel lb_backgroundDelete;
    private javax.swing.JLabel lb_message;
    private javax.swing.JLabel lb_serie;
    private javax.swing.JLabel lb_titleDelete;
    private javax.swing.JTextField txf_deleteSerie;
    // End of variables declaration//GEN-END:variables
}
