package com.my.rentalstore;

import java.sql.Date;

public class StorePurchase {
    private int purchaseId;
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String itemBrand;
    private String itemColour;
    private int itemPurchasePrice;
    private Date purchaseDate;

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemColour() {
        return itemColour;
    }

    public void setItemColour(String itemColour) {
        this.itemColour = itemColour;
    }

    public int getItemPurchasePrice() {
        return itemPurchasePrice;
    }

    public void setItemPurchasePrice(int itemPurchasePrice) {
        this.itemPurchasePrice = itemPurchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    
}
