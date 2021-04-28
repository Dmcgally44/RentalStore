package com.my.rentalstore;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PRManager extends javax.swing.JFrame {

    RentalStoreDatabase db;
    StoreItem item;
    String customerUsername;
    int update = 0;
    
    public PRManager(String customerUsername, RentalStoreDatabase db, StoreItem item) {
        initComponents();
        rentVisibility(false);
        CustomerPrPurchaseRadio.setSelected(true);
        this.db = db;
        this.item = item;
        this.customerUsername = customerUsername;
        this.setSize(745,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setItemToForm();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerPurchaseRent = new javax.swing.JPanel();
        CustomerPrTitle = new javax.swing.JLabel();
        CustomerPrNameTitle = new javax.swing.JLabel();
        CustomerPrDescriptionTitle = new javax.swing.JLabel();
        CustomerPrBrandTitle = new javax.swing.JLabel();
        CustomerPrColourTitle = new javax.swing.JLabel();
        CustomerPrStockTitle = new javax.swing.JLabel();
        CustomerPrPurchasePriceTitle = new javax.swing.JLabel();
        CustomerPrRentPrice = new javax.swing.JTextField();
        CustomerPrName = new javax.swing.JTextField();
        CustomerPrDescription = new javax.swing.JTextField();
        CustomerPrBrand = new javax.swing.JTextField();
        CustomerPrColour = new javax.swing.JTextField();
        CustomerPrStock = new javax.swing.JTextField();
        CustomerPrPurchasePrice = new javax.swing.JTextField();
        CustomerPrCancel = new javax.swing.JButton();
        CustomerPrSave = new javax.swing.JButton();
        CustomerPrPurchaseRadio = new javax.swing.JRadioButton();
        CustomerPrRentRadio = new javax.swing.JRadioButton();
        CustomerPrRentPriceTitle = new javax.swing.JLabel();
        CustomerPrServiceTitle = new javax.swing.JLabel();
        CustomerPrRentDaysTitle = new javax.swing.JLabel();
        CustomerPrRentDays = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        CustomerPurchaseRent.setLayout(null);

        CustomerPrTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CustomerPrTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerPrTitle.setText("Item Purchase/Rent Form");
        CustomerPurchaseRent.add(CustomerPrTitle);
        CustomerPrTitle.setBounds(0, 0, 740, 60);

        CustomerPrNameTitle.setText("Item Name :");
        CustomerPurchaseRent.add(CustomerPrNameTitle);
        CustomerPrNameTitle.setBounds(190, 100, 100, 20);

        CustomerPrDescriptionTitle.setText("Item Description :");
        CustomerPurchaseRent.add(CustomerPrDescriptionTitle);
        CustomerPrDescriptionTitle.setBounds(190, 140, 120, 20);

        CustomerPrBrandTitle.setText("Item Brand :");
        CustomerPurchaseRent.add(CustomerPrBrandTitle);
        CustomerPrBrandTitle.setBounds(190, 180, 100, 20);

        CustomerPrColourTitle.setText("Item Colour :");
        CustomerPurchaseRent.add(CustomerPrColourTitle);
        CustomerPrColourTitle.setBounds(190, 220, 100, 20);

        CustomerPrStockTitle.setText("Item Stock :");
        CustomerPurchaseRent.add(CustomerPrStockTitle);
        CustomerPrStockTitle.setBounds(190, 260, 100, 20);

        CustomerPrPurchasePriceTitle.setText("Item Purchase Price :");
        CustomerPurchaseRent.add(CustomerPrPurchasePriceTitle);
        CustomerPrPurchasePriceTitle.setBounds(190, 300, 140, 20);

        CustomerPrRentPrice.setEditable(false);
        CustomerPrRentPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerPrRentPriceActionPerformed(evt);
            }
        });
        CustomerPurchaseRent.add(CustomerPrRentPrice);
        CustomerPrRentPrice.setBounds(330, 330, 320, 30);

        CustomerPrName.setEditable(false);
        CustomerPurchaseRent.add(CustomerPrName);
        CustomerPrName.setBounds(330, 90, 320, 30);

        CustomerPrDescription.setEditable(false);
        CustomerPurchaseRent.add(CustomerPrDescription);
        CustomerPrDescription.setBounds(330, 130, 320, 30);

        CustomerPrBrand.setEditable(false);
        CustomerPurchaseRent.add(CustomerPrBrand);
        CustomerPrBrand.setBounds(330, 170, 320, 30);

        CustomerPrColour.setEditable(false);
        CustomerPrColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerPrColourActionPerformed(evt);
            }
        });
        CustomerPurchaseRent.add(CustomerPrColour);
        CustomerPrColour.setBounds(330, 210, 320, 30);

        CustomerPrStock.setEditable(false);
        CustomerPurchaseRent.add(CustomerPrStock);
        CustomerPrStock.setBounds(330, 250, 320, 30);

        CustomerPrPurchasePrice.setEditable(false);
        CustomerPurchaseRent.add(CustomerPrPurchasePrice);
        CustomerPrPurchasePrice.setBounds(330, 290, 320, 30);

        CustomerPrCancel.setText("Cancel");
        CustomerPrCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerPrCancelActionPerformed(evt);
            }
        });
        CustomerPurchaseRent.add(CustomerPrCancel);
        CustomerPrCancel.setBounds(530, 460, 100, 30);

        CustomerPrSave.setText("Perform Transection");
        CustomerPrSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerPrSaveActionPerformed(evt);
            }
        });
        CustomerPurchaseRent.add(CustomerPrSave);
        CustomerPrSave.setBounds(330, 460, 160, 30);

        CustomerPrPurchaseRadio.setText("Purchase");
        CustomerPrPurchaseRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerPrPurchaseRadioMouseClicked(evt);
            }
        });
        CustomerPurchaseRent.add(CustomerPrPurchaseRadio);
        CustomerPrPurchaseRadio.setBounds(330, 360, 107, 40);

        CustomerPrRentRadio.setText("Rent");
        CustomerPrRentRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerPrRentRadioMouseClicked(evt);
            }
        });
        CustomerPurchaseRent.add(CustomerPrRentRadio);
        CustomerPrRentRadio.setBounds(440, 360, 55, 40);

        CustomerPrRentPriceTitle.setText("Item Rent Price :");
        CustomerPurchaseRent.add(CustomerPrRentPriceTitle);
        CustomerPrRentPriceTitle.setBounds(190, 340, 110, 20);

        CustomerPrServiceTitle.setText("Service Type :");
        CustomerPurchaseRent.add(CustomerPrServiceTitle);
        CustomerPrServiceTitle.setBounds(190, 370, 110, 20);

        CustomerPrRentDaysTitle.setText("Rent Days :");
        CustomerPurchaseRent.add(CustomerPrRentDaysTitle);
        CustomerPrRentDaysTitle.setBounds(190, 400, 110, 30);

        CustomerPrRentDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerPrRentDaysActionPerformed(evt);
            }
        });
        CustomerPurchaseRent.add(CustomerPrRentDays);
        CustomerPrRentDays.setBounds(330, 400, 320, 30);

        getContentPane().add(CustomerPurchaseRent);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerPrColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerPrColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerPrColourActionPerformed

    private void CustomerPrRentPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerPrRentPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerPrRentPriceActionPerformed

    private void CustomerPrCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerPrCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_CustomerPrCancelActionPerformed

    private void CustomerPrSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerPrSaveActionPerformed
    if(!CustomerPrRentDays.equals("") && (CustomerPrPurchaseRadio.isSelected() || CustomerPrRentRadio.isSelected())){
        try {
            Integer.parseInt(CustomerPrStock.getText());
            Integer.parseInt(CustomerPrPurchasePrice.getText());
            Integer.parseInt(CustomerPrRentPrice.getText());
            
            if(CustomerPrPurchaseRadio.isSelected()){
                if(item.getItemStock()-1 >= 0){
                    if(db.csItemTransection(item.getItemId(), item.getItemStock()-1)){
                        db.csAddPurchaseItem(item.getItemId(), customerUsername);
                        iM("Item Purchased Successful!");
                        update = 1;
                    }else{
                        eM("Something went wrong!");
                    }
                }else{
                    eM("Not enough Quantity!");
                }
            }
            if(CustomerPrRentRadio.isSelected()){
                int rentDays = Integer.parseInt(CustomerPrRentDays.getText());
                if(item.getItemStock()-1 >= 0){
                    if(rentDays > 0){
                        if(db.csItemTransection(item.getItemId(), item.getItemStock()-1)){
                            db.csAddRentItem(item.getItemId(), customerUsername, rentDays);
                            iM("Item Purchased Successful!");
                            update = 1;
                        }else{
                            eM("Something went wrong!");
                        }
                    }else{
                            eM("Atleast 1 day rent can be possible!");
                    }
                }else{
                    eM("Not enough Quantity!");
                }
            }
         
        } catch (Exception ex) {
            eM("Something unusual happened!");
        }
    }else{
        eM("Fields cannot be enpty!");
    }   
    }//GEN-LAST:event_CustomerPrSaveActionPerformed

    private void CustomerPrRentDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerPrRentDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerPrRentDaysActionPerformed

    private void CustomerPrPurchaseRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerPrPurchaseRadioMouseClicked
        if(CustomerPrPurchaseRadio.isSelected()){
            CustomerPrRentRadio.setSelected(false);
            rentVisibility(false);
        }
    }//GEN-LAST:event_CustomerPrPurchaseRadioMouseClicked

    private void CustomerPrRentRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerPrRentRadioMouseClicked
        if(CustomerPrRentRadio.isSelected()){
            CustomerPrPurchaseRadio.setSelected(false);
            rentVisibility(true);
        }
    }//GEN-LAST:event_CustomerPrRentRadioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerPrBrand;
    private javax.swing.JLabel CustomerPrBrandTitle;
    private javax.swing.JButton CustomerPrCancel;
    private javax.swing.JTextField CustomerPrColour;
    private javax.swing.JLabel CustomerPrColourTitle;
    private javax.swing.JTextField CustomerPrDescription;
    private javax.swing.JLabel CustomerPrDescriptionTitle;
    private javax.swing.JTextField CustomerPrName;
    private javax.swing.JLabel CustomerPrNameTitle;
    private javax.swing.JTextField CustomerPrPurchasePrice;
    private javax.swing.JLabel CustomerPrPurchasePriceTitle;
    private javax.swing.JRadioButton CustomerPrPurchaseRadio;
    private javax.swing.JTextField CustomerPrRentDays;
    private javax.swing.JLabel CustomerPrRentDaysTitle;
    private javax.swing.JTextField CustomerPrRentPrice;
    private javax.swing.JLabel CustomerPrRentPriceTitle;
    private javax.swing.JRadioButton CustomerPrRentRadio;
    private javax.swing.JButton CustomerPrSave;
    private javax.swing.JLabel CustomerPrServiceTitle;
    private javax.swing.JTextField CustomerPrStock;
    private javax.swing.JLabel CustomerPrStockTitle;
    private javax.swing.JLabel CustomerPrTitle;
    private javax.swing.JPanel CustomerPurchaseRent;
    // End of variables declaration//GEN-END:variables

public void setItemToForm(){
    CustomerPrBrand.setText(item.getItemBrand());
    CustomerPrColour.setText(item.getItemColour());
    CustomerPrDescription.setText(item.getItemDescription());
    CustomerPrName.setText(item.getItemName());
    CustomerPrPurchasePrice.setText(""+item.getItemPurchasePrice());
    CustomerPrRentPrice.setText(""+item.getItemRentalPrice());
    CustomerPrStock.setText(""+item.getItemStock());   
}

public void rentVisibility(boolean state){
    CustomerPrRentDaysTitle.setVisible(state);
    CustomerPrRentDays.setVisible(state);
}
public void eM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.ERROR_MESSAGE);    
}   
public void iM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.INFORMATION_MESSAGE);    
}    
}
