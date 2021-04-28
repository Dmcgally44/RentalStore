package com.my.rentalstore;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StoreCustomerAdd extends javax.swing.JFrame {

    RentalStoreDatabase db; 
    int update = 0;
    
    public StoreCustomerAdd(RentalStoreDatabase db) {
        initComponents();
        this.db = db;
        this.setSize(745,380);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WorkerAddCustomer = new javax.swing.JPanel();
        WorkerAddCustomerTitle = new javax.swing.JLabel();
        WorkerAddCustomerNameTitle = new javax.swing.JLabel();
        WorkerAddCustomerDescriptionTitle = new javax.swing.JLabel();
        WorkerAddCustomerBrandTitle = new javax.swing.JLabel();
        WorkerAddCustomerColourTitle = new javax.swing.JLabel();
        WorkerAddCustomerName = new javax.swing.JTextField();
        WorkerAddCustomerContact = new javax.swing.JTextField();
        WorkerAddCustomerAddress = new javax.swing.JTextField();
        WorkerAddCustomerUsername = new javax.swing.JTextField();
        WorkerAddCustomerCancel = new javax.swing.JButton();
        WorkerAddCustomerSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        WorkerAddCustomer.setLayout(null);

        WorkerAddCustomerTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        WorkerAddCustomerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorkerAddCustomerTitle.setText("Add Customer Form");
        WorkerAddCustomer.add(WorkerAddCustomerTitle);
        WorkerAddCustomerTitle.setBounds(0, 0, 740, 60);

        WorkerAddCustomerNameTitle.setText("Customer Name :");
        WorkerAddCustomer.add(WorkerAddCustomerNameTitle);
        WorkerAddCustomerNameTitle.setBounds(200, 120, 120, 20);

        WorkerAddCustomerDescriptionTitle.setText("Customer Contact :");
        WorkerAddCustomer.add(WorkerAddCustomerDescriptionTitle);
        WorkerAddCustomerDescriptionTitle.setBounds(200, 160, 120, 20);

        WorkerAddCustomerBrandTitle.setText("Customer Address :");
        WorkerAddCustomer.add(WorkerAddCustomerBrandTitle);
        WorkerAddCustomerBrandTitle.setBounds(200, 200, 130, 20);

        WorkerAddCustomerColourTitle.setText("UserName (Unique) :");
        WorkerAddCustomer.add(WorkerAddCustomerColourTitle);
        WorkerAddCustomerColourTitle.setBounds(200, 240, 130, 20);
        WorkerAddCustomer.add(WorkerAddCustomerName);
        WorkerAddCustomerName.setBounds(340, 110, 230, 30);
        WorkerAddCustomer.add(WorkerAddCustomerContact);
        WorkerAddCustomerContact.setBounds(340, 150, 230, 30);
        WorkerAddCustomer.add(WorkerAddCustomerAddress);
        WorkerAddCustomerAddress.setBounds(340, 190, 230, 30);

        WorkerAddCustomerUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerAddCustomerUsernameActionPerformed(evt);
            }
        });
        WorkerAddCustomer.add(WorkerAddCustomerUsername);
        WorkerAddCustomerUsername.setBounds(340, 230, 230, 30);

        WorkerAddCustomerCancel.setText("Cancel");
        WorkerAddCustomerCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerAddCustomerCancelActionPerformed(evt);
            }
        });
        WorkerAddCustomer.add(WorkerAddCustomerCancel);
        WorkerAddCustomerCancel.setBounds(460, 270, 100, 30);

        WorkerAddCustomerSave.setText("Save");
        WorkerAddCustomerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerAddCustomerSaveActionPerformed(evt);
            }
        });
        WorkerAddCustomer.add(WorkerAddCustomerSave);
        WorkerAddCustomerSave.setBounds(340, 270, 100, 30);

        getContentPane().add(WorkerAddCustomer);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WorkerAddCustomerUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerAddCustomerUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkerAddCustomerUsernameActionPerformed

    private void WorkerAddCustomerCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerAddCustomerCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_WorkerAddCustomerCancelActionPerformed

    private void WorkerAddCustomerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerAddCustomerSaveActionPerformed
    if(WorkerAddCustomerName.getText().equals("") || WorkerAddCustomerContact.getText().equals("") || WorkerAddCustomerAddress.getText().equals("") || WorkerAddCustomerUsername.getText().equals("")){
        eM("Fields Cannot be empty!");
    }else{
        try {
            int status = db.WorkerAddCustomer(WorkerAddCustomerName.getText(), WorkerAddCustomerContact.getText(), WorkerAddCustomerAddress.getText(), WorkerAddCustomerUsername.getText(), "admin123");
            if(status == 0){
                iM("Item inserted successfuly!");
                update = 1;
                this.dispose();                
            }else{
                eM("User already exists!");
            }
            
        } catch (Exception ex) {
            eM("Invalid Stock/Price amount");
        }
    }   
    }//GEN-LAST:event_WorkerAddCustomerSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WorkerAddCustomer;
    private javax.swing.JTextField WorkerAddCustomerAddress;
    private javax.swing.JLabel WorkerAddCustomerBrandTitle;
    private javax.swing.JButton WorkerAddCustomerCancel;
    private javax.swing.JLabel WorkerAddCustomerColourTitle;
    private javax.swing.JTextField WorkerAddCustomerContact;
    private javax.swing.JLabel WorkerAddCustomerDescriptionTitle;
    private javax.swing.JTextField WorkerAddCustomerName;
    private javax.swing.JLabel WorkerAddCustomerNameTitle;
    private javax.swing.JButton WorkerAddCustomerSave;
    private javax.swing.JLabel WorkerAddCustomerTitle;
    private javax.swing.JTextField WorkerAddCustomerUsername;
    // End of variables declaration//GEN-END:variables
public void eM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.ERROR_MESSAGE);    
}   
public void iM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.INFORMATION_MESSAGE);    
}   
}
