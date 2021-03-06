/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.MasterModbas;

import de.re.easymodbus.modbusclient.*;
import java.io.IOException;

/**
 *
 * @author dugen
 */
public class MasterModbus extends javax.swing.JFrame {

    private ModbusClient modbusClient;
    
    /**
     * Creates new form MasterModbus
     */
    public MasterModbus() {
        initComponents();
        modbusClient = new ModbusClient(); 
        jLabel1.setEnabled(false);
        jLabel2.setEnabled(false);
        ipField.setText("127.0.0.1");
        portField.setText("1522");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        ipField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("Output One");
        jToggleButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton1ItemStateChanged(evt);
            }
        });

        jToggleButton2.setText("Output Two");
        jToggleButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton2ItemStateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/MasterModbas/Icons/Green.jpg"))); // NOI18N
        jLabel1.setText("Input One");
        jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/my/MasterModbas/Icons/Red.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/MasterModbas/Icons/Green.jpg"))); // NOI18N
        jLabel2.setText("Input Two");
        jLabel2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/my/MasterModbas/Icons/Red.jpg"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setText("MASTER");

        jToggleButton3.setText("CONNECT");
        jToggleButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton3ItemStateChanged(evt);
            }
        });

        ipField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        portField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("IP");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("PORT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 44, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton2)
                                    .addComponent(jToggleButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ipField, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                        .addComponent(portField)))))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jToggleButton3)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton1ItemStateChanged
        MasterFunc.setunsetCoil(modbusClient, 2, jToggleButton1.isSelected());
    }//GEN-LAST:event_jToggleButton1ItemStateChanged

    private void jToggleButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton2ItemStateChanged
        MasterFunc.setunsetCoil(modbusClient, 3, jToggleButton2.isSelected());
    }//GEN-LAST:event_jToggleButton2ItemStateChanged

    private void jToggleButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton3ItemStateChanged
        Runnable r = ()->{
            while(jToggleButton3.isSelected()){
                try{
                    boolean[] serverResponse = modbusClient.ReadCoils(0, 2);
//                    for (int i = 0; i < serverResponse.length; i++)
//                        System.out.println(serverResponse[i]);   

                    if(serverResponse[0]){jLabel1.setEnabled(true);}
                    else{jLabel1.setEnabled(false);}

                    if(serverResponse[1]){jLabel2.setEnabled(true);}
                    else{jLabel2.setEnabled(false);}

                    Thread.sleep(1000);
                }
                catch (Exception e){}          
            }
        };
        Thread myThread = new Thread(r,"MyThread");
        
        if(jToggleButton3.isSelected()){
            jToggleButton3.setText("DISCONNECT");            

            try{
                MasterFunc.setup(modbusClient, ipField.getText(), portField.getText());
                MasterFunc.connect(modbusClient);
                myThread.start(); 
            }
            catch(Exception e){
                System.out.println(e.getMessage());            
            }                         
        }     
        else{
            jToggleButton3.setText("CONNECT");
            try{
                myThread.interrupt();
                MasterFunc.disconnect(modbusClient);
            }
            catch(Exception e){
                System.out.println(e.getMessage());            
            }
        }
    }//GEN-LAST:event_jToggleButton3ItemStateChanged

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
            java.util.logging.Logger.getLogger(MasterModbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterModbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterModbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterModbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterModbus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ipField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTextField portField;
    // End of variables declaration//GEN-END:variables
}
