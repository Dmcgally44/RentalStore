package com.my.rentalstore;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ItemReturnManager extends javax.swing.JFrame {

    int itemId;
    String itemName;
    int rentId;
    int purchaseId;
    RentalStoreDatabase db;
    int update = 0;
    int itemStock;
    
    public ItemReturnManager(RentalStoreDatabase db, int itemId, String itemName, int rentId, int itemStock, int purchaseId) {
        initComponents();
        this.itemId = itemId;
        this.itemName = itemName;
        this.rentId = rentId;
        this.purchaseId = purchaseId;
        this.itemStock = itemStock;
        this.db = db;
        this.setSize(650, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);        
        showDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerReturnItem = new javax.swing.JPanel();
        CustomerReturnFormTitle = new javax.swing.JLabel();
        CustomerReturnItemIdTitle = new javax.swing.JLabel();
        CustomerReturnItemId = new javax.swing.JTextField();
        CustomerReturnItemNameTitle = new javax.swing.JLabel();
        CustomerReturnItemName = new javax.swing.JTextField();
        CustomerReturnIdTitle = new javax.swing.JLabel();
        CustomerReturnId = new javax.swing.JTextField();
        CustomerReturnButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        CustomerReturnItem.setLayout(null);

        CustomerReturnFormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CustomerReturnFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerReturnFormTitle.setText("Return Item Form");
        CustomerReturnItem.add(CustomerReturnFormTitle);
        CustomerReturnFormTitle.setBounds(0, 0, 650, 60);

        CustomerReturnItemIdTitle.setText("Item Id :");
        CustomerReturnItem.add(CustomerReturnItemIdTitle);
        CustomerReturnItemIdTitle.setBounds(120, 90, 100, 20);

        CustomerReturnItemId.setEditable(false);
        CustomerReturnItem.add(CustomerReturnItemId);
        CustomerReturnItemId.setBounds(260, 80, 320, 30);

        CustomerReturnItemNameTitle.setText("Item Name :");
        CustomerReturnItem.add(CustomerReturnItemNameTitle);
        CustomerReturnItemNameTitle.setBounds(120, 130, 120, 20);

        CustomerReturnItemName.setEditable(false);
        CustomerReturnItem.add(CustomerReturnItemName);
        CustomerReturnItemName.setBounds(260, 120, 320, 30);

        CustomerReturnIdTitle.setText("Return Id :");
        CustomerReturnItem.add(CustomerReturnIdTitle);
        CustomerReturnIdTitle.setBounds(120, 170, 100, 20);

        CustomerReturnId.setEditable(false);
        CustomerReturnItem.add(CustomerReturnId);
        CustomerReturnId.setBounds(260, 160, 320, 30);

        CustomerReturnButton.setText("Return to Store");
        CustomerReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerReturnButtonActionPerformed(evt);
            }
        });
        CustomerReturnItem.add(CustomerReturnButton);
        CustomerReturnButton.setBounds(260, 200, 140, 30);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        CustomerReturnItem.add(jButton1);
        jButton1.setBounds(470, 200, 110, 30);

        getContentPane().add(CustomerReturnItem);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerReturnButtonActionPerformed
        System.out.println(itemStock);
        if(rentId!=0){
            try {
                if(db.csItemTransection(itemId, itemStock)){
                    db.csDeleteRentItem(rentId);
                    iM("Item Returned Successful!");
                    update = 1;
                }else{
                    eM("Unable to Return!");
                }
            } catch (Exception ex) {
                Logger.getLogger(ItemReturnManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(purchaseId!=0){
            try {
                if(db.csItemTransection(itemId, itemStock)){
                    db.csDeletePurchaseItem(purchaseId);
                    iM("Item Returned Successful!");
                    update = 2;
                }else{
                    eM("Unable to Return!");
                }
            } catch (Exception ex) {
                Logger.getLogger(ItemReturnManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CustomerReturnButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerReturnButton;
    private javax.swing.JLabel CustomerReturnFormTitle;
    private javax.swing.JTextField CustomerReturnId;
    private javax.swing.JLabel CustomerReturnIdTitle;
    private javax.swing.JPanel CustomerReturnItem;
    private javax.swing.JTextField CustomerReturnItemId;
    private javax.swing.JLabel CustomerReturnItemIdTitle;
    private javax.swing.JTextField CustomerReturnItemName;
    private javax.swing.JLabel CustomerReturnItemNameTitle;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

public void showDetails(){
    CustomerReturnItemId.setText(""+itemId);
    CustomerReturnItemName.setText(itemName);
    if(rentId!=0){
         CustomerReturnId.setText(""+rentId);
    }
    if(purchaseId!=0){
         CustomerReturnId.setText(""+purchaseId);
    }   
}
public void eM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.ERROR_MESSAGE);    
}   
public void iM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.INFORMATION_MESSAGE);    
}   
}
