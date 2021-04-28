package com.my.rentalstore;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StoreItemAdd extends javax.swing.JFrame {

    /**
     * Creates new form AddItem
     */
    RentalStoreDatabase db;
    int sportsStoreId;
    int update = 0;
    
    public StoreItemAdd(RentalStoreDatabase db, int sportsStoreId) {
        initComponents();
        this.db = db;
        this.sportsStoreId = sportsStoreId;
        this.setSize(744,481);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WorkerAddItem = new javax.swing.JPanel();
        WorkerAddItemTitle = new javax.swing.JLabel();
        WorkerAddItemRentPriceTitle = new javax.swing.JLabel();
        WorkerAddItemNameTitle = new javax.swing.JLabel();
        WorkerAddItemDescriptionTitle = new javax.swing.JLabel();
        WorkerAddItemBrandTitle = new javax.swing.JLabel();
        WorkerAddItemColourTitle = new javax.swing.JLabel();
        WorkerAddItemStockTitle = new javax.swing.JLabel();
        WorkerAddItemPurchasePriceTitle = new javax.swing.JLabel();
        WorkerAddItemRentPrice = new javax.swing.JTextField();
        WorkerAddItemName = new javax.swing.JTextField();
        WorkerAddItemDescription = new javax.swing.JTextField();
        WorkerAddItemBrand = new javax.swing.JTextField();
        WorkerAddItemColour = new javax.swing.JTextField();
        WorkerAddItemStock = new javax.swing.JTextField();
        WorkerAddItemPurchasePrice = new javax.swing.JTextField();
        WorkerAddItemCancel = new javax.swing.JButton();
        WorkerAddItemSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        WorkerAddItem.setLayout(null);

        WorkerAddItemTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        WorkerAddItemTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorkerAddItemTitle.setText("Add Item Form");
        WorkerAddItem.add(WorkerAddItemTitle);
        WorkerAddItemTitle.setBounds(0, 0, 740, 60);

        WorkerAddItemRentPriceTitle.setText("Item Rent Price :");
        WorkerAddItem.add(WorkerAddItemRentPriceTitle);
        WorkerAddItemRentPriceTitle.setBounds(190, 340, 110, 20);

        WorkerAddItemNameTitle.setText("Item Name :");
        WorkerAddItem.add(WorkerAddItemNameTitle);
        WorkerAddItemNameTitle.setBounds(190, 100, 100, 20);

        WorkerAddItemDescriptionTitle.setText("Item Description :");
        WorkerAddItem.add(WorkerAddItemDescriptionTitle);
        WorkerAddItemDescriptionTitle.setBounds(190, 140, 120, 20);

        WorkerAddItemBrandTitle.setText("Item Brand :");
        WorkerAddItem.add(WorkerAddItemBrandTitle);
        WorkerAddItemBrandTitle.setBounds(190, 180, 100, 20);

        WorkerAddItemColourTitle.setText("Item Colour :");
        WorkerAddItem.add(WorkerAddItemColourTitle);
        WorkerAddItemColourTitle.setBounds(190, 220, 100, 20);

        WorkerAddItemStockTitle.setText("Item Stock :");
        WorkerAddItem.add(WorkerAddItemStockTitle);
        WorkerAddItemStockTitle.setBounds(190, 260, 100, 20);

        WorkerAddItemPurchasePriceTitle.setText("Item Purchase Price :");
        WorkerAddItem.add(WorkerAddItemPurchasePriceTitle);
        WorkerAddItemPurchasePriceTitle.setBounds(190, 300, 140, 20);

        WorkerAddItemRentPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerAddItemRentPriceActionPerformed(evt);
            }
        });
        WorkerAddItem.add(WorkerAddItemRentPrice);
        WorkerAddItemRentPrice.setBounds(330, 330, 230, 30);
        WorkerAddItem.add(WorkerAddItemName);
        WorkerAddItemName.setBounds(330, 90, 230, 30);
        WorkerAddItem.add(WorkerAddItemDescription);
        WorkerAddItemDescription.setBounds(330, 130, 230, 30);
        WorkerAddItem.add(WorkerAddItemBrand);
        WorkerAddItemBrand.setBounds(330, 170, 230, 30);

        WorkerAddItemColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerAddItemColourActionPerformed(evt);
            }
        });
        WorkerAddItem.add(WorkerAddItemColour);
        WorkerAddItemColour.setBounds(330, 210, 230, 30);
        WorkerAddItem.add(WorkerAddItemStock);
        WorkerAddItemStock.setBounds(330, 250, 230, 30);
        WorkerAddItem.add(WorkerAddItemPurchasePrice);
        WorkerAddItemPurchasePrice.setBounds(330, 290, 230, 30);

        WorkerAddItemCancel.setText("Cancel");
        WorkerAddItemCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerAddItemCancelActionPerformed(evt);
            }
        });
        WorkerAddItem.add(WorkerAddItemCancel);
        WorkerAddItemCancel.setBounds(460, 370, 100, 30);

        WorkerAddItemSave.setText("Save");
        WorkerAddItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerAddItemSaveActionPerformed(evt);
            }
        });
        WorkerAddItem.add(WorkerAddItemSave);
        WorkerAddItemSave.setBounds(330, 370, 100, 30);

        getContentPane().add(WorkerAddItem);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WorkerAddItemColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerAddItemColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkerAddItemColourActionPerformed

    private void WorkerAddItemRentPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerAddItemRentPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkerAddItemRentPriceActionPerformed

    private void WorkerAddItemCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerAddItemCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_WorkerAddItemCancelActionPerformed

    private void WorkerAddItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerAddItemSaveActionPerformed
    if(WorkerAddItemName.getText().equals("") || WorkerAddItemDescription.getText().equals("") || WorkerAddItemBrand.getText().equals("") || WorkerAddItemColour.getText().equals("") || WorkerAddItemStock.getText().equals("") || WorkerAddItemPurchasePrice.getText().equals("") || WorkerAddItemRentPrice.getText().equals("")){
        eM("Fields Cannot be empty!");
    }else{
        try {
            Integer.parseInt(WorkerAddItemStock.getText());
            Integer.parseInt(WorkerAddItemPurchasePrice.getText());
            Integer.parseInt(WorkerAddItemRentPrice.getText());
            db.WorkerAddItem(WorkerAddItemName.getText(), WorkerAddItemDescription.getText(), WorkerAddItemBrand.getText(), WorkerAddItemColour.getText(), Integer.parseInt(WorkerAddItemStock.getText()), sportsStoreId, Integer.parseInt(WorkerAddItemPurchasePrice.getText()), Integer.parseInt(WorkerAddItemRentPrice.getText()));
            iM("Item inserted successfuly!");
            update = 1;
            this.dispose();
        } catch (Exception ex) {
            eM("Invalid Stock/Price amount");
        }
    }   
    }//GEN-LAST:event_WorkerAddItemSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WorkerAddItem;
    private javax.swing.JTextField WorkerAddItemBrand;
    private javax.swing.JLabel WorkerAddItemBrandTitle;
    private javax.swing.JButton WorkerAddItemCancel;
    private javax.swing.JTextField WorkerAddItemColour;
    private javax.swing.JLabel WorkerAddItemColourTitle;
    private javax.swing.JTextField WorkerAddItemDescription;
    private javax.swing.JLabel WorkerAddItemDescriptionTitle;
    private javax.swing.JTextField WorkerAddItemName;
    private javax.swing.JLabel WorkerAddItemNameTitle;
    private javax.swing.JTextField WorkerAddItemPurchasePrice;
    private javax.swing.JLabel WorkerAddItemPurchasePriceTitle;
    private javax.swing.JTextField WorkerAddItemRentPrice;
    private javax.swing.JLabel WorkerAddItemRentPriceTitle;
    private javax.swing.JButton WorkerAddItemSave;
    private javax.swing.JTextField WorkerAddItemStock;
    private javax.swing.JLabel WorkerAddItemStockTitle;
    private javax.swing.JLabel WorkerAddItemTitle;
    // End of variables declaration//GEN-END:variables
public void eM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.ERROR_MESSAGE);    
}   
public void iM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.INFORMATION_MESSAGE);    
}   
}
