/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmsapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author urn
 */
public class PGMSLogin extends javax.swing.JFrame {

    /**
     * Creates new form PGMSLogin
     */
    String email, password, rePassword, address, city, mobile, uname;
    int userType;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    boolean error = false;
    String errMsg = "";
    private String uDomain;

    public PGMSLogin() throws SQLException {
        initComponents();
        cbUDomain.setEnabled(false);
        uDomain="N/A";
        panelSignup.setVisible(false);
        con = DriverManager.getConnection("jdbc:mysql://localhost/ugms", "root", "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbUType = new javax.swing.JComboBox<String>();
        tfEmail = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelSignup = new javax.swing.JPanel();
        cbUTypeReg = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfPasswordReg = new javax.swing.JPasswordField();
        tfEmailReg = new javax.swing.JTextField();
        tfRePssword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        tfUName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();
        tfMobile = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbUDomain = new javax.swing.JComboBox<String>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PGMS");
        setLocation(new java.awt.Point(200, 200));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("UGMS-Login"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Password");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Login as a");

        cbUType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbUType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "NGO Authority", "Govt. Authority", "Administrator" }));

        tfEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tfPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLogin.setText("Log In");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 34)); // NOI18N
        jLabel4.setText("Public Grievance Monitoring System ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("New to PGMS?  ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Register Here");
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("To Enter Please Log-In");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/GRIEVANCES1.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Click Here");
        jLabel9.setToolTipText("");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Issues with Log-In?");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("|");
        jLabel11.setToolTipText("");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLoginLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelLoginLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelLoginLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(cbUType, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(59, 59, 59))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(cbUType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(22, 22, 22))
        );

        getContentPane().add(panelLogin);
        panelLogin.setBounds(40, 50, 700, 390);

        panelSignup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbUTypeReg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbUTypeReg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "NGO Authority", "Govt. Authority", "Administrator" }));
        cbUTypeReg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUTypeRegItemStateChanged(evt);
            }
        });
        cbUTypeReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbUTypeRegMouseClicked(evt);
            }
        });
        cbUTypeReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUTypeRegActionPerformed(evt);
            }
        });
        panelSignup.add(cbUTypeReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 200, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Domain");
        panelSignup.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 27));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Email");
        panelSignup.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 72, 27));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Password");
        panelSignup.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 72, 27));

        tfPasswordReg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        panelSignup.add(tfPasswordReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 140, -1));

        tfEmailReg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelSignup.add(tfEmailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, -1));

        tfRePssword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        panelSignup.add(tfRePssword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 140, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Re-Enter Password");
        panelSignup.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 150, 27));

        tfUName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelSignup.add(tfUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Name");
        panelSignup.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 72, 27));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Address");
        panelSignup.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 72, 27));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfAddress.setColumns(20);
        tfAddress.setLineWrap(true);
        tfAddress.setRows(4);
        jScrollPane1.setViewportView(tfAddress);

        panelSignup.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 200, 60));

        tfMobile.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelSignup.add(tfMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 140, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Mobile");
        panelSignup.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 72, 27));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("City");
        panelSignup.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 50, 27));

        tfCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelSignup.add(tfCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 140, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelSignup.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 100, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("Click Here");
        jLabel20.setToolTipText("");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        panelSignup.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("Go Back to Log-in Menu?");
        panelSignup.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        cbUDomain.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cbUDomain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Infrastructure Related Grievance", "Health Related Grievance", "Environment Related Grievance" }));
        cbUDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUDomainActionPerformed(evt);
            }
        });
        panelSignup.add(cbUDomain, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 200, -1));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/signup2.png"))); // NOI18N
        panelSignup.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 630, 440));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("User Type");
        panelSignup.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 27));

        getContentPane().add(panelSignup);
        panelSignup.setBounds(90, 40, 650, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        error = false;
        
        try {
            if(cbUDomain.isEnabled())
            {
                uDomain=cbUDomain.getSelectedItem().toString();
            }
            else
            {
                uDomain="N/A";
            }
            uname = tfUName.getText();
            password = tfPasswordReg.getText();
            rePassword = tfRePssword.getText();

            email = tfEmailReg.getText();
            mobile = tfMobile.getText();
            address = tfAddress.getText();
            city = tfCity.getText();
            userType = cbUTypeReg.getSelectedIndex();

            if (!validate(email)) {
                errMsg = "Please enter a valid email";
                error = true;
            } else if (password.length() < 8 || password.length() > 20) {
                errMsg = "Password should contain 8-20 characters";
                error = true;
            } else if (!password.equals(rePassword)) {
                errMsg = "Password is not matched";
                error = true;
            }

            if (error) {
                JOptionPane.showMessageDialog(rootPane, errMsg);
            } else {

                // TODO add your handling code here:
                con = DriverManager.getConnection("jdbc:mysql://localhost/ugms", "root", "");

                switch (userType) {
                    case 0:
                        ps = con.prepareStatement("insert into db_user values(?,?,?,?,?,?,?,?)");
                        ps.setString(1, email);
                        ps.setString(2, uname);
                        ps.setString(3, String.valueOf(userType));
                        ps.setString(4, city);
                        ps.setString(5, address);
                        ps.setString(6, mobile);
                        ps.setString(7, password);
                        ps.setString(8, uDomain);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, "USER ADDED SUCCESSFULLY");

                        break;
                    default:
                        ps = con.prepareStatement("insert into db_approval values(?,?,?,?,?,?,?,?,?)");
                        ps.setString(1, email);
                        ps.setString(2, uname);
                        ps.setString(3, String.valueOf(userType));
                        ps.setString(4, city);
                        ps.setString(5, address);
                        ps.setString(6, mobile);
                        ps.setString(7, password);
                        ps.setString(8, "Pending");
                        ps.setString(9, uDomain);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, "Request Accepted...Once Approved you can login");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PGMSLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        panelSignup.setVisible(true);
        panelLogin.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        panelLogin.setVisible(true);
        panelSignup.setVisible(false);
    }//GEN-LAST:event_jLabel20MouseClicked

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        userType = cbUType.getSelectedIndex();
        email = tfEmail.getText();
        password = new String(tfPassword.getPassword());
        String dbName = null;

        if (!validate(email)) {
            JOptionPane.showMessageDialog(rootPane, "Please enter a valid email");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Password cannot be Empty");
        } else {
            switch (userType) {
                case 0:
                    dbName = "db_user";
                    break;
                case 1:
                    dbName = "db_ngo";
                    break;
                case 2:
                    dbName = "db_govt";
                    break;
                case 3:
                    dbName = "db_admin";
                    break;

            }
            try {
                ps = con.prepareStatement("select * from " + dbName + " where u_email=? and u_password=?");
                ps.setString(1, email);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "Invalid Username or Password");
                } else {
                    switch (userType) {
                        case 0:
                            new GrievanceMenu(rs).setVisible(true);
                            this.dispose();
                            break;
                        case 1:
                            new NgoPortal(rs).setVisible(true);
                            this.dispose();
                            break;
                        case 2:
                            new GovtPortal(rs).setVisible(true);
                            this.dispose();
                            break;
                        case 3:
                            new AdminPortal(rs).setVisible(true);
                            this.dispose();
                            //JOptionPane.showMessageDialog(rootPane, "");
                            break;

                    }

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cbUDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUDomainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUDomainActionPerformed

    private void cbUTypeRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUTypeRegActionPerformed
        // TODO add your handling code here:
        if(cbUTypeReg.getSelectedIndex()==2)
        {
            cbUDomain.requestFocus();
            cbUDomain.setEnabled(true);
        }
        else
        {
            cbUDomain.requestFocus();
            cbUDomain.setEnabled(false);
        }
    }//GEN-LAST:event_cbUTypeRegActionPerformed

    private void cbUTypeRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbUTypeRegMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbUTypeRegMouseClicked

    private void cbUTypeRegItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUTypeRegItemStateChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_cbUTypeRegItemStateChanged

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //panelSignup.setVisible(true);
            //panelLogin.setVisible(false);
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            PreparedStatement psAdmin=con.prepareStatement("select u_name,u_email from db_admin");
            ResultSet rsAdmin=psAdmin.executeQuery();
            String strMsg="Admin Names     Emails";
            while(rsAdmin.next())
            {
                strMsg+="\n"+rsAdmin.getString(1)+" - "+rsAdmin.getString(2);
                
            }
            JOptionPane.showMessageDialog(this, strMsg, "Please contact any of the admins", 1);
        } catch (SQLException ex) {
            Logger.getLogger(GrievanceMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PGMSLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PGMSLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PGMSLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PGMSLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PGMSLogin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PGMSLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cbUDomain;
    private javax.swing.JComboBox<String> cbUType;
    private javax.swing.JComboBox<String> cbUTypeReg;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelSignup;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmailReg;
    private javax.swing.JTextField tfMobile;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JPasswordField tfPasswordReg;
    private javax.swing.JPasswordField tfRePssword;
    private javax.swing.JTextField tfUName;
    // End of variables declaration//GEN-END:variables

    private void userAdd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}