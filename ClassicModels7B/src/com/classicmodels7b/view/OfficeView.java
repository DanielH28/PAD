/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.view;

import com.classicmodels7b.controller.OfficesController;
import javax.sql.RowSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielH
 */
public class OfficeView extends javax.swing.JFrame {

    /**
     * Creates new form OfficeView
     */
    
    OfficesController officeController = new OfficesController();
            
    public OfficeView() {
        initComponents();
        
        officeController.readOffices(jTableOffices);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtOfficeCode = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddresLine1 = new javax.swing.JTextField();
        txtAddresLine2 = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtPostalCode = new javax.swing.JTextField();
        txtTerritory = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOffices = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel1.setText("OFFICES");

        jLabel2.setText("Office Code:");

        jLabel3.setText("City:");

        jLabel4.setText("Phone:");

        jLabel5.setText("Adddres Line 1:");

        jLabel6.setText("Addres Line 2:");

        jLabel7.setText("State:");

        jLabel8.setText("Country:");

        jLabel9.setText("Postal Code:");

        jLabel10.setText("Territory:");

        txtOfficeCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfficeCodeActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtPostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostalCodeActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTableOffices.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableOffices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOfficesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOffices);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(txtOfficeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddresLine1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddresLine2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPostalCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTerritory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtOfficeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAddresLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtAddresLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTerritory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtPostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPostalCodeActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        officeController.readOffices(jTableOffices);
        
        String officeCode= txtOfficeCode.getText();
        String city = txtCity.getText();
        String phone = txtPhone.getText();
        String addressLine1 = txtAddresLine1.getText();
        String addressLine2 = txtAddresLine2.getText();
        String state = txtState.getText();
        String country = txtCountry.getText();
        String postalCode = txtPostalCode.getText();
        String territory = txtTerritory.getText();
        
        if (txtOfficeCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in OfficeCode " );
        }
            
        if (txtCity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in City" );
         }if (txtPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in Phone" );
        }
        if (txtAddresLine1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in Address Line1" );
        }
        if (txtAddresLine2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in Address Line2" );
        }
        if (txtState.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in Satate" );
        }
        if (txtCountry.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in Country" );
        }
        if (txtPostalCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in Postal Code" );
        }
        if (txtTerritory.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in Territory" );
        }
         
        boolean[] campo = new boolean[9];
        boolean r = false;
        campo[0]= txtOfficeCode.getText().isEmpty();
        campo[1]= txtCity.getText().isEmpty();
        campo[2]= txtAddresLine1.getText().isEmpty();
        campo[3]= txtAddresLine2.getText().isEmpty();
        campo[4] = txtPhone.getText().isEmpty();
        campo[5] = txtState.getText().isEmpty();
        campo[6] = txtCountry.getText().isEmpty();
        campo[7] = txtPostalCode.getText().isEmpty();
        campo[8] = txtTerritory.getText().isEmpty();
        if (campo[0] || campo[1] ||campo[2]||campo[3]||campo[4]||campo[5]||campo[6]||campo[7]||campo[8]){
            r=true;
            JOptionPane.showMessageDialog(null,"Hay campos vacios, no se puede realizar el llenado" );
            
        }else{
            String serverAnswer = officeController.createOffice(officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory);
        JOptionPane.showMessageDialog(null, serverAnswer);
            r=false;
            JOptionPane.showMessageDialog(null,"Hay campos llenos" );
             
        
        }
        
        officeController.readOffices(jTableOffices);
                
      
        
        
        
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtOfficeCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfficeCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOfficeCodeActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_btnReadActionPerformed

    private void jTableOfficesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOfficesMouseClicked
        // TODO add your handling code here:
        
        int row = jTableOffices.getSelectedRow();
        txtOfficeCode.setText(jTableOffices.getValueAt(row, 0).toString());
        txtCity.setText(jTableOffices.getValueAt(row, 1).toString());
        txtPhone.setText(jTableOffices.getValueAt(row, 2).toString());
        txtAddresLine1.setText(jTableOffices.getValueAt(row, 3).toString());
        txtAddresLine2.setText(jTableOffices.getValueAt(row, 4).toString());
        txtState.setText(jTableOffices.getValueAt(row, 5).toString());
        txtCountry.setText(jTableOffices.getValueAt(row, 6).toString());
        txtPostalCode.setText(jTableOffices.getValueAt(row, 7).toString());
        txtTerritory.setText(jTableOffices.getValueAt(row, 8).toString());
        
    }//GEN-LAST:event_jTableOfficesMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        officeController.deleteOffice(txtOfficeCode.getText());
       if (txtOfficeCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"There is no text in Office Code" );
         }else{
            String serverAnswer = officeController.deleteOffice(txtOfficeCode.getText());
        JOptionPane.showMessageDialog(null, serverAnswer);
            
            JOptionPane.showMessageDialog(null,"Se ha eliminado el registro" );
             officeController.readOffices(jTableOffices);
        
       }   // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       String officeCode= txtOfficeCode.getText();
        String city = txtCity.getText();
        String phone = txtPhone.getText();
        String addressLine1 = txtAddresLine1.getText();
        String addressLine2 = txtAddresLine2.getText();
        String state = txtState.getText();
        String country = txtCountry.getText();
        String postalCode = txtPostalCode.getText();
        String territory = txtTerritory.getText();
       String serverAnswer = officeController.updateOffice(txtOfficeCode.getText(), txtCity.getText(), txtPhone.getText(), txtAddresLine1.getText(), txtAddresLine2.getText(), txtState.getText(), txtCountry.getText(), txtPostalCode.getText(), txtTerritory.getText()); // TODO add your handling code here:
      JOptionPane.showMessageDialog(null, serverAnswer);
      officeController.readOffices(jTableOffices);
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(OfficeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOffices;
    private javax.swing.JTextField txtAddresLine1;
    private javax.swing.JTextField txtAddresLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtOfficeCode;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPostalCode;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTerritory;
    // End of variables declaration//GEN-END:variables
}
