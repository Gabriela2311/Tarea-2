package interfaces;

import domain.Car;
import file.CarFile;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Interfaces_InsertCar extends javax.swing.JFrame {

   
    Interfaces in_prin = new Interfaces();
    File file = new File("./car.dat");
    int serie;

    public Interfaces_InsertCar(){
        initComponents();
        this.setLocationRelativeTo(null);
        lb_error.setVisible(false);
    }
            
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_nameBrand = new javax.swing.JLabel();
        lb_year = new javax.swing.JLabel();
        txf_nameBrand = new javax.swing.JTextField();
        lb_Kilometer = new javax.swing.JLabel();
        txf_year = new javax.swing.JTextField();
        txf_kilometer = new javax.swing.JTextField();
        lb_american = new javax.swing.JLabel();
        cBx_American = new javax.swing.JComboBox<>();
        lb_serie = new javax.swing.JLabel();
        txf_serie = new javax.swing.JTextField();
        btn_addCar = new javax.swing.JButton();
        btn_exitCar = new javax.swing.JButton();
        btn_backCar = new javax.swing.JButton();
        lb_title = new javax.swing.JLabel();
        lb_error = new javax.swing.JLabel();
        lb_addImage = new javax.swing.JLabel();
        lb_background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_nameBrand.setBackground(new java.awt.Color(255, 255, 255));
        lb_nameBrand.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lb_nameBrand.setForeground(new java.awt.Color(255, 255, 255));
        lb_nameBrand.setText("Marca:");
        getContentPane().add(lb_nameBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lb_year.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lb_year.setForeground(new java.awt.Color(255, 255, 255));
        lb_year.setText("Año:");
        getContentPane().add(lb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 40, -1));

        txf_nameBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nameBrandActionPerformed(evt);
            }
        });
        getContentPane().add(txf_nameBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 230, -1));

        lb_Kilometer.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lb_Kilometer.setForeground(new java.awt.Color(255, 255, 255));
        lb_Kilometer.setText("Kilometraje:");
        getContentPane().add(lb_Kilometer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txf_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_yearActionPerformed(evt);
            }
        });
        getContentPane().add(txf_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 230, -1));

        txf_kilometer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_kilometerActionPerformed(evt);
            }
        });
        getContentPane().add(txf_kilometer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 230, -1));

        lb_american.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lb_american.setForeground(new java.awt.Color(255, 255, 255));
        lb_american.setText("Americano:");
        getContentPane().add(lb_american, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        cBx_American.setBackground(new java.awt.Color(114, 184, 243));
        cBx_American.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        cBx_American.setForeground(new java.awt.Color(255, 255, 255));
        cBx_American.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        cBx_American.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBx_AmericanActionPerformed(evt);
            }
        });
        getContentPane().add(cBx_American, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        lb_serie.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lb_serie.setForeground(new java.awt.Color(255, 255, 255));
        lb_serie.setText("Serie:");
        getContentPane().add(lb_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        txf_serie.setEditable(false);
        txf_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_serieActionPerformed(evt);
            }
        });
        getContentPane().add(txf_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 230, -1));

        btn_addCar.setBackground(new java.awt.Color(114, 184, 243));
        btn_addCar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_addCar.setForeground(new java.awt.Color(255, 255, 255));
        btn_addCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_done_all.png"))); // NOI18N
        btn_addCar.setText("Añadir");
        btn_addCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 110, -1));

        btn_exitCar.setBackground(new java.awt.Color(114, 184, 243));
        btn_exitCar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_exitCar.setForeground(new java.awt.Color(255, 255, 255));
        btn_exitCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_exit_to_app.png"))); // NOI18N
        btn_exitCar.setText("Salir");
        btn_exitCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitCarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exitCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, -1));

        btn_backCar.setBackground(new java.awt.Color(114, 184, 243));
        btn_backCar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_backCar.setForeground(new java.awt.Color(255, 255, 255));
        btn_backCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_keyboard_return.png"))); // NOI18N
        btn_backCar.setText("Volver");
        btn_backCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backCarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_backCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 100, -1));

        lb_title.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("Insertar Vehículo");
        getContentPane().add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        lb_error.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_error.setForeground(new java.awt.Color(255, 51, 51));
        lb_error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_error_outline.png"))); // NOI18N
        lb_error.setText("Error al Llenar");
        getContentPane().add(lb_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        lb_addImage.setForeground(new java.awt.Color(255, 255, 255));
        lb_addImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_add_to_queue_3x.png"))); // NOI18N
        getContentPane().add(lb_addImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -10, 90, 100));

        lb_background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(lb_background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_serieActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txf_serieActionPerformed

    private void btn_addCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCarActionPerformed

        try {
            try {
                //Crea el archivo .dat
                CarFile new_carFile = new CarFile(file);
                
                //insertar datos en nuevas variables
                int serie = new_carFile.OutPutSerie();
                String name = txf_nameBrand.getText();
                int year = Integer.parseInt(txf_year.getText());
                float kilometer = Float.valueOf(txf_kilometer.getText());
                boolean americano = this.cBx_American.getSelectedItem().toString().equals("SI");
                
                //insertar los datos capturados
                Car new_car = new Car(name, year, kilometer, americano, serie);
                new_carFile.addEndCar(new_car);
                
                //Limpiar campos
                lb_error.setVisible(false);
                txf_year.setText("");
                txf_serie.setText(""+ String.format("%05d", serie));
                txf_nameBrand.setText("");
                txf_kilometer.setText("");
        
             }
            catch(IOException ioe){
               System.out.println("Error File");
        
        }
             
        }
        catch(NumberFormatException nfe){
            System.out.println("Error en llenar");
            lb_error.setVisible(true);
        }


    }//GEN-LAST:event_btn_addCarActionPerformed

    private void txf_kilometerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_kilometerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_kilometerActionPerformed

    private void txf_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_yearActionPerformed

    private void txf_nameBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nameBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nameBrandActionPerformed

    private void btn_exitCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitCarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitCarActionPerformed

    private void btn_backCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backCarActionPerformed
        // TODO add your handling code here:
        in_prin.setVisible(true);
        in_prin.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backCarActionPerformed

    private void cBx_AmericanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBx_AmericanActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cBx_AmericanActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaces_InsertCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaces_InsertCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaces_InsertCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaces_InsertCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaces_InsertCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCar;
    private javax.swing.JButton btn_backCar;
    private javax.swing.JButton btn_exitCar;
    private javax.swing.JComboBox<String> cBx_American;
    private javax.swing.JLabel lb_Kilometer;
    private javax.swing.JLabel lb_addImage;
    private javax.swing.JLabel lb_american;
    private javax.swing.JLabel lb_background2;
    private javax.swing.JLabel lb_error;
    private javax.swing.JLabel lb_nameBrand;
    private javax.swing.JLabel lb_serie;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_year;
    private javax.swing.JTextField txf_kilometer;
    private javax.swing.JTextField txf_nameBrand;
    private javax.swing.JTextField txf_serie;
    private javax.swing.JTextField txf_year;
    // End of variables declaration//GEN-END:variables
}
