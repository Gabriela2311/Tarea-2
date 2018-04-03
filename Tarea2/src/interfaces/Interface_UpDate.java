

package interfaces;

import domain.Car;
import file.CarFile;
import java.io.IOException;


public class Interface_UpDate extends javax.swing.JFrame {

    Interfaces in_prin = new Interfaces();
    Interfaces_InsertCar in_car = new Interfaces_InsertCar();
    int serie;
    
    public Interface_UpDate() {
        initComponents();
        btn_Update.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_title = new javax.swing.JLabel();
        txf_SearchUpDate = new javax.swing.JTextField();
        lb_serieUpDate = new javax.swing.JLabel();
        btn_SearchUp = new javax.swing.JButton();
        lb_namebrand = new javax.swing.JLabel();
        lb_year = new javax.swing.JLabel();
        lb_AmericanUpdate = new javax.swing.JLabel();
        txf_yearUpdate = new javax.swing.JTextField();
        txf_nameBrand = new javax.swing.JTextField();
        cBx_American = new javax.swing.JComboBox<>();
        btn_Update = new javax.swing.JButton();
        btn_exitUpdate = new javax.swing.JButton();
        btn_backUp = new javax.swing.JButton();
        lb_message = new javax.swing.JLabel();
        lb_backgroundUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_title.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_update_3x.png"))); // NOI18N
        lb_title.setText("Actulizar Información del Vehículo");
        getContentPane().add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txf_SearchUpDate.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        getContentPane().add(txf_SearchUpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 260, 20));

        lb_serieUpDate.setBackground(new java.awt.Color(255, 255, 255));
        lb_serieUpDate.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        lb_serieUpDate.setForeground(new java.awt.Color(255, 255, 255));
        lb_serieUpDate.setText("Serie : ");
        getContentPane().add(lb_serieUpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 40));

        btn_SearchUp.setBackground(new java.awt.Color(114, 184, 243));
        btn_SearchUp.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_SearchUp.setForeground(new java.awt.Color(255, 255, 255));
        btn_SearchUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_search.png"))); // NOI18N
        btn_SearchUp.setText("Buscar");
        btn_SearchUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchUpActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SearchUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 100, 30));

        lb_namebrand.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb_namebrand.setForeground(new java.awt.Color(255, 255, 255));
        lb_namebrand.setText("Nombre:");
        getContentPane().add(lb_namebrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, 20));

        lb_year.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb_year.setForeground(new java.awt.Color(255, 255, 255));
        lb_year.setText("Año:");
        getContentPane().add(lb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        lb_AmericanUpdate.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb_AmericanUpdate.setForeground(new java.awt.Color(255, 255, 255));
        lb_AmericanUpdate.setText("Americano:");
        getContentPane().add(lb_AmericanUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 20));

        txf_yearUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_yearUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(txf_yearUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 260, -1));
        getContentPane().add(txf_nameBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, -1));

        cBx_American.setBackground(new java.awt.Color(114, 184, 243));
        cBx_American.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        cBx_American.setForeground(new java.awt.Color(255, 255, 255));
        cBx_American.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        cBx_American.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBx_AmericanActionPerformed(evt);
            }
        });
        getContentPane().add(cBx_American, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 50, -1));

        btn_Update.setBackground(new java.awt.Color(114, 184, 243));
        btn_Update.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_done_all.png"))); // NOI18N
        btn_Update.setText("Actualizar");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        btn_exitUpdate.setBackground(new java.awt.Color(114, 184, 243));
        btn_exitUpdate.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_exitUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btn_exitUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_exit_to_app.png"))); // NOI18N
        btn_exitUpdate.setText("Salir");
        btn_exitUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exitUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 100, -1));

        btn_backUp.setBackground(new java.awt.Color(114, 184, 243));
        btn_backUp.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_backUp.setForeground(new java.awt.Color(255, 255, 255));
        btn_backUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_keyboard_return.png"))); // NOI18N
        btn_backUp.setText("Volver");
        btn_backUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backUpActionPerformed(evt);
            }
        });
        getContentPane().add(btn_backUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 100, -1));

        lb_message.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_message.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lb_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 620, 30));

        lb_backgroundUp.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        lb_backgroundUp.setForeground(new java.awt.Color(255, 255, 255));
        lb_backgroundUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(lb_backgroundUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        
        String name = txf_nameBrand.getText();
        int year = Integer.parseInt(txf_yearUpdate.getText());
        boolean ameri = this.cBx_American.getSelectedItem().toString().equals("SI");

        try {
            try {
                CarFile new_carFile = new CarFile(in_car.file);
                new_carFile.Update(Integer.parseInt(String.format("%05d", serie)), name, year, ameri);
                lb_message.setText("El vehiculo con la serie: " + (String.format("%05d", serie)) + " se actualizó.");
            } catch (IOException ioe) {
                System.out.println("Error File, btn_UpdateActionPerformed");
//                lb_message.setText("No se encontro ningun registro con la serie: " + (String.format("%05d", serie))  + ".");

            }

        } catch (NumberFormatException nfe) {
            System.out.println("Error en llenar");
            lb_message.setText("Error al ingresar los datos.");

        }// fin del catch
        
        txf_nameBrand.setText("");
        txf_yearUpdate.setText("");
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_SearchUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchUpActionPerformed
              
         serie = Integer.parseInt(txf_SearchUpDate.getText());

        try {
            try {
                CarFile new_carFile = new CarFile(in_car.file);
                if (new_carFile.inPutSerie(serie)) {
                    lb_message.setText("El vehiculo con la serie: " + (String.format("%05d", serie)) + " puede actualizarse.");
                    Car car = new Car();
                    CarFile cF = new CarFile(in_car.file);
                    car = cF.getBySerie(serie);
                    txf_nameBrand.setText(car.getName());
                    txf_yearUpdate.setText(car.getYear() + "");
                    if (car.isAmerican()) {
                        cBx_American.setSelectedIndex(0);
                    } else {
                        cBx_American.setSelectedIndex(1);
                    }
                btn_Update.setEnabled(true);
                } else {
                    lb_message.setText("No se encontro ningun registro con la serie: " + (String.format("%05d", serie)) + ".");
                    btn_Update.setEnabled(false);
                }
            } catch (IOException ioe) {
                System.out.println("Error File, btn_SearchUpActionPerformed");

            }

        } catch (NumberFormatException nfe) {
            System.out.println("Error en llenar");
            lb_message.setText("Error al ingresar los datos.");

        }
        txf_SearchUpDate.setText("");
    }//GEN-LAST:event_btn_SearchUpActionPerformed

    private void btn_exitUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitUpdateActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitUpdateActionPerformed

    private void btn_backUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backUpActionPerformed
        // TODO add your handling code here:
        in_prin.setVisible(true);
        in_prin.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backUpActionPerformed

    private void txf_yearUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_yearUpdateActionPerformed

    }//GEN-LAST:event_txf_yearUpdateActionPerformed

    private void cBx_AmericanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBx_AmericanActionPerformed

    }//GEN-LAST:event_cBx_AmericanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_UpDate().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SearchUp;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_backUp;
    private javax.swing.JButton btn_exitUpdate;
    private javax.swing.JComboBox<String> cBx_American;
    private javax.swing.JLabel lb_AmericanUpdate;
    private javax.swing.JLabel lb_backgroundUp;
    private javax.swing.JLabel lb_message;
    private javax.swing.JLabel lb_namebrand;
    private javax.swing.JLabel lb_serieUpDate;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_year;
    private javax.swing.JTextField txf_SearchUpDate;
    private javax.swing.JTextField txf_nameBrand;
    private javax.swing.JTextField txf_yearUpdate;
    // End of variables declaration//GEN-END:variables
}
