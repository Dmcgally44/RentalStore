package com.my.rentalstore;

public class StoreItem {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String itemBrand;
    private String itemColour;
    private int itemStock;
    private int sportsStoreId;
    private int itemPurchasePrice;
    private int itemRentalPrice;

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

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }

    public int getSportsStoreId() {
        return sportsStoreId;
    }

    public void setSportsStoreId(int sportsStoreId) {
        this.sportsStoreId = sportsStoreId;
    }

    public int getItemPurchasePrice() {
        return itemPurchasePrice;
    }

    public void setItemPurchasePrice(int itemPurchasePrice) {
        this.itemPurchasePrice = itemPurchasePrice;
    }

    public int getItemRentalPrice() {
        return itemRentalPrice;
    }

    public void setItemRentalPrice(int itemRentalPrice) {
        this.itemRentalPrice = itemRentalPrice;
    }

}
