package com.my.rentalstore;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.sql.Date;
import java.time.LocalDate;

public class RentalStoreDatabase {
    
        StoreCustomer customer;
        StoreWorker shopkeeper;
        StoreRent rent;
        StorePurchase purchase;
        Store sportsshop;
        StoreItem item;
	Statement myStmt = null;
        boolean rentPurchase = false;
        ArrayList<StoreItem> itemList = new ArrayList<StoreItem>();
        ArrayList<StoreCustomer> customerList = new ArrayList<StoreCustomer>();
        ArrayList<StorePurchase> purchaseList = new ArrayList<StorePurchase>();
        ArrayList<StoreRent> rentList = new ArrayList<StoreRent>();
        DateManager dateManager = new DateManager();
        
    public void WorkerAddItem(String itemName, String itemDescription, String itemBrand, String itemColour, int itemStock, int storeId, int purchasePrice, int rentPrice) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="insert into Item (itemName, itemDescription, itemBrand, itemColour, itemStock, storeId, itemPurchasePrice, itemRentalPrice) values(\""+itemName+"\",\""+itemDescription+"\",\""+itemBrand+"\",\""+itemColour+"\", \""+itemStock+"\",\""+storeId+"\",\""+purchasePrice+"\",\""+rentPrice+"\")";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println(ex);
        }  
            
    } 
    
    public void WorkerUpdateItem(int itemId, String itemName, String itemDescription, String itemBrand, String itemColour, int itemStock, int storeId, int purchasePrice, int rentPrice) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="update Item set itemName = \""+itemName+"\", itemDescription = \""+itemDescription+"\", itemBrand = \""+itemBrand+"\", itemColour = \""+itemColour+"\", itemStock = \""+itemStock+"\", storeId = \""+storeId+"\", itemPurchasePrice = \""+purchasePrice+"\", itemRentalPrice = \""+rentPrice+"\" where itemId = \""+itemId+"\"";
                
            myStmt.executeUpdate(sql);
           
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }  
            
    } 
    
    public void WorkerDeleteItem(int itemId) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="delete from Item where itemId = \""+itemId+"\"";
                
            myStmt.executeUpdate(sql);
           
        } 
        catch (SQLException ex) 
        {
        
        }  
            
    } 
    
    public int WorkerAddCustomer(String customerName, String customerContact, String customerAddress, String customerUsername, String customerPassword) throws SQLException
    {
        myStmt = null;
        String sql = null;
        int status = 0;
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="insert into Customer (customerName, customerContact, customerAddress, customerUsername, customerPassword) values(\""+customerName+"\",\""+customerContact+"\",\""+customerAddress+"\",\""+customerUsername+"\", \""+customerPassword+"\")";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println(ex);
             status = 1;
        }
        
        return status;
            
    } 
    
    public void WorkerUpdateCustomer(int customerId, String customerName, String customerContact, String customerAddress, String customerUsername) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="update Customer set customerName = \""+customerName+"\", customerContact = \""+customerContact+"\", customerAddress = \""+customerAddress+"\", customerUsername = \""+customerUsername+"\" where customerId = \""+customerId+"\"";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println(ex);
        }  
            
    } 

    public void WorkerDeleteCustomer(int customerId) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="delete from Customer where customerId = \""+customerId+"\"";
                
            myStmt.executeUpdate(sql);
           
        } 
        catch (SQLException ex) 
        {
        
        }  
            
    } 
    
    public ArrayList<StoreItem> WorkerAvailableStoreItems(int storeId)
    {    
        try 
        {   
            itemList.removeAll(itemList);
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from Item where (storeId = \'"+storeId+"\')";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                item = new StoreItem();
                item.setItemId(result.getInt("itemId"));
                item.setItemName(result.getString("itemName"));
                item.setItemDescription(result.getString("itemDescription"));
                item.setItemBrand(result.getString("itemBrand"));
                item.setItemColour(result.getString("itemColour"));
                item.setItemStock(result.getInt("itemStock"));
                item.setSportsStoreId(result.getInt("storeId"));
                item.setItemPurchasePrice(result.getInt("itemPurchasePrice"));
                item.setItemRentalPrice(result.getInt("itemRentalPrice"));
                itemList.add(item);
            }               
            
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }

            return itemList;  
    }

    public ArrayList<StoreItem> csAvailableStoreItems(int storeId)
    {    
        try 
        {   
            itemList.removeAll(itemList);
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from Item where (storeId = \'"+storeId+"\' and itemStock > 0)";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                item = new StoreItem();
                item.setItemId(result.getInt("itemId"));
                item.setItemName(result.getString("itemName"));
                item.setItemDescription(result.getString("itemDescription"));
                item.setItemBrand(result.getString("itemBrand"));
                item.setItemColour(result.getString("itemColour"));
                item.setItemStock(result.getInt("itemStock"));
                item.setSportsStoreId(result.getInt("storeId"));
                item.setItemPurchasePrice(result.getInt("itemPurchasePrice"));
                item.setItemRentalPrice(result.getInt("itemRentalPrice"));
                itemList.add(item);
            }               
            
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }

            return itemList;  
    }
    
    public ArrayList<StoreCustomer> WorkerGetCustomers()
    {
        try{
            customerList.removeAll(customerList);
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from Customer";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                customer = new StoreCustomer();
                customer.setCustomerId(result.getInt("customerId"));
                customer.setCustomerName(result.getString("customerName"));
                customer.setCustomerContact(result.getString("customerContact"));
                customer.setCustomerAddress(result.getString("customerAddress"));
                customer.setCustomerUsername(result.getString("customerUsername"));
                customer.setCustomerPassword(result.getString("customerPassword"));
                customerList.add(customer);
            }               
            
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        
        return customerList;
    }
    
    public StoreWorker WorkerLogin(String workerUsername) throws SQLException
    {
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from ShopKeeper where workerUsername = \'"+workerUsername+"\'";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                shopkeeper = new StoreWorker();
                shopkeeper.setworkerId(result.getInt("workerId"));
                shopkeeper.setworkerName(result.getString("workerName"));
                shopkeeper.setworkerContact(result.getString("workerContact"));
                shopkeeper.setworkerAddress(result.getString("workerAddress"));
                shopkeeper.setworkerUsername(result.getString("workerUsername"));
                shopkeeper.setworkerPassword(result.getString("workerPassword"));
            }          
            
        } 
        catch (SQLException ex) 
        {
            
        }

            return shopkeeper;
    }     

    public Store WorkerSportsShop(int workerId) throws SQLException
    {

        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from SportsShop where workerId = \'"+workerId+"\'";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                sportsshop = new Store();
                sportsshop.setStoreId(result.getInt("storeId"));
                sportsshop.setStoreName(result.getString("storeName"));
                sportsshop.setStoreContact(result.getString("storeContact"));
                sportsshop.setStoreAddress(result.getString("storeAddress"));
                sportsshop.setworkerId(result.getString("workerId"));
            }          
            
        } 
        catch (SQLException ex) 
        {
            
        }

            return sportsshop;
    }  
    
    public StoreCustomer csLogin(String customerUsername) throws SQLException
    {
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from Customer where customerUsername = \'"+customerUsername+"\'";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                customer = new StoreCustomer();
                customer.setCustomerId(result.getInt("customerId"));
                customer.setCustomerName(result.getString("customerName"));
                customer.setCustomerContact(result.getString("customerContact"));
                customer.setCustomerAddress(result.getString("customerAddress"));
                customer.setCustomerUsername(result.getString("customerUsername"));
                customer.setCustomerPassword(result.getString("customerPassword"));
            }          
            
        } 
        catch (SQLException ex) 
        {
            
        }

            return customer;
    } 
    
    public boolean csItemTransection(int itemId, int itemStock) throws SQLException
    {
        rentPurchase = false;
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="update Item set itemStock = \""+itemStock+"\" where itemId = \""+itemId+"\"";
                
            myStmt.executeUpdate(sql);
            
            rentPurchase = true;
           
        } 
        catch (SQLException ex) 
        {
            rentPurchase = false;
            System.out.println(ex);
        }  
        
        return rentPurchase;
    }  
    
    public void csAddPurchaseItem(int itemId, String customerUsername) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            sql="Insert into Purchase (itemId, customerUsername, purchaseDate) values ("+itemId+", '"+customerUsername+"', #"+dateManager.getCrrentDate()+"#)";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println(ex);
        }  
            
    }

    public void csAddRentItem(int itemId, String customerUsername, int rentDays) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            sql="Insert into Rent (itemId, customerUsername, rentDate, returnDate) values ("+itemId+", '"+customerUsername+"', #"+dateManager.getCrrentDate()+"#, #"+dateManager.convertUtilToSql(dateManager.generateDueDate(dateManager.getCrrentDate(), rentDays))+"#)";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println("Inserting :"+ex);
        }  
            
    }

    public void csDeleteRentItem(int rentId) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            sql="delete from Rent where rentId = "+rentId+"";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println("DeletingRent :"+ex);
        }  
            
    }
    
    public void csDeletePurchaseItem(int purchaseId) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            sql="delete from Purchase where purchaseId = "+purchaseId+"";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println("DeletingPurchase :"+ex);
        }  
            
    }    
    
    public ArrayList<StorePurchase> csGetAllPurchases(String customerUsername) throws SQLException
    {
        purchaseList.removeAll(purchaseList);
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select Item.itemId, Item.itemName, Item.itemDescription, Item.itemBrand, Item.itemColour, Item.itemPurchasePrice, Purchase.purchaseId, Purchase.purchaseDate from Item, Purchase where ((Purchase.customerUsername = \'"+customerUsername+"\') and (Purchase.itemId = Item.itemId))";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                purchase = new StorePurchase();
                purchase.setItemId(result.getInt("itemId"));
                purchase.setItemName(result.getString("itemName"));
                purchase.setItemDescription(result.getString("itemDescription"));
                purchase.setItemBrand(result.getString("itemBrand"));
                purchase.setItemColour(result.getString("itemColour"));
                purchase.setItemPurchasePrice(result.getInt("itemPurchasePrice"));
                purchase.setPurchaseId(result.getInt("purchaseId"));
                purchase.setPurchaseDate(result.getDate("purchaseDate"));
                purchaseList.add(purchase);
            }          
            
        } 
        catch (SQLException ex) 
        {
                System.out.println(ex);
        }

       return purchaseList;
    } 

    public ArrayList<StoreRent> csGetAllRentItems(String customerUsername) throws SQLException
    {
        rentList.removeAll(rentList);
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select Item.itemId, Item.itemName, Item.itemDescription, Item.itemBrand, Item.itemColour, Item.itemRentalPrice, Rent.rentId, Rent.rentDate, Rent.returnDate from Item, Rent where ((Rent.customerUsername = \'"+customerUsername+"\') and (Rent.itemId = Item.itemId))";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                rent = new StoreRent();
                rent.setRentId(result.getInt("rentId"));
                rent.setItemId(result.getInt("itemId"));
                rent.setItemName(result.getString("itemName"));
                rent.setItemDescription(result.getString("itemDescription"));
                rent.setItemBrand(result.getString("itemBrand"));
                rent.setItemColour(result.getString("itemColour"));
                rent.setRentalPrice(result.getInt("itemRentalPrice"));
                rent.setRentDate(result.getDate("rentDate"));
                rent.setReturnDate(result.getDate("returnDate"));
                rentList.add(rent);
            }          
            
        } 
        catch (SQLException ex) 
        {
                System.out.println("fetching :"+ex);
        }

       return rentList;
    }
    
    public ArrayList<StoreRent> WorkerGetAllOverdueItems() throws SQLException
    {
        rentList.removeAll(rentList);
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select Item.itemId, Item.itemName, Item.itemDescription, Item.itemBrand, Item.itemColour, Item.itemRentalPrice, Rent.rentId, Rent.rentDate, Rent.returnDate from Item, Rent where Rent.itemId = Item.itemId";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                if(result.getDate("returnDate").before(dateManager.getCrrentDate())){
                rent = new StoreRent();
                rent.setRentId(result.getInt("rentId"));
                rent.setItemId(result.getInt("itemId"));
                rent.setItemName(result.getString("itemName"));
                rent.setItemDescription(result.getString("itemDescription"));
                rent.setItemBrand(result.getString("itemBrand"));
                rent.setItemColour(result.getString("itemColour"));
                rent.setRentalPrice(result.getInt("itemRentalPrice"));
                rent.setRentDate(result.getDate("rentDate"));
                rent.setReturnDate(result.getDate("returnDate"));
                rentList.add(rent);
                }
            }          
            
        } 
        catch (SQLException ex) 
        {
                System.out.println("fetching :"+ex);
        }

       return rentList;
    }
}
