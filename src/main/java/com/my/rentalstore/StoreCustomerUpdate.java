package com.my.rentalstore;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StoreCustomerUpdate extends javax.swing.JFrame {
    
    RentalStoreDatabase db;
    StoreCustomer customer;
    int update = 0;
    
    public StoreCustomerUpdate(RentalStoreDatabase db, StoreCustomer customer) {
        initComponents();
        this.db = db; 
        this.customer = customer;
        this.setSize(745,380);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setCustomerToForm();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WorkerUpdateCustomer = new javax.swing.JPanel();
        WorkerUpdateCustomerTitle = new javax.swing.JLabel();
        WorkerUpdateCustomerNameTitle = new javax.swing.JLabel();
        WorkerUpdateCustomerContactTitle = new javax.swing.JLabel();
        WorkerUpdateCustomerAddressTitle = new javax.swing.JLabel();
        WorkerUpdateCustomerUsernameTitle = new javax.swing.JLabel();
        WorkerUpdateCustomerName = new javax.swing.JTextField();
        WorkerUpdateCustomerContact = new javax.swing.JTextField();
        WorkerUpdateCustomerAddress = new javax.swing.JTextField();
        WorkerUpdateCustomerUsername = new javax.swing.JTextField();
        WorkerUpdateCustomerCancel = new javax.swing.JButton();
        WorkerUpdateCustomerSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        WorkerUpdateCustomer.setLayout(null);

        WorkerUpdateCustomerTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        WorkerUpdateCustomerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorkerUpdateCustomerTitle.setText("Update Customer Form");
        WorkerUpdateCustomer.add(WorkerUpdateCustomerTitle);
        WorkerUpdateCustomerTitle.setBounds(0, 0, 740, 60);

        WorkerUpdateCustomerNameTitle.setText("Customer Name :");
        WorkerUpdateCustomer.add(WorkerUpdateCustomerNameTitle);
        WorkerUpdateCustomerNameTitle.setBounds(200, 120, 120, 20);

        WorkerUpdateCustomerContactTitle.setText("Customer Contact :");
        WorkerUpdateCustomer.add(WorkerUpdateCustomerContactTitle);
        WorkerUpdateCustomerContactTitle.setBounds(200, 160, 120, 20);

        WorkerUpdateCustomerAddressTitle.setText("Customer Address :");
        WorkerUpdateCustomer.add(WorkerUpdateCustomerAddressTitle);
        WorkerUpdateCustomerAddressTitle.setBounds(200, 200, 130, 20);

        WorkerUpdateCustomerUsernameTitle.setText("UserName (Unique) :");
        WorkerUpdateCustomer.add(WorkerUpdateCustomerUsernameTitle);
        WorkerUpdateCustomerUsernameTitle.setBounds(200, 240, 130, 20);
        WorkerUpdateCustomer.add(WorkerUpdateCustomerName);
        WorkerUpdateCustomerName.setBounds(340, 110, 320, 30);
        WorkerUpdateCustomer.add(WorkerUpdateCustomerContact);
        WorkerUpdateCustomerContact.setBounds(340, 150, 320, 30);
        WorkerUpdateCustomer.add(WorkerUpdateCustomerAddress);
        WorkerUpdateCustomerAddress.setBounds(340, 190, 320, 30);

        WorkerUpdateCustomerUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerUpdateCustomerUsernameActionPerformed(evt);
            }
        });
        WorkerUpdateCustomer.add(WorkerUpdateCustomerUsername);
        WorkerUpdateCustomerUsername.setBounds(340, 230, 320, 30);

        WorkerUpdateCustomerCancel.setText("Cancel");
        WorkerUpdateCustomerCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerUpdateCustomerCancelActionPerformed(evt);
            }
        });
        WorkerUpdateCustomer.add(WorkerUpdateCustomerCancel);
        WorkerUpdateCustomerCancel.setBounds(450, 270, 100, 30);

        WorkerUpdateCustomerSave.setText("Save");
        WorkerUpdateCustomerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerUpdateCustomerSaveActionPerformed(evt);
            }
        });
        WorkerUpdateCustomer.add(WorkerUpdateCustomerSave);
        WorkerUpdateCustomerSave.setBounds(340, 270, 100, 30);

        getContentPane().add(WorkerUpdateCustomer);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WorkerUpdateCustomerUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerUpdateCustomerUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkerUpdateCustomerUsernameActionPerformed

    private void WorkerUpdateCustomerCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerUpdateCustomerCancelActionPerformed
       this.dispose();
    }//GEN-LAST:event_WorkerUpdateCustomerCancelActionPerformed

    private void WorkerUpdateCustomerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerUpdateCustomerSaveActionPerformed
    if(WorkerUpdateCustomerName.getText().equals("") || WorkerUpdateCustomerContact.getText().equals("") || WorkerUpdateCustomerAddress.getText().equals("") || WorkerUpdateCustomerUsername.getText().equals("")){
        eM("Fields Cannot be empty!");
    }else{
        try {
            db.WorkerUpdateCustomer(customer.getCustomerId(), WorkerUpdateCustomerName.getText(), WorkerUpdateCustomerContact.getText(), WorkerUpdateCustomerAddress.getText(), WorkerUpdateCustomerUsername.getText());
            iM("Customer updated successfuly!");
            update = 1;
        } catch (Exception ex) {
            eM("Invalid details!");
        }
    }   
    }//GEN-LAST:event_WorkerUpdateCustomerSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WorkerUpdateCustomer;
    private javax.swing.JTextField WorkerUpdateCustomerAddress;
    private javax.swing.JLabel WorkerUpdateCustomerAddressTitle;
    private javax.swing.JButton WorkerUpdateCustomerCancel;
    private javax.swing.JTextField WorkerUpdateCustomerContact;
    private javax.swing.JLabel WorkerUpdateCustomerContactTitle;
    private javax.swing.JTextField WorkerUpdateCustomerName;
    private javax.swing.JLabel WorkerUpdateCustomerNameTitle;
    private javax.swing.JButton WorkerUpdateCustomerSave;
    private javax.swing.JLabel WorkerUpdateCustomerTitle;
    private javax.swing.JTextField WorkerUpdateCustomerUsername;
    private javax.swing.JLabel WorkerUpdateCustomerUsernameTitle;
    // End of variables declaration//GEN-END:variables

public void setCustomerToForm(){
    WorkerUpdateCustomerAddress.setText(customer.getCustomerAddress());
    WorkerUpdateCustomerUsername.setText(customer.getCustomerUsername());
    WorkerUpdateCustomerContact.setText(customer.getCustomerContact());
    WorkerUpdateCustomerName.setText(customer.getCustomerName());  
}
public void eM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.ERROR_MESSAGE);    
}   
public void iM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.INFORMATION_MESSAGE);    
}   
}
