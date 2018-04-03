package interfaces;

import domain.Car;
import file.CarFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Interface_ListCar extends javax.swing.JFrame {

    Interfaces in_prin = new Interfaces();
    ArrayList<Car> arrayListOfCars = new ArrayList<Car>();
    String listCars;

    public Interface_ListCar() {
        initComponents();
        File file = new File("./car.dat");

        arrayListOfCars = carsFromFile();
        listCars = carsFromArrayListOfCars();
        txA_display.setText(listCars);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_title = new javax.swing.JLabel();
        btn_exitList = new javax.swing.JButton();
        btn_backList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txA_display = new javax.swing.JTextArea();
        lb_backgroundList = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_title.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_view_list.png"))); // NOI18N
        lb_title.setText("     Lista de Vehículos");
        getContentPane().add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 260, -1));

        btn_exitList.setBackground(new java.awt.Color(114, 184, 243));
        btn_exitList.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_exitList.setForeground(new java.awt.Color(255, 255, 255));
        btn_exitList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_exit_to_app.png"))); // NOI18N
        btn_exitList.setText("Salir");
        btn_exitList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitListActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exitList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 100, -1));

        btn_backList.setBackground(new java.awt.Color(114, 184, 243));
        btn_backList.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btn_backList.setForeground(new java.awt.Color(255, 255, 255));
        btn_backList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_keyboard_return.png"))); // NOI18N
        btn_backList.setText("Volver");
        btn_backList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backListActionPerformed(evt);
            }
        });
        getContentPane().add(btn_backList, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 100, -1));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        txA_display.setEditable(false);
        txA_display.setColumns(20);
        txA_display.setRows(5);
        jScrollPane1.setViewportView(txA_display);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, 290));

        lb_backgroundList.setBackground(new java.awt.Color(114, 184, 243));
        lb_backgroundList.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        lb_backgroundList.setForeground(new java.awt.Color(255, 255, 255));
        lb_backgroundList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(lb_backgroundList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_exitListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitListActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitListActionPerformed

    private void btn_backListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backListActionPerformed
        // TODO add your handling code here:
        in_prin.setVisible(true);
        in_prin.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_ListCar().setVisible(true);
            }
        });
    }// Fin del static void main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backList;
    private javax.swing.JButton btn_exitList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_backgroundList;
    private javax.swing.JLabel lb_title;
    private javax.swing.JTextArea txA_display;
    // End of variables declaration//GEN-END:variables

    
        private ArrayList<Car> carsFromFile() {
        File file = new File("./car.dat");
        ArrayList<Car> arrayListOfCarsFromFile = new ArrayList<>();

        try {

            CarFile new_carFile = new CarFile(file);
            arrayListOfCarsFromFile = (ArrayList<Car>) new_carFile.getCarList();
        }//Fin del try
        catch (IOException ioe) {
            System.err.println("Error File "+ioe.getCause());

        }// fin del catch
        return arrayListOfCarsFromFile;
    }// fin de ArrayList<Car> carsFromFile

    private String carsFromArrayListOfCars() {
        String carsData = "";
        for (int i = 0; i < arrayListOfCars.size(); i++) {
            if (!arrayListOfCars.get(i).getName().equalsIgnoreCase("vehicle remove")) {
                carsData += arrayListOfCars.get(i) + "\n";
            }// Fin del if 
        }// fin del for
        return carsData;
    }// Fin del String carsFromArrayListOfCars 
    

}
