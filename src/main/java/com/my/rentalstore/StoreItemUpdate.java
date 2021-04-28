package com.my.rentalstore;

import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StoreItemUpdate extends javax.swing.JFrame {

    RentalStoreDatabase db;
    StoreItem item;
    int update = 0;
    
    public StoreItemUpdate(RentalStoreDatabase db, StoreItem item) {
        initComponents();
        this.db = db;
        this.item = item;
        this.setSize(745,480);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setItemToForm();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WorkerUpdateItem = new javax.swing.JPanel();
        WorkerUpdateItemTitle = new javax.swing.JLabel();
        WorkerUpdateItemRentPriceTitle = new javax.swing.JLabel();
        WorkerUpdateItemNameTitle = new javax.swing.JLabel();
        WorkerUpdateItemDescriptionTitle = new javax.swing.JLabel();
        WorkerUpdateItemBrandTitle = new javax.swing.JLabel();
        WorkerUpdateItemColourTitle = new javax.swing.JLabel();
        WorkerUpdateItemStockTitle = new javax.swing.JLabel();
        WorkerUpdateItemPurchasePriceTitle = new javax.swing.JLabel();
        WorkerUpdateItemRentPrice = new javax.swing.JTextField();
        WorkerUpdateItemName = new javax.swing.JTextField();
        WorkerUpdateItemDescription = new javax.swing.JTextField();
        WorkerUpdateItemBrand = new javax.swing.JTextField();
        WorkerUpdateItemColour = new javax.swing.JTextField();
        WorkerUpdateItemStock = new javax.swing.JTextField();
        WorkerUpdateItemPurchasePrice = new javax.swing.JTextField();
        WorkerUpdateItemCancel = new javax.swing.JButton();
        WorkerUpdateItemSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        WorkerUpdateItem.setLayout(null);

        WorkerUpdateItemTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        WorkerUpdateItemTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorkerUpdateItemTitle.setText("Update Item Form");
        WorkerUpdateItem.add(WorkerUpdateItemTitle);
        WorkerUpdateItemTitle.setBounds(0, 0, 740, 60);

        WorkerUpdateItemRentPriceTitle.setText("Item Rent Price :");
        WorkerUpdateItem.add(WorkerUpdateItemRentPriceTitle);
        WorkerUpdateItemRentPriceTitle.setBounds(190, 340, 110, 20);

        WorkerUpdateItemNameTitle.setText("Item Name :");
        WorkerUpdateItem.add(WorkerUpdateItemNameTitle);
        WorkerUpdateItemNameTitle.setBounds(190, 100, 100, 20);

        WorkerUpdateItemDescriptionTitle.setText("Item Description :");
        WorkerUpdateItem.add(WorkerUpdateItemDescriptionTitle);
        WorkerUpdateItemDescriptionTitle.setBounds(190, 140, 120, 20);

        WorkerUpdateItemBrandTitle.setText("Item Brand :");
        WorkerUpdateItem.add(WorkerUpdateItemBrandTitle);
        WorkerUpdateItemBrandTitle.setBounds(190, 180, 100, 20);

        WorkerUpdateItemColourTitle.setText("Item Colour :");
        WorkerUpdateItem.add(WorkerUpdateItemColourTitle);
        WorkerUpdateItemColourTitle.setBounds(190, 220, 100, 20);

        WorkerUpdateItemStockTitle.setText("Item Stock :");
        WorkerUpdateItem.add(WorkerUpdateItemStockTitle);
        WorkerUpdateItemStockTitle.setBounds(190, 260, 100, 20);

        WorkerUpdateItemPurchasePriceTitle.setText("Item Purchase Price :");
        WorkerUpdateItem.add(WorkerUpdateItemPurchasePriceTitle);
        WorkerUpdateItemPurchasePriceTitle.setBounds(190, 300, 140, 20);

        WorkerUpdateItemRentPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerUpdateItemRentPriceActionPerformed(evt);
            }
        });
        WorkerUpdateItem.add(WorkerUpdateItemRentPrice);
        WorkerUpdateItemRentPrice.setBounds(330, 330, 320, 30);
        WorkerUpdateItem.add(WorkerUpdateItemName);
        WorkerUpdateItemName.setBounds(330, 90, 320, 30);
        WorkerUpdateItem.add(WorkerUpdateItemDescription);
        WorkerUpdateItemDescription.setBounds(330, 130, 320, 30);
        WorkerUpdateItem.add(WorkerUpdateItemBrand);
        WorkerUpdateItemBrand.setBounds(330, 170, 320, 30);

        WorkerUpdateItemColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerUpdateItemColourActionPerformed(evt);
            }
        });
        WorkerUpdateItem.add(WorkerUpdateItemColour);
        WorkerUpdateItemColour.setBounds(330, 210, 320, 30);
        WorkerUpdateItem.add(WorkerUpdateItemStock);
        WorkerUpdateItemStock.setBounds(330, 250, 320, 30);
        WorkerUpdateItem.add(WorkerUpdateItemPurchasePrice);
        WorkerUpdateItemPurchasePrice.setBounds(330, 290, 320, 30);

        WorkerUpdateItemCancel.setText("Cancel");
        WorkerUpdateItemCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerUpdateItemCancelActionPerformed(evt);
            }
        });
        WorkerUpdateItem.add(WorkerUpdateItemCancel);
        WorkerUpdateItemCancel.setBounds(440, 370, 100, 30);

        WorkerUpdateItemSave.setText("Save");
        WorkerUpdateItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerUpdateItemSaveActionPerformed(evt);
            }
        });
        WorkerUpdateItem.add(WorkerUpdateItemSave);
        WorkerUpdateItemSave.setBounds(330, 370, 100, 30);

        getContentPane().add(WorkerUpdateItem);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WorkerUpdateItemColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerUpdateItemColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkerUpdateItemColourActionPerformed

    private void WorkerUpdateItemRentPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerUpdateItemRentPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkerUpdateItemRentPriceActionPerformed

    private void WorkerUpdateItemCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerUpdateItemCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_WorkerUpdateItemCancelActionPerformed

    private void WorkerUpdateItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerUpdateItemSaveActionPerformed
    if(WorkerUpdateItemName.getText().equals("") || WorkerUpdateItemDescription.getText().equals("") || WorkerUpdateItemBrand.getText().equals("") || WorkerUpdateItemColour.getText().equals("") || WorkerUpdateItemStock.getText().equals("") || WorkerUpdateItemPurchasePrice.getText().equals("") || WorkerUpdateItemRentPrice.getText().equals("")){
        eM("Fields Cannot be empty!");
    }else{
        try {
            Integer.parseInt(WorkerUpdateItemStock.getText());
            Integer.parseInt(WorkerUpdateItemPurchasePrice.getText());
            Integer.parseInt(WorkerUpdateItemRentPrice.getText());
            db.WorkerUpdateItem(item.getItemId(), WorkerUpdateItemName.getText(), WorkerUpdateItemDescription.getText(), WorkerUpdateItemBrand.getText(), WorkerUpdateItemColour.getText(), Integer.parseInt(WorkerUpdateItemStock.getText()), item.getSportsStoreId(), Integer.parseInt(WorkerUpdateItemPurchasePrice.getText()), Integer.parseInt(WorkerUpdateItemRentPrice.getText()));
            iM("Item updated successfuly!");
            update = 1;
        } catch (Exception ex) {
            eM("Invalid Stock/Price amount");
        }
    }   
    }//GEN-LAST:event_WorkerUpdateItemSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WorkerUpdateItem;
    private javax.swing.JTextField WorkerUpdateItemBrand;
    private javax.swing.JLabel WorkerUpdateItemBrandTitle;
    private javax.swing.JButton WorkerUpdateItemCancel;
    private javax.swing.JTextField WorkerUpdateItemColour;
    private javax.swing.JLabel WorkerUpdateItemColourTitle;
    private javax.swing.JTextField WorkerUpdateItemDescription;
    private javax.swing.JLabel WorkerUpdateItemDescriptionTitle;
    private javax.swing.JTextField WorkerUpdateItemName;
    private javax.swing.JLabel WorkerUpdateItemNameTitle;
    private javax.swing.JTextField WorkerUpdateItemPurchasePrice;
    private javax.swing.JLabel WorkerUpdateItemPurchasePriceTitle;
    private javax.swing.JTextField WorkerUpdateItemRentPrice;
    private javax.swing.JLabel WorkerUpdateItemRentPriceTitle;
    private javax.swing.JButton WorkerUpdateItemSave;
    private javax.swing.JTextField WorkerUpdateItemStock;
    private javax.swing.JLabel WorkerUpdateItemStockTitle;
    private javax.swing.JLabel WorkerUpdateItemTitle;
    // End of variables declaration//GEN-END:variables

public void setItemToForm(){
    WorkerUpdateItemBrand.setText(item.getItemBrand());
    WorkerUpdateItemColour.setText(item.getItemColour());
    WorkerUpdateItemDescription.setText(item.getItemDescription());
    WorkerUpdateItemName.setText(item.getItemName());
    WorkerUpdateItemPurchasePrice.setText(""+item.getItemPurchasePrice());
    WorkerUpdateItemRentPrice.setText(""+item.getItemRentalPrice());
    WorkerUpdateItemStock.setText(""+item.getItemStock());   
}
public void eM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.ERROR_MESSAGE);    
}   
public void iM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.INFORMATION_MESSAGE);    
}   
}
