/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmsapp;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author urn
 */
public class NgoPortal extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement ps;
    private String email;
    private ResultSet rsGrievance;
    private ResultSet rs;
    int x;
    int ut;
    private boolean up;
    private Image im;
    private ResultSet rsImage;
    private PreparedStatement ps2;
    String DbName;
    private PreparedStatement psFund;
    private PreparedStatement psFundGrav;
    private float totalAmt;
    private long gId;
    private String uname;

    /**
     * Creates new form NgoPortal
     */
    public NgoPortal(ResultSet rs) throws SQLException {
        initComponents();
         btnModify.setEnabled(false);
        //panelMain.setVisible();
        this.rs=rs;
        ut=rs.getInt("u_type");
        email=rs.getString("u_email");
        panelGStatus.setVisible(false);
        lblHello.setText("Hello "+rs.getString("u_name")+", how can we help you? (Choose an option)" );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        btnGStatus = new javax.swing.JButton();
        btnPublicGView = new javax.swing.JButton();
        btnGRegister = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblHello = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelGStatus = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUGrievance = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnStartFunding = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NGO Portal");
        setLocation(new java.awt.Point(200, 200));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnGStatus.setText("View My Grievances");
        btnGStatus.setToolTipText("");
        btnGStatus.setBorder(null);
        btnGStatus.setBorderPainted(false);
        btnGStatus.setContentAreaFilled(false);
        btnGStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGStatus.setInheritsPopupMenu(true);
        btnGStatus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnGStatus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnGStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGStatusActionPerformed(evt);
            }
        });
        panelMain.add(btnGStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, 45));

        btnPublicGView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPublicGView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnPublicGView.setText("View Public Grievances");
        btnPublicGView.setToolTipText("");
        btnPublicGView.setBorder(null);
        btnPublicGView.setBorderPainted(false);
        btnPublicGView.setContentAreaFilled(false);
        btnPublicGView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPublicGView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPublicGView.setInheritsPopupMenu(true);
        btnPublicGView.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnPublicGView.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnPublicGView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicGViewActionPerformed(evt);
            }
        });
        panelMain.add(btnPublicGView, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        btnGRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnGRegister.setText("Register new Grievance");
        btnGRegister.setToolTipText("");
        btnGRegister.setBorder(null);
        btnGRegister.setBorderPainted(false);
        btnGRegister.setContentAreaFilled(false);
        btnGRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGRegister.setInheritsPopupMenu(true);
        btnGRegister.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnGRegister.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnGRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRegisterActionPerformed(evt);
            }
        });
        panelMain.add(btnGRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 47));

        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.setToolTipText("");
        btnLogOut.setBorder(null);
        btnLogOut.setBorderPainted(false);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogOut.setInheritsPopupMenu(true);
        btnLogOut.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnLogOut.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        panelMain.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/user_login128.png"))); // NOI18N
        panelMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 157, -1));

        lblHello.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblHello.setText("Hello xxx, how can we help you? (Choose an option) ");
        panelMain.add(lblHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("NGO Information");
        panelMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Request for changes in");
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        panelMain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        panelMain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 60, 90));

        getContentPane().add(panelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 750, 460));

        panelGStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Select any Grievance to View/Modify", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        panelGStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableUGrievance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableUGrievance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableUGrievance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableUGrievance.setToolTipText("");
        tableUGrievance.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableUGrievance.setAutoscrolls(false);
        tableUGrievance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableUGrievance.setGridColor(new java.awt.Color(0, 0, 0));
        tableUGrievance.setRowMargin(5);
        tableUGrievance.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableUGrievance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUGrievanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUGrievance);

        panelGStatus.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 690, 330));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnBack.setText("Go Back");
        btnBack.setToolTipText("");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.setInheritsPopupMenu(true);
        btnBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelGStatus.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 213, 59));

        btnModify.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnModify.setText("View/Modify");
        btnModify.setToolTipText("");
        btnModify.setBorder(null);
        btnModify.setBorderPainted(false);
        btnModify.setContentAreaFilled(false);
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModify.setInheritsPopupMenu(true);
        btnModify.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnModify.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        panelGStatus.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 213, 59));

        btnStartFunding.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnStartFunding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnStartFunding.setText("Initiate Fundraiser");
        btnStartFunding.setToolTipText("");
        btnStartFunding.setBorder(null);
        btnStartFunding.setBorderPainted(false);
        btnStartFunding.setContentAreaFilled(false);
        btnStartFunding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStartFunding.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStartFunding.setInheritsPopupMenu(true);
        btnStartFunding.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnStartFunding.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnStartFunding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartFundingActionPerformed(evt);
            }
        });
        panelGStatus.add(btnStartFunding, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 213, 59));

        getContentPane().add(panelGStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 730, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGStatusActionPerformed
        try {
            btnStartFunding.setEnabled(false);
            DbName="db_ngo_grievance";
            up=true;
            btnModify.setEnabled(false);
            // TODO add your handling code here:
            panelMain.setVisible(false);
            panelGStatus.setVisible(true);
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            ps=con.prepareStatement("select * from db_ngo_grievance where u_email=?");
            ps.setString(1, email);
            rsGrievance=ps.executeQuery();
            if(!rsGrievance.next())
            {
                JOptionPane.showMessageDialog(rootPane, "No records found");
            }
            rsGrievance.previous();
            tableUGrievance.setModel(buildTableModel(rsGrievance));
            // tableUGrievance=new JTable(buildTableModel(rsGrievance));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }

    }//GEN-LAST:event_btnGStatusActionPerformed

    public DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    private void btnPublicGViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicGViewActionPerformed
try {
    btnStartFunding.setEnabled(false);
    DbName="db_grievance";
            up=false;
            btnModify.setEnabled(false);
            btnStartFunding.setEnabled(false);
            // TODO add your handling code here:
            panelMain.setVisible(false);
            panelGStatus.setVisible(true);
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            ps=con.prepareStatement("select * from db_grievance where g_Category IN('Personal Grievances','Financial Grievances')");
           // ps.setString(1, email);
            rsGrievance=ps.executeQuery();
            if(!rsGrievance.next())
            {
                JOptionPane.showMessageDialog(rootPane, "No records found");
            }
            rsGrievance.previous();
            tableUGrievance.setModel(buildTableModel(rsGrievance));
            // tableUGrievance=new JTable(buildTableModel(rsGrievance));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnPublicGViewActionPerformed

    private void btnGRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRegisterActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GrievanceRegister(rs).setVisible(true);
        
    }//GEN-LAST:event_btnGRegisterActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            new PGMSLogin().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(NgoPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        //panelSignup.setVisible(true);
        //panelLogin.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void tableUGrievanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUGrievanceMouseClicked
        // TODO add your handling code here:
         btnModify.setEnabled(false);
        gId=(long) tableUGrievance.getValueAt(x, 0);
        x=tableUGrievance.getSelectedRow();
        if(x>-1)
        {
            btnModify.setEnabled(true);
            try{
            if((Float)tableUGrievance.getValueAt(x, 11)==0)
            {
                btnStartFunding.setEnabled(true);
            }
            }
            catch(Exception ex)
            {
                 btnStartFunding.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_tableUGrievanceMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        panelMain.setVisible(true);
        panelGStatus.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {
            // TODO add your handling code here:
            String gName=(String) tableUGrievance.getValueAt(x, 2);
            String gCity=(String) tableUGrievance.getValueAt(x, 3);
            String gAddress=(String) tableUGrievance.getValueAt(x, 4);
            String gLandMark=(String) tableUGrievance.getValueAt(x, 5);
            String gDescription=(String) tableUGrievance.getValueAt(x, 7);
            long gId=(long) tableUGrievance.getValueAt(x, 0);
            String gCategory=(String) tableUGrievance.getValueAt(x, 6);
            ps2=con.prepareStatement("select * from "+DbName+" where g_id=?");
            ps2.setLong(1, gId);
            rsImage=ps2.executeQuery();
            if(rsImage.next())
            {
                try {
                    //rsImage.previous();
                    Blob filenameBlob = rsImage.getBlob("g_image");
                    byte[] img = filenameBlob.getBytes(1L,(int)filenameBlob.length());
                    ImageIcon image = new ImageIcon(img);
                    im = image.getImage();
                } catch (SQLException ex) {
                    Logger.getLogger(NgoPortal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Image not found");
            }
            this.dispose();
            new GrievanceUpdate(gId,gName,gCity,gAddress,gCategory,gLandMark,gDescription,im,ut,up,rs).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(NgoPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnStartFundingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartFundingActionPerformed
        try {
            // TODO add your handling code here:
            uname=rs.getString("u_name");
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            psFundGrav=con.prepareStatement("update db_grievance set g_total_fund=? where g_id=?");
           psFundGrav.setFloat(1, 0.01f);
            psFundGrav.setLong(2, gId);
            psFund=con.prepareStatement("insert into db_fundraiser values(?,?,?)");
            psFund.setLong(1, gId);
            psFund.setString(2, uname);
            psFund.setFloat(3, 0.01f);
           
            psFundGrav.executeUpdate();
            psFund.executeUpdate();
            JOptionPane.showMessageDialog(this, "Fundraiser Initiated");
            //tableUGrievance.setModel(buildTableModel(rsGrievance));
        } catch (SQLException ex) {
            Logger.getLogger(NgoPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnStartFundingActionPerformed

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
            java.util.logging.Logger.getLogger(NgoPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NgoPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NgoPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NgoPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NgoPortal(null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NgoPortal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGRegister;
    private javax.swing.JButton btnGStatus;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPublicGView;
    private javax.swing.JButton btnStartFunding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHello;
    private javax.swing.JPanel panelGStatus;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tableUGrievance;
    // End of variables declaration//GEN-END:variables
}
