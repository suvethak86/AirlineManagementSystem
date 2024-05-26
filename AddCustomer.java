/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.programer.airline_management;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ROG
 */
public class AddCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    static String uId ="";
    static String fName="";
    static String lName="";
    public AddCustomer(){
        initComponents();
        autoSet();
        if(isUserExist(uId)){
            save.setVisible(true);
            add.setVisible(false);
        }else{
            save.setVisible(false);
            add.setVisible(true);
        }
    }
    Connection con;
    PreparedStatement pre;
    public AddCustomer(String uId, String fName, String lName){
        this.uId = uId;
        this.fName = fName;
        this.lName = lName;
        
    }
    public boolean isUserExist(String uId){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbPath = "jdbc:mysql://localhost:3306/airlinedb?useSSL=false";
            String dbUser ="root";
            String dbPass = "sysadm!n123";
            con = (Connection)DriverManager.getConnection(dbPath,dbUser,dbPass);
            java.sql.Statement s = con.createStatement();
            String sql = "Select * from customer where Customer_id= '"+uId+"' ";
            pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
                return true;
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
//    
    public void autoSet(){
        CustomerId.setText(uId);
        firstName.setText(fName);
        lastName.setText(lName);
        CustomerId.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        male = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        firstName = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        CustomerId = new javax.swing.JTextField();
        passPort = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        save = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(700, 446));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 348));
        jPanel1.setLayout(null);

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(490, 180, 73, 30);

        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(31, 275, 111, 42);

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(580, 180, 61, 28);

        jLabel7.setText("DOB");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 140, 77, 31);

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact);
        contact.setBounds(490, 220, 151, 30);

        jLabel8.setText("Gender");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 180, 86, 30);
        jPanel1.add(dob);
        dob.setBounds(490, 140, 143, 30);

        jLabel9.setText("Contact No.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(380, 220, 94, 28);

        close.setBackground(new java.awt.Color(153, 153, 255));
        close.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(390, 310, 73, 40);

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        jPanel1.add(firstName);
        firstName.setBounds(150, 90, 160, 30);

        add.setBackground(new java.awt.Color(102, 102, 255));
        add.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(560, 310, 80, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("User Id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(31, 46, 87, 22);
        jPanel1.add(lastName);
        lastName.setBounds(150, 130, 161, 30);

        CustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIdActionPerformed(evt);
            }
        });
        jPanel1.add(CustomerId);
        CustomerId.setBounds(150, 42, 160, 30);
        jPanel1.add(passPort);
        passPort.setBounds(150, 170, 164, 30);

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 87, 32);

        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        jPanel1.add(nic);
        nic.setBounds(150, 210, 164, 30);

        jLabel10.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Programme\\NetBeanProject\\Acciojob-Major-Project\\Airline Management\\Airline_Management\\src\\main\\java\\resources\\Logo.png")); // NOI18N
        jLabel10.setText("airFLY");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(430, 0, 252, 97);

        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 111, 33);

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 260, 164, 86);

        jLabel4.setText("Passport ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 170, 111, 32);

        jLabel5.setText("NIC ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 220, 86, 22);

        save.setBackground(new java.awt.Color(102, 102, 255));
        save.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(560, 310, 72, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void CustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIdActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String FirstName = firstName.getText();
        String LastName = lastName.getText();
        String PassPort = passPort.getText();
        String Nic = nic.getText();
        String Address = address.getText();
        String Gender  = "";
        if(male.isSelected()){
            Gender = "Male";
        }else{
            Gender = "Female";
        }
        String Contact = contact.getText();
        String customerId = CustomerId.getText();
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String date = dt.format(dob.getDate());
        
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb?useSSL=false","root","sysadm!n123");
            } catch (SQLException ex) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            pre = con.prepareStatement("insert into customer (Customer_id,FirstName,LastName,PassPort,New_id,Address,"
                    + "DOB,Gender,Contact) VALUES (?,?,?,?,?,?,?,?,?)");
//          
            pre.setString(1,customerId);
            pre.setString(2,FirstName);
            pre.setString(3,LastName);
            pre.setString(4,PassPort);
            pre.setString(5,Nic);
            pre.setString(6,Address);
            pre.setString(7,date);
            pre.setString(8,Gender);
            pre.setString(9,Contact);
            
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null,"User Details Added");
            this.setVisible(false);
            save.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_addActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_closeActionPerformed

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String FirstName = firstName.getText();
        String LastName = lastName.getText();
        String PassPort = passPort.getText();
        String Nic = nic.getText();
        String Address = address.getText();
        String Gender  = "";
        if(male.isSelected()){
            Gender = "Male";
        }else{
            Gender = "Female";
        }
        String Contact = contact.getText();
        String customerId = CustomerId.getText();
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String date = dt.format(dob.getDate());
        
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb?useSSL=false","root","sysadm!n123");
            } catch (SQLException ex) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            pre = con.prepareStatement("UPDATE customer SET FirstName=?,LastName=?,PassPort=?,New_id=?,Address=?,"
                    + "DOB=?,Gender=?,Contact=? where Customer_id='"+customerId+"'");
            pre.setString(1,FirstName);
            pre.setString(2,LastName);
            pre.setString(3,PassPort);
            pre.setString(4,Nic);
            pre.setString(5,Address);
            pre.setString(6,date);
            pre.setString(7,Gender);
            pre.setString(8,Contact);
            
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null,"User Details Updated");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerId;
    private javax.swing.JButton add;
    private javax.swing.JTextArea address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton close;
    private javax.swing.JTextField contact;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField passPort;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
