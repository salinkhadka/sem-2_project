/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.antiquestore.view;

//import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
        initComponents();
    }
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        SignupButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(146, 136, 42));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\desktop\\Gold Exclusive Royal Luxury Hotel Logo.png")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 252, 247));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Login ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(90, 80, 80, 40);

        jLabel3.setText("Email");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 150, 70, 30);

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        jPanel3.add(emailtxt);
        emailtxt.setBounds(60, 180, 300, 30);

        jLabel4.setText("Password");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(60, 240, 70, 30);
        jPanel3.add(passtxt);
        passtxt.setBounds(60, 270, 300, 30);

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel3.add(LoginButton);
        LoginButton.setBounds(60, 330, 72, 23);

        jLabel5.setText("Don't have account?");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(60, 370, 130, 30);

        SignupButton.setText("SignUP");
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SignupButton);
        SignupButton.setBounds(230, 370, 80, 23);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try {
            //         TODO add your handling code here:    public LoginForm() {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test","root","@bishnu123");
            String sql = "Select * from users where email = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,emailtxt.getText());
            ps.setString(2,passtxt.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                Dash dp = new Dash();
                dp.setVisible(true);
                setVisible(false);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Username and Password doesn't matched");
                emailtxt.setText("");
                passtxt.setText("");    
            }
            conn.close();
    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
            


    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        // TODO add your handling code here:
        SignUp_Page signupFrame= new SignUp_Page();
        signupFrame.setVisible(true);
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        this.dispose();
                
    }//GEN-LAST:event_SignupButtonActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton SignupButton;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField passtxt;
    // End of variables declaration//GEN-END:variables
}
