package com.my.rentalstore;

import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    StoreCustomer customer;
    StoreWorker worker;
    StoreItem item = new StoreItem();
    StoreCustomer customerUpdate = new StoreCustomer();
    ItemReturnManager returnItem;
    StoreItemUpdate storeItemUpdate;
    PRManager prManager;
    StoreCustomerUpdate storeCustomerUpdate;
    StoreCustomerAdd storeCustomerAdd;
    StoreItemAdd storeItemAdd;
    Store store;
    RentalStoreDatabase rentalStoreDb = new RentalStoreDatabase();
    ArrayList<StoreItem> storeItemList;
    ArrayList<StoreCustomer> storeCustomerList;
    ArrayList<StorePurchase> storePurchaseList;
    ArrayList<StoreRent> rentList;
    DefaultTableModel storeItemListModel;
    DefaultTableModel storePurchaseListModel;
    DefaultTableModel rentListModel;
    Object storePurchaseListRowData[];
    Object rentListRowData[];
    Object storeItemListRowData[];
    DefaultTableModel WorkerstoreCustomerListModel;
    DefaultTableModel WorkerOverdueListModel;
    Object WorkerstoreCustomerListRowData[];
    Object WorkerOverdueListRowData[];
    int itemTableRow = 0;
    int purchaseTableRow = 0;
    int customerTableRow = 0;
    int rentTableRow = 0;
    int storeId = 1;
    
    public Home() {
        initComponents();
        sync();
        start();
        this.setSize(1024,800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LoginFields = new javax.swing.JPanel();
        LoginPassword = new javax.swing.JPasswordField();
        LoginUsername = new javax.swing.JTextField();
        LoginPasswordText = new javax.swing.JLabel();
        LoginUserNameText = new javax.swing.JLabel();
        LoginRadioWorker = new javax.swing.JRadioButton();
        LoginRadioCustomer = new javax.swing.JRadioButton();
        LoginButton = new javax.swing.JButton();
        OnlineSportsTitle = new javax.swing.JLabel();
        OnlineSportsTitle1 = new javax.swing.JLabel();
        WorkerDashboard = new javax.swing.JPanel();
        WorkerLogout = new javax.swing.JButton();
        WorkerDashboardTitle = new javax.swing.JLabel();
        WorkerDashboardMenu = new javax.swing.JPanel();
        WorkerDashboardMenuItems = new javax.swing.JButton();
        WorkerDashboardMenuUsers = new javax.swing.JButton();
        WorkerDashboardMenuAddItem = new javax.swing.JButton();
        WorkerDashboardMenuAddUser = new javax.swing.JButton();
        WorkerDashboardMenuOverdues = new javax.swing.JButton();
        WorkerItems = new javax.swing.JPanel();
        WorkerItemScroll = new javax.swing.JScrollPane();
        WorkerItemTable = new javax.swing.JTable();
        WorkerCustomers = new javax.swing.JPanel();
        WorkerCustomerScroll = new javax.swing.JScrollPane();
        WorkerCustomerTable = new javax.swing.JTable();
        WorkerCustomerDescriptionTitle = new javax.swing.JLabel();
        WorkerCustomerDescription = new javax.swing.JLabel();
        WorkerOverdues = new javax.swing.JPanel();
        WorkerOverdueScroll = new javax.swing.JScrollPane();
        WorkerOverdueTable = new javax.swing.JTable();
        CustomerDashboard = new javax.swing.JPanel();
        CustomerLogout = new javax.swing.JButton();
        CustomerDashboardTitle = new javax.swing.JLabel();
        CustomerDashboardMenu = new javax.swing.JPanel();
        CustomerDashboardMenuHelp = new javax.swing.JButton();
        CustomerDashboardMenuItems = new javax.swing.JButton();
        CustomerDashboardMenuUsers = new javax.swing.JButton();
        CustomerDashboardMenuAddUser = new javax.swing.JButton();
        CustomerItems = new javax.swing.JPanel();
        CustomerItemScroll = new javax.swing.JScrollPane();
        CustomerItemTable = new javax.swing.JTable();
        CustomerRentItems = new javax.swing.JPanel();
        CustomerRentItemScroll = new javax.swing.JScrollPane();
        CustomerRentItemTable = new javax.swing.JTable();
        CustomerRentItemDescriptionTitle = new javax.swing.JLabel();
        CustomerRentItemDescription = new javax.swing.JLabel();
        CustomerPurchasedItems = new javax.swing.JPanel();
        CustomerPurchasedItemScroll = new javax.swing.JScrollPane();
        CustomerPurchasedItemsTable = new javax.swing.JTable();
        CustomerPurchasedItemDescriptionTitle = new javax.swing.JLabel();
        CustomerPurchasedItemDescription = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setLayout(null);

        LoginFields.setBackground(new java.awt.Color(255, 255, 255));
        LoginFields.setLayout(null);

        LoginPassword.setBackground(new java.awt.Color(204, 204, 204));
        LoginFields.add(LoginPassword);
        LoginPassword.setBounds(210, 130, 330, 40);

        LoginUsername.setBackground(new java.awt.Color(204, 204, 204));
        LoginFields.add(LoginUsername);
        LoginUsername.setBounds(210, 80, 330, 40);

        LoginPasswordText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginPasswordText.setText("Pascode :");
        LoginFields.add(LoginPasswordText);
        LoginPasswordText.setBounds(120, 130, 90, 40);

        LoginUserNameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginUserNameText.setText("Username :");
        LoginFields.add(LoginUserNameText);
        LoginUserNameText.setBounds(120, 80, 90, 40);

        LoginRadioWorker.setText("Worker");
        LoginRadioWorker.setOpaque(false);
        LoginRadioWorker.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LoginRadioWorkerItemStateChanged(evt);
            }
        });
        LoginFields.add(LoginRadioWorker);
        LoginRadioWorker.setBounds(310, 180, 110, 25);

        LoginRadioCustomer.setText("Customer");
        LoginRadioCustomer.setOpaque(false);
        LoginRadioCustomer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LoginRadioCustomerItemStateChanged(evt);
            }
        });
        LoginFields.add(LoginRadioCustomer);
        LoginRadioCustomer.setBounds(210, 180, 100, 25);

        LoginButton.setBackground(new java.awt.Color(0, 0, 0));
        LoginButton.setForeground(new java.awt.Color(204, 204, 204));
        LoginButton.setText("SignIn");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginFields.add(LoginButton);
        LoginButton.setBounds(210, 210, 110, 30);

        LoginPanel.add(LoginFields);
        LoginFields.setBounds(240, 220, 550, 280);

        OnlineSportsTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        OnlineSportsTitle.setForeground(new java.awt.Color(255, 51, 0));
        OnlineSportsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OnlineSportsTitle.setText("Get Into System");
        LoginPanel.add(OnlineSportsTitle);
        OnlineSportsTitle.setBounds(0, 90, 1020, 100);

        OnlineSportsTitle1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        OnlineSportsTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OnlineSportsTitle1.setText("Rental Store System");
        LoginPanel.add(OnlineSportsTitle1);
        OnlineSportsTitle1.setBounds(0, 40, 1020, 100);

        getContentPane().add(LoginPanel);

        WorkerDashboard.setBackground(new java.awt.Color(255, 255, 255));
        WorkerDashboard.setLayout(null);

        WorkerLogout.setText("Logout");
        WorkerLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerLogoutActionPerformed(evt);
            }
        });
        WorkerDashboard.add(WorkerLogout);
        WorkerLogout.setBounds(920, 20, 79, 25);

        WorkerDashboardTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        WorkerDashboardTitle.setForeground(new java.awt.Color(204, 204, 204));
        WorkerDashboardTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorkerDashboardTitle.setText("Welcome to Rental Store System");
        WorkerDashboard.add(WorkerDashboardTitle);
        WorkerDashboardTitle.setBounds(0, 20, 1020, 100);

        WorkerDashboardMenu.setBackground(new java.awt.Color(255, 255, 255));
        WorkerDashboardMenu.setLayout(null);

        WorkerDashboardMenuItems.setBackground(new java.awt.Color(255, 255, 255));
        WorkerDashboardMenuItems.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WorkerDashboardMenuItems.setText("Items");
        WorkerDashboardMenuItems.setContentAreaFilled(false);
        WorkerDashboardMenuItems.setOpaque(false);
        WorkerDashboardMenuItems.setVerifyInputWhenFocusTarget(false);
        WorkerDashboardMenuItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerDashboardMenuItemsActionPerformed(evt);
            }
        });
        WorkerDashboardMenu.add(WorkerDashboardMenuItems);
        WorkerDashboardMenuItems.setBounds(0, 0, 140, 40);

        WorkerDashboardMenuUsers.setBackground(new java.awt.Color(255, 255, 255));
        WorkerDashboardMenuUsers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WorkerDashboardMenuUsers.setText("Customers");
        WorkerDashboardMenuUsers.setContentAreaFilled(false);
        WorkerDashboardMenuUsers.setOpaque(false);
        WorkerDashboardMenuUsers.setVerifyInputWhenFocusTarget(false);
        WorkerDashboardMenuUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerDashboardMenuUsersActionPerformed(evt);
            }
        });
        WorkerDashboardMenu.add(WorkerDashboardMenuUsers);
        WorkerDashboardMenuUsers.setBounds(140, 0, 140, 40);

        WorkerDashboardMenuAddItem.setBackground(new java.awt.Color(255, 255, 255));
        WorkerDashboardMenuAddItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WorkerDashboardMenuAddItem.setText("Add Item");
        WorkerDashboardMenuAddItem.setContentAreaFilled(false);
        WorkerDashboardMenuAddItem.setOpaque(false);
        WorkerDashboardMenuAddItem.setVerifyInputWhenFocusTarget(false);
        WorkerDashboardMenuAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerDashboardMenuAddItemActionPerformed(evt);
            }
        });
        WorkerDashboardMenu.add(WorkerDashboardMenuAddItem);
        WorkerDashboardMenuAddItem.setBounds(280, 0, 140, 40);

        WorkerDashboardMenuAddUser.setBackground(new java.awt.Color(255, 255, 255));
        WorkerDashboardMenuAddUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WorkerDashboardMenuAddUser.setText("Add Customer");
        WorkerDashboardMenuAddUser.setContentAreaFilled(false);
        WorkerDashboardMenuAddUser.setOpaque(false);
        WorkerDashboardMenuAddUser.setVerifyInputWhenFocusTarget(false);
        WorkerDashboardMenuAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerDashboardMenuAddUserActionPerformed(evt);
            }
        });
        WorkerDashboardMenu.add(WorkerDashboardMenuAddUser);
        WorkerDashboardMenuAddUser.setBounds(420, 0, 180, 40);

        WorkerDashboardMenuOverdues.setBackground(new java.awt.Color(255, 255, 255));
        WorkerDashboardMenuOverdues.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WorkerDashboardMenuOverdues.setText("Check Overdues");
        WorkerDashboardMenuOverdues.setContentAreaFilled(false);
        WorkerDashboardMenuOverdues.setOpaque(false);
        WorkerDashboardMenuOverdues.setVerifyInputWhenFocusTarget(false);
        WorkerDashboardMenuOverdues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerDashboardMenuOverduesActionPerformed(evt);
            }
        });
        WorkerDashboardMenu.add(WorkerDashboardMenuOverdues);
        WorkerDashboardMenuOverdues.setBounds(600, 0, 190, 40);

        WorkerDashboard.add(WorkerDashboardMenu);
        WorkerDashboardMenu.setBounds(30, 130, 960, 40);

        WorkerItems.setBackground(new java.awt.Color(255, 255, 255));
        WorkerItems.setLayout(null);

        WorkerItemScroll.setBackground(new java.awt.Color(255, 255, 255));
        WorkerItemScroll.setOpaque(false);

        WorkerItemTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WorkerItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemId", "ItemName", "ItemBrand", "ItemColour", "ItemStock", "PurchasePrice", "RentalPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        WorkerItemTable.setFocusable(false);
        WorkerItemTable.setOpaque(false);
        WorkerItemTable.setRowHeight(30);
        WorkerItemTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        WorkerItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkerItemTableMouseClicked(evt);
            }
        });
        WorkerItemScroll.setViewportView(WorkerItemTable);

        WorkerItems.add(WorkerItemScroll);
        WorkerItemScroll.setBounds(0, 0, 960, 380);

        WorkerDashboard.add(WorkerItems);
        WorkerItems.setBounds(30, 180, 960, 490);

        WorkerCustomers.setBackground(new java.awt.Color(255, 255, 255));
        WorkerCustomers.setLayout(null);

        WorkerCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerId", "CustomerName", "CustomerContact", "UserName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        WorkerCustomerTable.setFocusable(false);
        WorkerCustomerTable.setRequestFocusEnabled(false);
        WorkerCustomerTable.setRowHeight(20);
        WorkerCustomerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        WorkerCustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkerCustomerTableMouseClicked(evt);
            }
        });
        WorkerCustomerScroll.setViewportView(WorkerCustomerTable);

        WorkerCustomers.add(WorkerCustomerScroll);
        WorkerCustomerScroll.setBounds(0, 0, 960, 380);

        WorkerCustomerDescriptionTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WorkerCustomerDescriptionTitle.setText("Address :");
        WorkerCustomers.add(WorkerCustomerDescriptionTitle);
        WorkerCustomerDescriptionTitle.setBounds(10, 410, 90, 30);

        WorkerCustomerDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WorkerCustomers.add(WorkerCustomerDescription);
        WorkerCustomerDescription.setBounds(100, 410, 850, 30);

        WorkerDashboard.add(WorkerCustomers);
        WorkerCustomers.setBounds(30, 180, 960, 490);

        WorkerOverdues.setBackground(new java.awt.Color(255, 255, 255));
        WorkerOverdues.setLayout(null);

        WorkerOverdueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RentId", "ItemId", "ItemName", "ItemBrand", "ItemColour", "RentalPrice", "RentDate", "ReturnDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        WorkerOverdueScroll.setViewportView(WorkerOverdueTable);

        WorkerOverdues.add(WorkerOverdueScroll);
        WorkerOverdueScroll.setBounds(0, 0, 960, 380);

        WorkerDashboard.add(WorkerOverdues);
        WorkerOverdues.setBounds(30, 180, 960, 490);

        getContentPane().add(WorkerDashboard);

        CustomerDashboard.setBackground(new java.awt.Color(255, 255, 255));
        CustomerDashboard.setForeground(new java.awt.Color(255, 255, 255));
        CustomerDashboard.setLayout(null);

        CustomerLogout.setText("Logout");
        CustomerLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerLogoutActionPerformed(evt);
            }
        });
        CustomerDashboard.add(CustomerLogout);
        CustomerLogout.setBounds(920, 20, 79, 25);

        CustomerDashboardTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        CustomerDashboardTitle.setForeground(new java.awt.Color(204, 204, 204));
        CustomerDashboardTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerDashboardTitle.setText("Rental Store System");
        CustomerDashboard.add(CustomerDashboardTitle);
        CustomerDashboardTitle.setBounds(0, 20, 1020, 100);

        CustomerDashboardMenu.setBackground(new java.awt.Color(255, 255, 255));
        CustomerDashboardMenu.setLayout(null);

        CustomerDashboardMenuHelp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CustomerDashboardMenuHelp.setText("Help");
        CustomerDashboardMenuHelp.setContentAreaFilled(false);
        CustomerDashboardMenuHelp.setOpaque(false);
        CustomerDashboardMenuHelp.setRequestFocusEnabled(false);
        CustomerDashboardMenuHelp.setVerifyInputWhenFocusTarget(false);
        CustomerDashboardMenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDashboardMenuHelpActionPerformed(evt);
            }
        });
        CustomerDashboardMenu.add(CustomerDashboardMenuHelp);
        CustomerDashboardMenuHelp.setBounds(520, 0, 120, 40);

        CustomerDashboardMenuItems.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CustomerDashboardMenuItems.setText("Items");
        CustomerDashboardMenuItems.setContentAreaFilled(false);
        CustomerDashboardMenuItems.setOpaque(false);
        CustomerDashboardMenuItems.setRequestFocusEnabled(false);
        CustomerDashboardMenuItems.setVerifyInputWhenFocusTarget(false);
        CustomerDashboardMenuItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDashboardMenuItemsActionPerformed(evt);
            }
        });
        CustomerDashboardMenu.add(CustomerDashboardMenuItems);
        CustomerDashboardMenuItems.setBounds(0, 0, 140, 40);

        CustomerDashboardMenuUsers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CustomerDashboardMenuUsers.setText("Rent Items");
        CustomerDashboardMenuUsers.setContentAreaFilled(false);
        CustomerDashboardMenuUsers.setOpaque(false);
        CustomerDashboardMenuUsers.setRequestFocusEnabled(false);
        CustomerDashboardMenuUsers.setVerifyInputWhenFocusTarget(false);
        CustomerDashboardMenuUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDashboardMenuUsersActionPerformed(evt);
            }
        });
        CustomerDashboardMenu.add(CustomerDashboardMenuUsers);
        CustomerDashboardMenuUsers.setBounds(140, 0, 140, 40);

        CustomerDashboardMenuAddUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CustomerDashboardMenuAddUser.setText("Purchased Items");
        CustomerDashboardMenuAddUser.setContentAreaFilled(false);
        CustomerDashboardMenuAddUser.setOpaque(false);
        CustomerDashboardMenuAddUser.setRequestFocusEnabled(false);
        CustomerDashboardMenuAddUser.setVerifyInputWhenFocusTarget(false);
        CustomerDashboardMenuAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDashboardMenuAddUserActionPerformed(evt);
            }
        });
        CustomerDashboardMenu.add(CustomerDashboardMenuAddUser);
        CustomerDashboardMenuAddUser.setBounds(280, 0, 230, 40);

        CustomerDashboard.add(CustomerDashboardMenu);
        CustomerDashboardMenu.setBounds(30, 130, 960, 40);

        CustomerItems.setBackground(new java.awt.Color(255, 255, 255));
        CustomerItems.setLayout(null);

        CustomerItemTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CustomerItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemId", "ItemName", "ItemBrand", "ItemColour", "ItemStock", "PurchasePrice", "RentalPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerItemTableMouseClicked(evt);
            }
        });
        CustomerItemScroll.setViewportView(CustomerItemTable);
        if (CustomerItemTable.getColumnModel().getColumnCount() > 0) {
            CustomerItemTable.getColumnModel().getColumn(4).setHeaderValue("ItemStock");
            CustomerItemTable.getColumnModel().getColumn(5).setHeaderValue("PurchasePrice");
            CustomerItemTable.getColumnModel().getColumn(6).setHeaderValue("RentalPrice");
        }

        CustomerItems.add(CustomerItemScroll);
        CustomerItemScroll.setBounds(0, 0, 960, 380);

        CustomerDashboard.add(CustomerItems);
        CustomerItems.setBounds(30, 180, 960, 490);

        CustomerRentItems.setBackground(new java.awt.Color(255, 255, 255));
        CustomerRentItems.setLayout(null);

        CustomerRentItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RentId", "ItemId", "ItemName", "ItemBrand", "ItemColour", "RentalPrice", "RentDate", "ReturnDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerRentItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerRentItemTableMouseClicked(evt);
            }
        });
        CustomerRentItemScroll.setViewportView(CustomerRentItemTable);

        CustomerRentItems.add(CustomerRentItemScroll);
        CustomerRentItemScroll.setBounds(0, 0, 960, 380);

        CustomerRentItemDescriptionTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CustomerRentItemDescriptionTitle.setText("Description:");
        CustomerRentItems.add(CustomerRentItemDescriptionTitle);
        CustomerRentItemDescriptionTitle.setBounds(10, 410, 90, 30);

        CustomerRentItemDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CustomerRentItems.add(CustomerRentItemDescription);
        CustomerRentItemDescription.setBounds(100, 410, 850, 30);

        CustomerDashboard.add(CustomerRentItems);
        CustomerRentItems.setBounds(30, 180, 960, 490);

        CustomerPurchasedItems.setBackground(new java.awt.Color(255, 255, 255));
        CustomerPurchasedItems.setLayout(null);

        CustomerPurchasedItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PurchaseId", "ItemId", "ItemName", "ItemBrand", "ItemColour", "PurchasePrice", "PurchaseDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerPurchasedItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerPurchasedItemsTableMouseClicked(evt);
            }
        });
        CustomerPurchasedItemScroll.setViewportView(CustomerPurchasedItemsTable);

        CustomerPurchasedItems.add(CustomerPurchasedItemScroll);
        CustomerPurchasedItemScroll.setBounds(0, 0, 960, 380);

        CustomerPurchasedItemDescriptionTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CustomerPurchasedItemDescriptionTitle.setText("Description:");
        CustomerPurchasedItems.add(CustomerPurchasedItemDescriptionTitle);
        CustomerPurchasedItemDescriptionTitle.setBounds(10, 410, 90, 30);

        CustomerPurchasedItemDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CustomerPurchasedItems.add(CustomerPurchasedItemDescription);
        CustomerPurchasedItemDescription.setBounds(100, 410, 850, 30);

        CustomerDashboard.add(CustomerPurchasedItems);
        CustomerPurchasedItems.setBounds(30, 180, 960, 490);

        getContentPane().add(CustomerDashboard);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WorkerDashboardMenuAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerDashboardMenuAddItemActionPerformed
        WorkerItems();
        storeItemAdd = new StoreItemAdd(rentalStoreDb, storeId);
        storeItemAdd.setVisible(true);
    }//GEN-LAST:event_WorkerDashboardMenuAddItemActionPerformed

    private void WorkerDashboardMenuItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerDashboardMenuItemsActionPerformed
        WorkerItems();
    }//GEN-LAST:event_WorkerDashboardMenuItemsActionPerformed

    private void WorkerDashboardMenuUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerDashboardMenuUsersActionPerformed
        WorkerCustomers();
    }//GEN-LAST:event_WorkerDashboardMenuUsersActionPerformed

    private void WorkerDashboardMenuOverduesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerDashboardMenuOverduesActionPerformed
        WorkerOverdues();
    }//GEN-LAST:event_WorkerDashboardMenuOverduesActionPerformed

    private void WorkerDashboardMenuAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerDashboardMenuAddUserActionPerformed
        WorkerCustomers();
        storeCustomerAdd.setVisible(true);
    }//GEN-LAST:event_WorkerDashboardMenuAddUserActionPerformed

    private void CustomerDashboardMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDashboardMenuHelpActionPerformed

    }//GEN-LAST:event_CustomerDashboardMenuHelpActionPerformed

    private void CustomerDashboardMenuItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDashboardMenuItemsActionPerformed
        csItems();
    }//GEN-LAST:event_CustomerDashboardMenuItemsActionPerformed

    private void CustomerDashboardMenuUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDashboardMenuUsersActionPerformed
        csRentItems();
    }//GEN-LAST:event_CustomerDashboardMenuUsersActionPerformed

    private void CustomerDashboardMenuAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDashboardMenuAddUserActionPerformed
        csPurchasedItems();
    }//GEN-LAST:event_CustomerDashboardMenuAddUserActionPerformed

    private void WorkerItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkerItemTableMouseClicked
        WorkerShowItemDescription();
        if(evt.getClickCount() >= 2){
            storeItemUpdateForm();
        }
    }//GEN-LAST:event_WorkerItemTableMouseClicked

    private void WorkerCustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkerCustomerTableMouseClicked
        WorkerShowCustomerAddress();
        if(evt.getClickCount() >= 2){
            storeCustomerUpdateForm();
        }
    }//GEN-LAST:event_WorkerCustomerTableMouseClicked

    private void LoginRadioCustomerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LoginRadioCustomerItemStateChanged
       if(LoginRadioCustomer.isSelected()){
           LoginRadioWorker.setSelected(false);
       }
    }//GEN-LAST:event_LoginRadioCustomerItemStateChanged

    private void LoginRadioWorkerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LoginRadioWorkerItemStateChanged
       if(LoginRadioWorker.isSelected()){
           LoginRadioCustomer.setSelected(false);
       }
    }//GEN-LAST:event_LoginRadioWorkerItemStateChanged

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if(LoginRadioCustomer.isSelected()){
            try {
                customer = rentalStoreDb.csLogin(LoginUsername.getText());
                if(customer!=null){
                if(customer.getCustomerPassword().equals(LoginPassword.getText())){
                    storeItemList = rentalStoreDb.csAvailableStoreItems(storeId);
                    storePurchaseList = rentalStoreDb.csGetAllPurchases(customer.getCustomerUsername());
                    rentList = rentalStoreDb.csGetAllRentItems(customer.getCustomerUsername());
                    csViewItems();
                    csViewPurchases();
                    csViewRents();              
                    login(1);
                    
                }else{
                    eM("Invalid Customer login (Username OR Password)");
                }
                }else{
                    eM("Customer not found!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(LoginRadioWorker.isSelected()){
            try {
                worker = rentalStoreDb.WorkerLogin(LoginUsername.getText());
                if(worker!=null){
                if(worker.getworkerPassword().equals(LoginPassword.getText())){
                        storeItemList = rentalStoreDb.WorkerAvailableStoreItems(storeId);                    
                        WorkerViewItems();
                        storeCustomerList = rentalStoreDb.WorkerGetCustomers();
                        WorkerViewCustomers();
                        rentList = rentalStoreDb.WorkerGetAllOverdueItems();
                        WorkerGetAllOverdueItems();
                        login(2);

                }else{
                    eM("Invalid worker login (Username OR Password)");
                }
                }else{
                    eM("worker not found!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        if(LoginRadioWorker.isSelected()){
            
        }        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CustomerItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerItemTableMouseClicked
        csShowItemDescription();
        if(evt.getClickCount() >= 2){
            csPrForm();
        }
    }//GEN-LAST:event_CustomerItemTableMouseClicked

    private void CustomerRentItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerRentItemTableMouseClicked
        csShowRentDescription();
        if(evt.getClickCount() >= 2){
            csReturnRentItemForm();
        }
    }//GEN-LAST:event_CustomerRentItemTableMouseClicked

    private void CustomerPurchasedItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerPurchasedItemsTableMouseClicked
        csShowPurchaseDescription();
        if(evt.getClickCount() >= 2){
            csReturnPurchaseItemForm();
        }        
    }//GEN-LAST:event_CustomerPurchasedItemsTableMouseClicked

    private void WorkerLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerLogoutActionPerformed
        start();
    }//GEN-LAST:event_WorkerLogoutActionPerformed

    private void CustomerLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerLogoutActionPerformed
        start();
    }//GEN-LAST:event_CustomerLogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CustomerDashboard;
    private javax.swing.JPanel CustomerDashboardMenu;
    private javax.swing.JButton CustomerDashboardMenuAddUser;
    private javax.swing.JButton CustomerDashboardMenuHelp;
    private javax.swing.JButton CustomerDashboardMenuItems;
    private javax.swing.JButton CustomerDashboardMenuUsers;
    private javax.swing.JLabel CustomerDashboardTitle;
    private javax.swing.JScrollPane CustomerItemScroll;
    private javax.swing.JTable CustomerItemTable;
    private javax.swing.JPanel CustomerItems;
    private javax.swing.JButton CustomerLogout;
    private javax.swing.JLabel CustomerPurchasedItemDescription;
    private javax.swing.JLabel CustomerPurchasedItemDescriptionTitle;
    private javax.swing.JScrollPane CustomerPurchasedItemScroll;
    private javax.swing.JPanel CustomerPurchasedItems;
    private javax.swing.JTable CustomerPurchasedItemsTable;
    private javax.swing.JLabel CustomerRentItemDescription;
    private javax.swing.JLabel CustomerRentItemDescriptionTitle;
    private javax.swing.JScrollPane CustomerRentItemScroll;
    private javax.swing.JTable CustomerRentItemTable;
    private javax.swing.JPanel CustomerRentItems;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginFields;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField LoginPassword;
    private javax.swing.JLabel LoginPasswordText;
    private javax.swing.JRadioButton LoginRadioCustomer;
    private javax.swing.JRadioButton LoginRadioWorker;
    private javax.swing.JLabel LoginUserNameText;
    private javax.swing.JTextField LoginUsername;
    private javax.swing.JLabel OnlineSportsTitle;
    private javax.swing.JLabel OnlineSportsTitle1;
    private javax.swing.JLabel WorkerCustomerDescription;
    private javax.swing.JLabel WorkerCustomerDescriptionTitle;
    private javax.swing.JScrollPane WorkerCustomerScroll;
    private javax.swing.JTable WorkerCustomerTable;
    private javax.swing.JPanel WorkerCustomers;
    private javax.swing.JPanel WorkerDashboard;
    private javax.swing.JPanel WorkerDashboardMenu;
    private javax.swing.JButton WorkerDashboardMenuAddItem;
    private javax.swing.JButton WorkerDashboardMenuAddUser;
    private javax.swing.JButton WorkerDashboardMenuItems;
    private javax.swing.JButton WorkerDashboardMenuOverdues;
    private javax.swing.JButton WorkerDashboardMenuUsers;
    private javax.swing.JLabel WorkerDashboardTitle;
    private javax.swing.JScrollPane WorkerItemScroll;
    private javax.swing.JTable WorkerItemTable;
    private javax.swing.JPanel WorkerItems;
    private javax.swing.JButton WorkerLogout;
    private javax.swing.JScrollPane WorkerOverdueScroll;
    private javax.swing.JTable WorkerOverdueTable;
    private javax.swing.JPanel WorkerOverdues;
    // End of variables declaration//GEN-END:variables

public void start(){
    LoginPassword.setText("");
    CustomerDashboard.setVisible(false);
    WorkerDashboard.setVisible(false);
    LoginRadioCustomer.setSelected(true); // login state to customer 1st
    LoginPanel.setVisible(true);
}
public void login(int state){  
    WorkerDashboard.setVisible(false);
    LoginPanel.setVisible(false);
    if(state == 1){
        CustomerDashboard.setVisible(true);
    }
    if(state == 2){
        WorkerDashboard.setVisible(true);
    }
}
public void WorkerItems(){
    WorkerOverdues.setVisible(false);
    WorkerCustomers.setVisible(false);
    WorkerItems.setVisible(true);
}
public void WorkerReports(){
    WorkerOverdues.setVisible(false);
    WorkerCustomers.setVisible(false);
    WorkerItems.setVisible(false);
}
public void WorkerOverdues(){ 
    WorkerOverdues.setVisible(true);
    WorkerCustomers.setVisible(false);
    WorkerItems.setVisible(false);
}
public void WorkerCustomers(){ 
    WorkerOverdues.setVisible(false);
    WorkerCustomers.setVisible(true);
    WorkerItems.setVisible(false);
}
public void csItems(){
    CustomerRentItems.setVisible(false);
    CustomerPurchasedItems.setVisible(false);
    CustomerItems.setVisible(true);
}
public void csRentItems(){
    CustomerPurchasedItems.setVisible(false);
    CustomerItems.setVisible(false);
    CustomerRentItems.setVisible(true); 
}
public void csOverdueItems(){
    CustomerRentItems.setVisible(false);
    CustomerPurchasedItems.setVisible(false);
    CustomerItems.setVisible(false);
}
public void csPurchasedItems(){
    CustomerRentItems.setVisible(false);
    CustomerItems.setVisible(false);
    CustomerPurchasedItems.setVisible(true);
}
public void WorkerViewItems(){
    storeItemListModel = (DefaultTableModel) WorkerItemTable.getModel();
    storeItemListRowData = new Object[7];
    itemsView(storeItemListModel, storeItemListRowData, storeItemList);
}
public void csViewItems(){
    storeItemListModel = (DefaultTableModel) CustomerItemTable.getModel();
    storeItemListRowData = new Object[7];
    itemsView(storeItemListModel, storeItemListRowData, storeItemList);
}
public void csViewPurchases(){
    storePurchaseListModel = (DefaultTableModel) CustomerPurchasedItemsTable.getModel();
    storePurchaseListRowData = new Object[7];
    viewPurchases(storePurchaseListModel, storePurchaseListRowData, storePurchaseList);
}
public void csViewRents(){
    rentListModel = (DefaultTableModel) CustomerRentItemTable.getModel();
    rentListRowData = new Object[8];
    viewRents(rentListModel, rentListRowData, rentList);
}
public void WorkerViewCustomers(){
    WorkerstoreCustomerListModel = (DefaultTableModel) WorkerCustomerTable.getModel();
    WorkerstoreCustomerListRowData = new Object[5];
    viewCustomers(WorkerstoreCustomerListModel, WorkerstoreCustomerListRowData, storeCustomerList);
}
public void WorkerGetAllOverdueItems(){
    WorkerOverdueListModel = (DefaultTableModel) WorkerOverdueTable.getModel();
    WorkerOverdueListRowData = new Object[8];
    viewRents(WorkerOverdueListModel, WorkerOverdueListRowData, rentList);
}
public void WorkerShowItemDescription(){
    itemTableRow = 0;
    itemTableRow = WorkerItemTable.getSelectedRow();
}
public void csShowItemDescription(){
    itemTableRow = 0;
    itemTableRow = CustomerItemTable.getSelectedRow();
}
public void csShowRentDescription(){
    rentTableRow = 0;
    rentTableRow = CustomerRentItemTable.getSelectedRow();
    CustomerRentItemDescription.setText(rentList.get(rentTableRow).getItemDescription());  
}
public void csShowPurchaseDescription(){
    purchaseTableRow = 0;
    purchaseTableRow = CustomerPurchasedItemsTable.getSelectedRow();
    CustomerPurchasedItemDescription.setText(storePurchaseList.get(purchaseTableRow).getItemDescription());  
}
public void storeItemUpdateForm(){
    itemTableRow = 0;
    itemTableRow = WorkerItemTable.getSelectedRow();
    item.setItemId(Integer.parseInt(WorkerItemTable.getModel().getValueAt(itemTableRow, 0).toString()));
    item.setItemName(WorkerItemTable.getModel().getValueAt(itemTableRow, 1).toString());
    item.setItemBrand(WorkerItemTable.getModel().getValueAt(itemTableRow, 2).toString());
    item.setItemColour(WorkerItemTable.getModel().getValueAt(itemTableRow, 3).toString());
    item.setItemStock(Integer.parseInt(WorkerItemTable.getModel().getValueAt(itemTableRow, 4).toString()));
    item.setItemPurchasePrice(Integer.parseInt(WorkerItemTable.getModel().getValueAt(itemTableRow, 5).toString()));
    item.setItemRentalPrice(Integer.parseInt(WorkerItemTable.getModel().getValueAt(itemTableRow, 6).toString()));
    item.setSportsStoreId(storeId); // fake storeId setting
    storeItemUpdate = new StoreItemUpdate(rentalStoreDb, item);
    storeItemUpdate.setVisible(true);
}
public void csPrForm(){
    itemTableRow = 0;
    itemTableRow = CustomerItemTable.getSelectedRow();
    item.setItemId(Integer.parseInt(CustomerItemTable.getModel().getValueAt(itemTableRow, 0).toString()));
    item.setItemName(CustomerItemTable.getModel().getValueAt(itemTableRow, 1).toString());
    item.setItemBrand(CustomerItemTable.getModel().getValueAt(itemTableRow, 2).toString());
    item.setItemColour(CustomerItemTable.getModel().getValueAt(itemTableRow, 3).toString());
    item.setItemStock(Integer.parseInt(CustomerItemTable.getModel().getValueAt(itemTableRow, 4).toString()));
    item.setItemPurchasePrice(Integer.parseInt(CustomerItemTable.getModel().getValueAt(itemTableRow, 5).toString()));
    item.setItemRentalPrice(Integer.parseInt(CustomerItemTable.getModel().getValueAt(itemTableRow, 6).toString()));
    item.setSportsStoreId(storeId); // fake storeId setting
    prManager = new PRManager(customer.getCustomerUsername(), rentalStoreDb, item);
    prManager.setVisible(true);
}
public void csReturnRentItemForm(){
    rentTableRow = 0;
    rentTableRow = CustomerRentItemTable.getSelectedRow();
    returnItem = new ItemReturnManager(rentalStoreDb, rentList.get(rentTableRow).getItemId(), rentList.get(rentTableRow).getItemName(), rentList.get(rentTableRow).getRentId(), returnItemStock(rentList.get(rentTableRow).getItemId())+1,0);  
    returnItem.setVisible(true);
}
public void csReturnPurchaseItemForm(){
    purchaseTableRow = 0;
    purchaseTableRow = CustomerPurchasedItemsTable.getSelectedRow();
    returnItem = new ItemReturnManager(rentalStoreDb, storePurchaseList.get(purchaseTableRow).getItemId(), storePurchaseList.get(purchaseTableRow).getItemName(), 0, returnItemStock(storePurchaseList.get(purchaseTableRow).getItemId())+1, storePurchaseList.get(purchaseTableRow).getPurchaseId());  
    returnItem.setVisible(true);
}
public void WorkerShowCustomerAddress(){
    customerTableRow = 0;
    customerTableRow = WorkerCustomerTable.getSelectedRow();
    WorkerCustomerDescription.setText(storeCustomerList.get(customerTableRow).getCustomerAddress());  
}
public void storeCustomerUpdateForm(){
    customerTableRow = 0;
    customerTableRow = WorkerCustomerTable.getSelectedRow();
    customerUpdate.setCustomerId(Integer.parseInt(WorkerCustomerTable.getModel().getValueAt(customerTableRow, 0).toString()));
    customerUpdate.setCustomerName(WorkerCustomerTable.getModel().getValueAt(customerTableRow, 1).toString());
    customerUpdate.setCustomerContact(WorkerCustomerTable.getModel().getValueAt(customerTableRow, 2).toString());
    customerUpdate.setCustomerUsername(WorkerCustomerTable.getModel().getValueAt(customerTableRow, 3).toString());
    customerUpdate.setCustomerAddress(WorkerCustomerDescription.getText());
    storeCustomerUpdate = new StoreCustomerUpdate(rentalStoreDb, customerUpdate);
    storeCustomerUpdate.setVisible(true);
}

public void sync() 
    {                    
        Thread clock=new Thread()
        {
            public void run()
            {
                for(;;)
                    
                {
                    if(storeItemUpdate !=null){
                        if(storeItemUpdate.update == 1)
                        { 
                            storeItemList = rentalStoreDb.WorkerAvailableStoreItems(storeId);
                            WorkerViewItems();
                            storeItemUpdate.update = 0;
                        }      
                    }              
                    if(storeCustomerUpdate !=null){
                        if(storeCustomerUpdate.update == 1)
                        { 
                            storeCustomerList = rentalStoreDb.WorkerGetCustomers();
                            WorkerViewCustomers();
                            storeCustomerUpdate.update = 0;
                        }      
                    }   
                    if(storeItemAdd !=null){
                        if(storeItemAdd.update == 1)
                        { 
                            storeItemList = rentalStoreDb.WorkerAvailableStoreItems(storeId);
                            WorkerViewItems();
                            storeItemAdd.update = 0;
                        }      
                    }    
                    if(storeCustomerAdd !=null){
                        if(storeCustomerAdd.update == 1)
                        { 
                            storeCustomerList = rentalStoreDb.WorkerGetCustomers();
                            WorkerViewCustomers();
                            storeCustomerAdd.update = 0;
                        }      
                    } 

                    if(returnItem!=null){
                    if(returnItem.update == 1)
                        { 
                            try {
                                storeItemList = rentalStoreDb.csAvailableStoreItems(storeId);
                                rentList = rentalStoreDb.csGetAllRentItems(customer.getCustomerUsername());
                                returnItem.update = 0;
                                csViewItems();
                                csViewRents();
                                csRentItems();
                            } catch (SQLException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }      
                        if(returnItem.update == 2)
                        { 
                            try {
                                storeItemList = rentalStoreDb.csAvailableStoreItems(storeId);
                                storePurchaseList = rentalStoreDb.csGetAllPurchases(customer.getCustomerUsername());
                                returnItem.update = 0;
                                csViewItems();
                                csViewPurchases();
                                csPurchasedItems();
                            } catch (SQLException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                        
                    if(prManager !=null){
                        if(prManager.update == 1)
                        { 
                            try {
                                storeItemList = rentalStoreDb.csAvailableStoreItems(storeId);
                                storePurchaseList = rentalStoreDb.csGetAllPurchases(customer.getCustomerUsername());
                                rentList = rentalStoreDb.csGetAllRentItems(customer.getCustomerUsername());
                                csViewItems();
                                csViewPurchases();
                                csViewRents();
                                csItems();
                                prManager.update = 0;
                            } catch (SQLException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }      
                    }                            
                    try {
                        
                        sleep(50);
                        
                    } catch (Exception ex) {
                    }

                }
            }
        };
   
        clock.start();                       
    }

public int returnItemStock(int itemId){
    int itemStock = 0;
    for(int i=0;i<storeItemList.size();i++){
       if(storeItemList.get(i).getItemId() == itemId){
           itemStock = storeItemList.get(i).getItemStock();
       } 
    }
    return itemStock;
}

public void viewCustomers(DefaultTableModel model, Object rowData[], ArrayList<StoreCustomer> storeCustomerList){
        
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {
            model.removeRow(i);
        }     
            for(int i=0;i<storeCustomerList.size();i++){
                rowData[0] = storeCustomerList.get(i).getCustomerId();
                rowData[1] = storeCustomerList.get(i).getCustomerName();
                rowData[2] = storeCustomerList.get(i).getCustomerContact();
                rowData[3] = storeCustomerList.get(i).getCustomerUsername();
                model.addRow(rowData);   
        } 
 
}   
public void viewRents(DefaultTableModel model, Object rowData[], ArrayList<StoreRent> rentList){
        
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {
            model.removeRow(i);
        }     
            for(int i=0;i<rentList.size();i++){
                rowData[0] = rentList.get(i).getRentId();
                rowData[1] = rentList.get(i).getItemId();
                rowData[2] = rentList.get(i).getItemName();
                rowData[3] = rentList.get(i).getItemBrand();
                rowData[4] = rentList.get(i).getItemColour();
                rowData[5] = rentList.get(i).getRentalPrice();
                rowData[6] = rentList.get(i).getRentDate().toString();
                rowData[7] = rentList.get(i).getReturnDate().toString();
                model.addRow(rowData);   
        }   
            
} 
public void viewPurchases(DefaultTableModel model, Object rowData[], ArrayList<StorePurchase> storePurchaseList){
        
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {
            model.removeRow(i);
        }     
            for(int i=0;i<storePurchaseList.size();i++){
                rowData[0] = storePurchaseList.get(i).getPurchaseId();
                rowData[1] = storePurchaseList.get(i).getItemId();
                rowData[2] = storePurchaseList.get(i).getItemName();
                rowData[3] = storePurchaseList.get(i).getItemBrand();
                rowData[4] = storePurchaseList.get(i).getItemColour();
                rowData[5] = storePurchaseList.get(i).getItemPurchasePrice();
                rowData[6] = storePurchaseList.get(i).getPurchaseDate().toString();
                model.addRow(rowData);   
        }   
            
}  
public void itemsView(DefaultTableModel model, Object rowData[], ArrayList<StoreItem> storeItemList){
        
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {
            model.removeRow(i);
        }     
            for(int i=0;i<storeItemList.size();i++){
                rowData[0] = storeItemList.get(i).getItemId();
                rowData[1] = storeItemList.get(i).getItemName();
                rowData[2] = storeItemList.get(i).getItemBrand();
                rowData[3] = storeItemList.get(i).getItemColour();
                rowData[4] = storeItemList.get(i).getItemStock();
                rowData[5] = storeItemList.get(i).getItemPurchasePrice();
                rowData[6] = storeItemList.get(i).getItemRentalPrice();
                model.addRow(rowData);   
        }   
            
}   
public void eM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.ERROR_MESSAGE);    
}   
public void iM(String message){
    JOptionPane.showMessageDialog(null, ""+message, "Rental Store System", JOptionPane.INFORMATION_MESSAGE);    
}    
}
